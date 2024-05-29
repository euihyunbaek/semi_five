package com.kh.app.member.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.member.vo.MemberVo;

public class MemberDao {
	
	public int join(SqlSession ss, MemberVo vo) throws Exception {
		return ss.insert("MemberMapper.join",vo);
	
	}

	public MemberVo login(SqlSession ss, MemberVo vo) throws Exception {
		return ss.selectOne("MemberMapper.login", vo);
		
		
	}

	public int edit(SqlSession ss, MemberVo vo) {
		return ss.update("MemberMapper.edit",vo);
	}

	public int checkIdDup(SqlSession ss, String id) {
		System.out.println("check id dao"+id);
		return ss.selectOne("MemberMapper.checkIdDup",id); 		
	}
}








