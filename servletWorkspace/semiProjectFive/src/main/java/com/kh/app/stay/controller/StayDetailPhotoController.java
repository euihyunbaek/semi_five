package com.kh.app.stay.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.stay.service.StayService;

@WebServlet("/stay/detail/photo")
public class StayDetailPhotoController extends HttpServlet{

	private StayService sts;
	public StayDetailPhotoController() {
		this.sts = new StayService();
	}

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	
	
}
