package com.kh.app.business.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.business.service.BusinessService;
import com.kh.app.business.vo.BusinessMemberVo;

@WebServlet("/business/login")
public class BusinessLoginController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/business/login-business.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			//세션 준비
			HttpSession session = req.getSession();
			
			//데이터 꺼내기
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");
			
			BusinessMemberVo vo = new BusinessMemberVo();
			vo.setId(id);
			vo.setPwd(pwd);
			
			//비즈니스 로직
			BusinessService bs = new BusinessService();
			BusinessMemberVo loginMemberVo = bs.login(vo);
			
			//결과 처리
			if(loginMemberVo != null) {
				session.setAttribute("alertMsg", "로그인성공!!");
				session.setAttribute("loginMemberVo", loginMemberVo);
			} else {
				session.setAttribute("alertMsg", "로그인 실패...");
			}
			resp.sendRedirect("/app/home");
			
		} catch(Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", "[ERROR-M00012] 로그인 중 에러 발생 ...");
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
		
		
		
	}
}