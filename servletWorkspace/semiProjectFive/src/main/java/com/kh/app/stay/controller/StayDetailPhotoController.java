package com.kh.app.stay.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.stay.service.StayService;
import com.kh.app.stay.vo.StayPicVo;

@WebServlet("/stay/detail/photo")
public class StayDetailPhotoController extends HttpServlet{

	private StayService sts;
	public StayDetailPhotoController() {
		this.sts = new StayService();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		try {

			
			String no = req.getParameter("no");
			List<StayPicVo> picVoList = sts.getStayPic(no);
			
			req.setAttribute("picVoList", picVoList);
			req.getRequestDispatcher("/WEB-INF/views/staydetail/photo.jsp").forward(req, resp);
		
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		
		}
		
		
	
	
	}
	
	
	
}
