package com.kh.app.business.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.reservation.service.ReservationService;

@WebServlet("/business/reservation/approve")
public class BusinessReservationApproveController extends HttpServlet {

	private ReservationService rs;
	
	public BusinessReservationApproveController() {
		this.rs = new ReservationService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String[]noArr = req.getParameterValues("no");
			
			//service
			int result = rs.approve(noArr);
			
			if(result<1) {

				throw new Exception();
			}
			req.getSession().setAttribute("alertMsg", "예약 승인 요청"+noArr.length+"개 승인 성공");
			resp.sendRedirect("/app/business/reservation/list");
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
