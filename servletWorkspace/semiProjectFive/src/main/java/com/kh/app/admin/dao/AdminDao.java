package com.kh.app.admin.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.vo.AdminVo;
import com.kh.app.common.vo.PageVo;
import com.kh.app.member.vo.MemberVo;

public class AdminDao {

	
	public AdminVo login(SqlSession ss, AdminVo vo) throws Exception {
		return ss.selectOne("AdminMapper.login", vo);
		
	}

	public int getMemberCnt(SqlSession ss) {

	    return ss.selectOne("AdminMemberMapper.getMemberCnt");
	    
	
	}

	public List<MemberVo> selectMemberList(SqlSession ss, PageVo pvo) {
		System.out.println("dao pvo :"+pvo);

	    return ss.selectList("AdminMemberMapper.selectMemberList", pvo);

		
	}

	
}
