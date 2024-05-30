package com.kh.app.business.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.business.vo.BusinessMemberVo;
import com.kh.app.stay.service.StayService;
import com.kh.app.stay.vo.StayVo;

@WebServlet("/business/stay-register")
public class BusinessStayregisterController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			HttpSession session = req.getSession();
			BusinessMemberVo loginMemberVo = (BusinessMemberVo) session.getAttribute("loginMemberVo");
			
			//로그인 하지 않고 접근하면 에러
			if(loginMemberVo == null) {
				session.setAttribute("alertMsg", "로그인 하셔야 볼 수 있습니다.");
				resp.sendRedirect("/app/business/login");
			} else {
				req.getRequestDispatcher("/WEB-INF/views/business/stay-register.jsp").forward(req, resp);
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			HttpSession session = req.getSession();
			BusinessMemberVo loginMemberVo = (BusinessMemberVo) session.getAttribute("loginMemberVo");
			
			//데이터 꺼내기 (아직 사진 X)
			String storeName = req.getParameter("name");
			String phone = req.getParameter("phone");
			String address = req.getParameter("address");
			String internetAd = req.getParameter("webpage");
			String email = req.getParameter("email");
			String businessNo = req.getParameter("business-number");
			String businessMemberNo = loginMemberVo.getNo();
			String stayCode = req.getParameter("accomo-type");
			String waterPlayYn = req.getParameter("waterplay");
			String typeDog = req.getParameter("dog-size");
			
			StayVo vo = new StayVo();
			vo.setStoreName(storeName);
			vo.setPhone(phone);
			vo.setAddress(address);
			vo.setInternetAd(internetAd);
			vo.setEmail(email);
			vo.setBusinessNo(businessNo);
			vo.setBusinessMemberNo(businessMemberNo);
			vo.setStayCode(stayCode);
			vo.setWaterPlayYn(waterPlayYn);
			vo.setTypeDog(typeDog);
			
			//서비스 호출
			StayService ss = new StayService();
			int result = ss.register(vo);
			
			//결과 처리
			if(result == 1) {
				session.setAttribute("alertMsg", "숙소등록 성공 !!");
			} else {
				session.setAttribute("alertMsg", "숙소등록 실패 ...");
			}
			
			resp.sendRedirect("/app/business/mypage");
			
		} catch(Exception e) {
			System.out.println("[ERROR-M0003] " + e.getMessage());
			e.printStackTrace();
			req.setAttribute("errMsg", "[ERROR-M0003] " + e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
		
		
	}
}
