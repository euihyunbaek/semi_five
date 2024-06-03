package com.kh.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.admin.vo.AdminVo;
import com.kh.app.member.vo.MemberVo;

@WebServlet("/member/menu")
public class MemberMenuController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		MemberVo loginMemberVo = (MemberVo)session.getAttribute("loginMemberVo");

		if(loginMemberVo != null) {
			req.getRequestDispatcher("/WEB-INF/views/member/mypage/edit.jsp").forward(req, resp);

		} else {
			session.setAttribute("alertMsg", "로그인이 필요합니다.");
			//로그인 페이지로 보냄
			resp.sendRedirect(req.getContextPath() + "/login");	
	
	}
	
	
}
}
