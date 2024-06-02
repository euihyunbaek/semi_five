package com.kh.app.stay.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.stay.vo.StayPicVo;
import com.kh.app.stay.vo.StayVo;

public class StayDao {

	//숙박업소 등록
	public int register(SqlSession ss, StayVo vo) {
		return ss.insert("StayMapper.register", vo);
	}

	public int insertStayPic(SqlSession ss, List<StayPicVo> stayPicVoList) {
		return ss.insert("StayMapper.insertStayPic", stayPicVoList);
	}

	public List<StayVo> selectStayList(SqlSession ss) {
		return ss.selectList("StayMapper.selectStayList");

	
	
	}
}
