package com.kh.app.reservation.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.common.vo.PageVo;
import com.kh.app.reservation.vo.ReservationVo;

public class ReservationDao {
	
	//예약하기
	public int book(SqlSession ss, ReservationVo vo) {
		return ss.insert("ReservationMapper.book", vo);
	}
	
	//예약목록조회(사용자)
	public List<ReservationVo> selectByBusiness(SqlSession ss, String no, PageVo pvo) {
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("no", no);
		parameters.put("startNum", pvo.getStartNum());
		parameters.put("endNum", pvo.getEndNum());
		return ss.selectList("ReservationMapper.selectByBusiness", parameters);
	}
	
	//예약번호상세조회
	public ReservationVo getReservationByNo(SqlSession ss, String no) {
		return ss.selectOne("ReservationMapper.getReservationByNo", no);
	}

	//예약갯수조회
	public int getReservationCnt(SqlSession ss) {
		return ss.selectOne("ReservationMapper.getReservationCnt");
	}
	
	//일괄승인하기
	public int approve(SqlSession ss, String[] noArr) {
		System.out.println("noArr : " + noArr);
		for (String x : noArr) {
			System.out.println("x : " + x);
		}
		 return ss.update("ReservationMapper.approve",noArr);
	}
}
