package com.kh.app.admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.service.AdminService;

@WebServlet("/admin/member/delete")
public class AdminMemberDeleteController extends HttpServlet{

	
	private AdminService as;
	public AdminMemberDeleteController() {
		this.as = new AdminService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String[]noArr = req.getParameterValues("no");
			
			//service
			int result = as.delete(noArr);
			
			if(result<1) {

				throw new Exception();
			}
			req.getSession().setAttribute("alertMsg", "회원 추방 결과 : "+noArr.length);
			resp.sendRedirect("/app/admin/member/list");
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
	
	
	}
	
	
}
