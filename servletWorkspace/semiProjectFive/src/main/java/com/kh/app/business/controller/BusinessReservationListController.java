package com.kh.app.business.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.business.vo.BusinessMemberVo;
import com.kh.app.common.vo.PageVo;
import com.kh.app.reservation.service.ReservationService;
import com.kh.app.reservation.vo.ReservationVo;

@WebServlet("/business/reservation-list")
public class BusinessReservationListController extends HttpServlet {
	
	private ReservationService rs;
	public BusinessReservationListController() {
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
			}
			
			//페이징
			int listCount = rs.getReservationCnt();
			String x = req.getParameter("pno") == null ? "1" : req.getParameter("pno");
			int currentPage = Integer.parseInt(x);
			int pageLimit = 5;
			int boardLimit = 10;
			PageVo pvo = new PageVo(listCount, currentPage, pageLimit, boardLimit);
			
			//데꺼
			String no = loginBizMemberVo.getNo(); //BusinessMemberVo 의 no
			
			if(no == null || no.length() == 0) {
				throw new Exception("조회할 사업자멤버 번호를 입력하세요");
			}
			
			//복작
			List<ReservationVo> reservationVoList = rs.selectByBusiness(no, pvo);
			req.setAttribute("reservationVoList", reservationVoList);
			req.setAttribute("pvo", pvo);
			
			req.getRequestDispatcher("/WEB-INF/views/business/reservation-list.jsp").forward(req, resp);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
