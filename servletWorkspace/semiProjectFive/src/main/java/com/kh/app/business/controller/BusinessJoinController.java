package com.kh.app.business.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.business.service.BusinessService;
import com.kh.app.business.vo.BusinessMemberVo;

@WebServlet("/business/join")
public class BusinessJoinController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/business/join-business.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			//데이터 꺼내기
			String name = req.getParameter("name");
			String nick = req.getParameter("nick");
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");
			String pwd2 = req.getParameter("pwd2");
			
			BusinessMemberVo vo = new BusinessMemberVo();
			vo.setName(name);
			vo.setNick(nick);
			vo.setId(id);
			vo.setPwd(pwd);
			vo.setPwd2(pwd2);
			
			//서비스 호출
			BusinessService bs = new BusinessService();
			int result = bs.join(vo);
			
			//결과처리
			
			if(result == 1) {
				System.out.println("iffff");
				req.setAttribute("alertMsg", "회원가입 성공 !!");
			} else {
				System.out.println("elseee");
				req.setAttribute("alertMsg", "회원가입 실패 ...");
			}
			
			resp.sendRedirect("/app/business/login");
			
		} catch(Exception e) {
			System.out.println("[ERROR-M0001] " + e.getMessage());
			e.printStackTrace();
			req.setAttribute("errMsg", "[ERROR-M0001] " + e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
			
		}
		
		
	}//method
}//class
