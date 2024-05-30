package com.kh.app.admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.admin.service.AdminService;
import com.kh.app.admin.vo.AdminVo;
import com.kh.app.business.vo.BusinessMemberVo;
import com.kh.app.common.vo.PageVo;

@WebServlet("/admin/business/list")
public class AdminBusinessListController extends HttpServlet{

	
	//반복호출되는생성자 필드로빼기
	private AdminService as;
	public AdminBusinessListController() {
		this.as = new AdminService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		try {
			HttpSession session = req.getSession();
			AdminVo loginAdminVo = (AdminVo) session.getAttribute("loginAdminVo");
			//관리자가 아니면 관리자메뉴 하위 경로에 접근하지 못하게 막기

			if(loginAdminVo != null) {
			
			int listCount = as.getBusinessCnt();
			String x = req.getParameter("pno") == null ? "1" : req.getParameter("pno");
			int currentPage = Integer.parseInt(x);
			int pageLimit = 5;
			int boardLimit = 10;
			PageVo pvo = new PageVo(listCount, currentPage, pageLimit, boardLimit);

			//복잡한작업. 사업자객체 리스트로만들고 페이지정보 서비스메소드에 전달
			List<BusinessMemberVo>voList = as.selectBusinessList(pvo);
			//결과
			System.out.println("voList : " + voList);
			System.out.println("controller pvo :"+pvo);
			req.setAttribute("voList", voList);
			req.setAttribute("pvo", pvo);
			
			
			req.getRequestDispatcher("/WEB-INF/views/admin/business/list.jsp").forward(req, resp);

			} else {
				session.setAttribute("alertMsg", "비정상적인 접근입니다. 관리자 로그인이 필요합니다.");
				resp.sendRedirect(req.getContextPath() + "/admin/login");			
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());

			e.printStackTrace();
			req.setAttribute("alertMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);

		}
		
		
		
		
	
	
	}
	
}
