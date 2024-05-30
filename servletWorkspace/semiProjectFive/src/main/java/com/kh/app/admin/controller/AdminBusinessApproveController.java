package com.kh.app.admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.service.AdminService;

@WebServlet("/admin/business/approve")
public class AdminBusinessApproveController extends HttpServlet{

	private AdminService as;
	public AdminBusinessApproveController() {
		this.as = new AdminService();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		try {
			String[]noArr = req.getParameterValues("no");
			
			//service
			int result = as.approve(noArr);
			
			if(result<1) {

				throw new Exception();
			}
			req.getSession().setAttribute("alertMsg", "사업자 가입 요청"+noArr.length+"개 승인 성공");
			resp.sendRedirect("/app/admin/business/list");
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
	}//method
	
	
	
	
	
}
