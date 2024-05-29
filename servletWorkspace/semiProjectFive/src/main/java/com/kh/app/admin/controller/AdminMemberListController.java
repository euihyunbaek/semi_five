package com.kh.app.admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.admin.vo.AdminVo;


@WebServlet("/admin/member/list")
public class AdminMemberListController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		AdminVo loginAdminVo = (AdminVo) session.getAttribute("loginAdminVo");
		//관리자가 아니면 관리자메뉴 하위 경로에 접근하지 못하게 막기
		if(loginAdminVo != null) {
			req.getRequestDispatcher("/WEB-INF/views/admin/member/list.jsp").forward(req, resp);

		} else {
			session.setAttribute("alertMsg", "비정상적인 접근입니다. 관리자 로그인이 필요합니다.");
			resp.sendRedirect(req.getContextPath() + "/admin/login");			
		}
	}
	
	
}
