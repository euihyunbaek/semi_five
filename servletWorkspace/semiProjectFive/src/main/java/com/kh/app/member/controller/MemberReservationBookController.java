package com.kh.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.business.vo.BusinessMemberVo;
import com.kh.app.member.vo.MemberVo;
import com.kh.app.stay.vo.StayVo;

@WebServlet("/reservation/book")
public class MemberReservationBookController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			HttpSession session = req.getSession();
			MemberVo loginMemberVo = (MemberVo) session.getAttribute("loginMemberVo"); //로그인한 멤버 정보
			StayVo stayInfoVo = (StayVo) session.getAttribute("stayInfoVo");
			System.out.println(stayInfoVo);
			
			//로그인 하지 않고 접근하면 에러
			if(loginMemberVo == null) {
				session.setAttribute("alertMsg", "로그인 하셔야 볼 수 있습니다.");
				resp.sendRedirect("/app/business/login");
			} else {
				req.getRequestDispatcher("/WEB-INF/views/business/login.jsp").forward(req, resp);
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//세션에서 가져오기
		HttpSession session = req.getSession();
		MemberVo loginMemberVo = (MemberVo)session.getAttribute("loginMemberVo");
		StayVo stayInfoVo = (StayVo) session.getAttribute("stayInfoVo");
		
		//데이터 꺼내기
		String userNo = loginMemberVo.getNo();
		String checkInDate = req.getParameter("checkin");
		String checkOutDate = req.getParameter("checkout");
		String totalGuest = req.getParameter("total-guest");
		String totalPrice = req.getParameter("total-price");
		String stayNo = stayInfoVo.getNo();
		String countDog = req.getParameter("count-dog");
		
	}
}
