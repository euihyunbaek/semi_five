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



@MultipartConfig(
		maxFileSize = 1024*1024*10,
		maxRequestSize = 1024*1024*50,
		fileSizeThreshold = 1024*1024*10
		)


@WebServlet("/member/join")
public class MemberJoinController extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/join.jsp").forward(req, resp);

	}//dog
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    try {
	        HttpSession session = req.getSession();

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

	            String path = "D:\\semiProject\\servletWorkspace\\semiProjectFive\\src\\main\\webapp\\resources\\upload\\memberprofile\\";
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

	        MemberVo vo = new MemberVo();
	        vo.setId(id);
	        vo.setPwd(pwd);
	        vo.setPwd2(pwd2);
	        vo.setNick(nick);
	        vo.setName(name);
	        vo.setPhone(phone);
	        vo.setEmail(email);
	        vo.setPicUrl(changeName);
	        
	        MemberService ms = new MemberService();
	        int result = ms.join(vo);
	        
	        if(result == 1) {
	            session.setAttribute("alertMsg", "회원가입성공! 로그인 페이지로 이동합니다");
	            resp.sendRedirect(req.getContextPath() + "/member/login");
	        } else {
	            session.setAttribute("alertMsg", "회원가입실패, 홈으로 이동합니다...");
	            resp.sendRedirect(req.getContextPath() + "/home");
	        }

	    } catch (Exception e) {
	        System.out.println("[ERROR-M001] " + e.getMessage());
	        e.printStackTrace();
	        req.setAttribute("errMsg", e.getMessage());
	        req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
	    }
	}
		
		
		
		
		
}
	
