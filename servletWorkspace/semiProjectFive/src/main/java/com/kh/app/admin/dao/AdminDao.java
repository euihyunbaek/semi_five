package com.kh.app.admin.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.vo.AdminVo;
import com.kh.app.member.vo.MemberVo;

public class AdminDao {

	
	public AdminVo login(SqlSession ss, AdminVo vo) throws Exception {
		return ss.selectOne("AdminMapper.login", vo);
		
	}

	
}
