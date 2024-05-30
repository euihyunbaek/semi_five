package com.kh.app.stay.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.stay.vo.StayVo;

public class StayDao {

	//숙박업소 등록
	public int register(SqlSession ss, StayVo vo) {
		return ss.insert("StayMapper.register", vo);
	}
}
