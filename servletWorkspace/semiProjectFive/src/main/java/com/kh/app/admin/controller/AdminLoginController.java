package com.kh.app.admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.admin.service.AdminService;
import com.kh.app.admin.vo.AdminVo;

@WebServlet("/admin/login")
public class AdminLoginController extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
		HttpSession session = req.getSession();
			
			//데꺼
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");
			
			AdminVo vo = new AdminVo();
			vo.setId(id);
			vo.setPwd(pwd);
			
			AdminService as = new AdminService();
			AdminVo loginAdminVo = as.login(vo);
			
			//결과(화면==문자열내보내기)
			if(loginAdminVo != null) {
				session.setAttribute("alertMsg", "관리자 로그인성공!!!");
				session.setAttribute("loginAdminVo", loginAdminVo);
				resp.sendRedirect("/app/admin/menu");			
				
			}else {
				session.setAttribute("alertMsg", "관리자 로그인 실패...");
				resp.sendRedirect("/app/home");			
			}
		}catch (Exception e) {
			e.printStackTrace();			
		}
		
		
	}
	
	
}
