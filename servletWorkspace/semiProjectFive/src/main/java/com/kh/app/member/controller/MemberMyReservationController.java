package com.kh.app.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;
import com.kh.app.reservation.vo.ReservationVo;

@WebServlet("/member/myreservation")
public class MemberMyReservationController extends HttpServlet{
	
	
	private MemberService ms;
	public MemberMyReservationController () {
		this.ms = new MemberService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		try {
			HttpSession session = req.getSession();
			MemberVo loginMemberVo = (MemberVo)session.getAttribute("loginMemberVo");
			
			if(loginMemberVo != null) {
				
				
				String no = loginMemberVo.getNo();
				List<ReservationVo>myResList = ms.getReservationList(no);
				System.out.println("myreservation con : " + no);
				System.out.println("myreservation con: " + myResList);
				
				
				req.setAttribute("myResList", myResList);
				
				
				req.getRequestDispatcher("/WEB-INF/views/member/mypage/myreservation.jsp").forward(req, resp);

			} else {
				session.setAttribute("alertMsg", "로그인이 필요합니다.");
				//로그인 페이지로 보냄
				resp.sendRedirect(req.getContextPath() + "/login");	
		
		}
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		

	}
}
