package com.kh.app.business.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.business.vo.BusinessMemberVo;

public class BusinessDao {
	
	//가입하기
	public int join(SqlSession ss, BusinessMemberVo vo) {
		return ss.insert("BusinessMapper.join", vo);
	}
}
