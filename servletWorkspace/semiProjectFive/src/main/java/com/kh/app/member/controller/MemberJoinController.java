package com.kh.app.member.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;



//@MultipartConfig(
//		maxFileSize = 1024*1024*10,
//		maxRequestSize = 1024*1024*50,
//		fileSizeThreshold = 1024*1024*10
//		)


@WebServlet("/member/join")
public class MemberJoinController extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/join.jsp").forward(req, resp);

	}//dog
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			String name = req.getParameter("name");
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");
			String pwd2 = req.getParameter("pwd2");
			String nick = req.getParameter("nick");
			String phone = req.getParameter("phone");
			String email = req.getParameter("email");
//			Part picUrl =req.getPart("profile");
			
			
//			String changeName ="";
//			if(picUrl.getSize() >0 ) {//profile!=null로 검사하면 안됨 파일첨부안해도 profile객체가 만들어지기 때문
//				//사진파일을 서버에 저장하기
//				String originFileName = picUrl.getSubmittedFileName();
//				InputStream is = picUrl.getInputStream();
//				
//				String path = "D:\\semiProject\\servletWorkspace\\semiProjectFive\\src\\main\\webapp\\resources\\upload\\";
//				String random = UUID.randomUUID().toString();
//				String ext = originFileName.substring(originFileName.lastIndexOf("."));
//				changeName = System.currentTimeMillis() + "_" + random + ext;
//				FileOutputStream fos = new FileOutputStream(path + changeName);
//				
//				byte[] buf = new byte[1024];
//				int size = 0;
//				while( (size=is.read(buf)) != -1 ) {
//					fos.write(buf , 0, size);
//				}
//				is.close();
//				fos.close();
//			}
			
			MemberVo vo = new MemberVo();
			vo.setId(id);
			vo.setPwd(pwd);
			vo.setPwd2(pwd2);
			vo.setNick(nick);
			vo.setName(name);
			vo.setPhone(phone);
			vo.setEmail(email);
//			vo.setPicUrl(changeName);
			System.out.println("여기는  vo아래"+vo);
		
			
			MemberService ms = new MemberService();
			int result = ms.join(vo);
			System.out.println("여기는서비스vo아래"+vo);
			if(result ==1) {
				req.setAttribute("resultMsg", "회원가입성공");
			}else {
				req.setAttribute("resultMsg", "회원가입실패");
			}
			resp.sendRedirect("/app/member/login");
			

			
		}catch (Exception e) {
			
			System.out.println("[ERROR-M001]"+e.getMessage());
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);		
			
		}
		
		}//dop
		
		
		
		
		
}
	
