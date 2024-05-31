package com.kh.app.business.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;


import com.kh.app.business.vo.BusinessMemberVo;
import com.kh.app.stay.service.StayService;
import com.kh.app.stay.vo.StayPicVo;
import com.kh.app.stay.vo.StayVo;
import com.kh.app.util.file.FileUpload;

@MultipartConfig(
		maxFileSize = 1024*1024*50,	//1024byte * 1024 * 50 = 50MB
		maxRequestSize = 1024*1024*500,
		fileSizeThreshold = 1024*1024*50
)

@WebServlet("/business/stay-register")
public class BusinessStayregisterController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			HttpSession session = req.getSession();
			BusinessMemberVo loginBizMemberVo = (BusinessMemberVo) session.getAttribute("loginBizMemberVo");
			
			//로그인 하지 않고 접근하면 에러
			if(loginBizMemberVo == null) {
				session.setAttribute("alertMsg", "로그인 하셔야 볼 수 있습니다.");
				resp.sendRedirect("/app/business/login");
			} else {
				req.getRequestDispatcher("/WEB-INF/views/business/stay-register.jsp").forward(req, resp);
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			HttpSession session = req.getSession();
			BusinessMemberVo loginBizMemberVo = (BusinessMemberVo) session.getAttribute("loginBizMemberVo");
			
			//데이터 꺼내기 (아직 사진 제외)
			String storeName = req.getParameter("name");
			String phone = req.getParameter("phone");
			String address = req.getParameter("address");
			String internetAd = req.getParameter("webpage");
			String email = req.getParameter("email");
			String businessNo = req.getParameter("business-number");
			String businessMemberNo = loginBizMemberVo.getNo();
			String stayCode = req.getParameter("accomo-type");
			String waterPlayYn = req.getParameter("waterplay");
			String typeDog = req.getParameter("dog-size");
			String roomName = req.getParameter("room");
			String capacity = req.getParameter("capacity");
			String price = req.getParameter("price");
			
			///-------------------썸네일사진 꺼내기----------------------------///
	        Part thumbnail = req.getPart("thumbnail");

	        String changeName = "";
	        if(thumbnail != null && thumbnail.getSize() > 0) {  
	            String originFileName = thumbnail.getSubmittedFileName();
	            InputStream is = thumbnail.getInputStream();
	            //경로지정(민정노트북절대경로. 각자 테스트할 작업환경에 맞게 수정해야함)
	            String path = "C:\\Users\\user\\dev\\semi_five\\servletWorkspace\\semiProjectFive\\src\\main\\webapp\\resources\\upload\\thumbnail\\";
//	            String path = "D:\\semiProject\\servletWorkspace\\semiProjectFive\\src\\main\\webapp\\resources\\upload\\thumbnail\\";
	            String random = UUID.randomUUID().toString();
	            String ext = originFileName.substring(originFileName.lastIndexOf("."));
	            changeName = System.currentTimeMillis() + "_" + random + ext;
	            FileOutputStream fos = new FileOutputStream(path + changeName);

	            byte[] buf = new byte[1024];
	            int size = 0;
	            while ((size = is.read(buf)) != -1) {
	                fos.write(buf, 0, size);
	            }
	            is.close();
	            fos.close();
	        }
			
			
			
			
			
			
			StayVo vo = new StayVo();
			vo.setStoreName(storeName);
			vo.setPhone(phone);
			vo.setAddress(address);
			vo.setInternetAd(internetAd);
			vo.setEmail(email);
			vo.setBusinessNo(businessNo);
			vo.setBusinessMemberNo(businessMemberNo);
			vo.setStayCode(stayCode);
			vo.setWaterPlayYn(waterPlayYn);
			vo.setTypeDog(typeDog);
			vo.setRoomName(roomName);
			vo.setCapacity(capacity);
			vo.setPrice(price);
	        vo.setThumbnail(changeName);

			
			System.out.println(loginBizMemberVo);
			System.out.println(vo);
			System.out.println("controller thumbnail : "+vo.getThumbnail());
			
			
			
			// 데이터 꺼내기(사진 여러장)

			Collection<Part> parts = req.getParts();
			List<Part> fileList = new ArrayList<Part>();
			for(Part part : parts) {
				if(part.getContentType() != null) {
					fileList.add(part);
				}
			}
			
			System.out.println(fileList);
			
			//서버에 파일 업로드 (여러장)
			List<StayPicVo> picVoList = new ArrayList<StayPicVo>();
			for(Part f : fileList) {
				StayPicVo picVo = FileUpload.safeFile(f);
				picVoList.add(picVo);
			}
			
			System.out.println(picVoList);
			
			//서비스 호출
			StayService stayss = new StayService();
			int result = stayss.register(vo, picVoList);
			
			//결과 처리
			if(result >= 1) { //여러개의 사진을 올리면 1 이상이 될 수 있으므로 조건식을 1 이상으로 수정
				session.setAttribute("alertMsg", "숙소등록 성공 !!");
			} else {
				session.setAttribute("alertMsg", "숙소등록 실패 ...");
			}
			
			resp.sendRedirect("/app/business/mypage");
			
		} catch(Exception e) {
			System.out.println("[ERROR-M0003] " + e.getMessage());
			e.printStackTrace();
			req.setAttribute("errMsg", "[ERROR-M0003] " + e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
		
		
	}
}
