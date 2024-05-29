package com.kh.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.member.service.MemberService;

@WebServlet("/member/id-dup")
public class MemberIdDupCheckController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			// 데꺼
			String id = req.getParameter("id");
			System.out.println("id contr: " + id);
			// 서비스
			MemberService ms = new MemberService();
			boolean isAvailable = ms.checkIdDup(id);
			System.out.println("bool contr: " + isAvailable);
			// 결과

			// 문자열내보내기
			// 전달받은 아이디를 이용하여 디비에 존재하는지 검사
			if (!isAvailable) {
				throw new Exception("중복검사 실패");
			}
			resp.getWriter().write("good");

		} catch (Exception e) {
			e.printStackTrace();
			resp.getWriter().write("bad");
		}

	}

}
