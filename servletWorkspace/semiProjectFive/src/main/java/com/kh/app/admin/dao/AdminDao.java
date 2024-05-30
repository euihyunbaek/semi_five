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

	    Integer result = ss.selectOne("AdminMemberMapper.getMemberCnt");
	    return result != null ? result.intValue() : 0; // 결과가 null일 경우 0으로 처리
	
	}

	public List<MemberVo> selectMemberList(SqlSession ss, PageVo pvo) {
	
	    return ss.selectList("AdminMemberMapper.selectMemberList", pvo);

		
	}

	
}
