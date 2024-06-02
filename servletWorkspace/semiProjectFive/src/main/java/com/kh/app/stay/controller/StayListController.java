package com.kh.app.stay.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.stay.service.StayService;
import com.kh.app.stay.vo.StayVo;

@WebServlet("/home")
public class StayListController extends HttpServlet {

	private StayService sts;
	public StayListController() {
		this.sts = new StayService();
	}

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			//복작
			List<StayVo>voList = sts.selectStayList();
			
			System.out.println("voList:"+ voList);
			//서블릿이 jsp에 voList전달
			req.setAttribute("voList", voList);
			req.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);
		}catch (Exception e) {
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
