package com.kh.app.business.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.business.vo.BusinessMemberVo;
import com.kh.app.reservation.service.ReservationService;
import com.kh.app.reservation.vo.ReservationVo;

@WebServlet("/reservation/detail")
public class BusinessReservationDetailController extends HttpServlet {

	private ReservationService rs;
	public BusinessReservationDetailController() {
		this.rs = new ReservationService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			HttpSession session = req.getSession();
			BusinessMemberVo loginBizMemberVo = (BusinessMemberVo) session.getAttribute("loginBizMemberVo");
			
			//로그인 하지 않고 접근하면 에러
			if(loginBizMemberVo == null) {
				session.setAttribute("alertMsg", "로그인 하셔야 볼 수 있습니다.");
				resp.sendRedirect("/app/business/login");
			} else {
				//데꺼
				String no = req.getParameter("no");
				if(no == null || no.length() == 0) {
					throw new Exception("조회할 예약 번호를 입력하세요");
				}
				
				//복작
				ReservationVo vo = rs.getReservationByNo(no);
				System.out.println("Controller reservationVo: " + vo);
				
				if(vo == null) {
					throw new Exception("예약 조회 실패 ...");
				}
				
				//예약 정보를 세션에 저장
				req.setAttribute("vo", vo);
				req.getRequestDispatcher("/WEB-INF/views/reservation/detail.jsp").forward(req, resp);
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
		
	}
}
