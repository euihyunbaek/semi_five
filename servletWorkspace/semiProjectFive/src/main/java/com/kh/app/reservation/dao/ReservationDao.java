package com.kh.app.reservation.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.reservation.vo.ReservationVo;

public class ReservationDao {
	
	//예약하기
	public int book(SqlSession ss, ReservationVo vo) {
		return ss.insert("ReservationMapper.book", vo);
	}
}
