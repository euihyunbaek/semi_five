package com.kh.app.member.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;


@MultipartConfig(
		maxFileSize = 1024*1024*10,
		maxRequestSize = 1024*1024*50,
		fileSizeThreshold = 1024*1024*10
		)


@WebServlet("/member/edit")
public class MemberEditController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			HttpSession session = req.getSession();
			MemberVo loginMemberVo = (MemberVo)session.getAttribute("loginMemberVo");
			if(loginMemberVo == null) {
				throw new Exception("로그인 하고 오세요");
			}
			req.getRequestDispatcher("/WEB-INF/views/member/edit.jsp").forward(req, resp);
		}catch(Exception e ) {
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
		
	
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			//데꺼
			HttpSession session = req.getSession();
			MemberVo loginMemberVo = (MemberVo)session.getAttribute("loginMemberVo");
			String no = loginMemberVo.getNo();
					
			
			
//			String no = req.getParameter("no");
			String name = req.getParameter("name");
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");
			String pwd2 = req.getParameter("pwd2");
			String nick = req.getParameter("nick");
			String phone = req.getParameter("phone");
			String email = req.getParameter("email");
			Part picUrl = req.getPart("picUrl");
			
	        String changeName = "";
	        if(picUrl != null && picUrl.getSize() > 0) {  // picUrl이 null이 아닌지 확인
	            String originFileName = picUrl.getSubmittedFileName();
	            InputStream is = picUrl.getInputStream();

//	            String path = "D:\\semiProject\\servletWorkspace\\semiProjectFive\\src\\main\\webapp\\resources\\upload\\memberprofile\\";
	            String path = "D:\\SEMIFIVE\\servletWorkspace\\semiProjectFive\\src\\main\\webapp\\resources\\upload\\memberprofile\\";
//	            String path = "C:\\Users\\user\\dev\\semi_five\\servletWorkspace\\semiProjectFive\\src\\main\\webapp\\resources\\upload\\memberpfofile\\";

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
			
			
			//데이터뭉치기			
			MemberVo vo = new MemberVo();
			vo.setNo(no);
			
			
			vo.setName(name);
			vo.setId(id);
			vo.setPwd(pwd);
			vo.setPwd2(pwd2);
			vo.setNick(nick);
			vo.setPhone(phone);
			vo.setEmail(email);
			vo.setPicUrl(changeName);
							
			//서비스호출
			MemberService ms = new MemberService();
			int result = ms.edit(vo);

			//결과	
			if(result!=1) {
				throw new Exception("회원정보 수정 실패");			
			}
			session.setAttribute("alertMsg","회원정보 수정 성공!");
			session.removeAttribute("loginMemberVo");
			resp.sendRedirect("/app/home");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			req.setAttribute("errMsg", "회원정보 수정 중 에러 발생...");
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
		
	
	}
	
	
	
}
