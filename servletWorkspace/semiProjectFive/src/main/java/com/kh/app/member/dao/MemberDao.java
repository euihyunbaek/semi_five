package com.kh.app.member.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.member.vo.MemberVo;

public class MemberDao {
	
	public int join(SqlSession ss, MemberVo vo) throws Exception {
		System.out.println("dao"+vo);
		return ss.insert("MemberMapper.join",vo);
	
	}

	public MemberVo login(SqlSession ss, MemberVo vo) throws Exception {
		return ss.selectOne("MemberMapper.login", vo);
		
		
	}
}








