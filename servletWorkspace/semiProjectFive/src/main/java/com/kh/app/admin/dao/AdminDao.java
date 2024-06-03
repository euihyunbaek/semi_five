package com.kh.app.admin.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.vo.AdminVo;
import com.kh.app.business.vo.BusinessMemberVo;
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

	
	//사업자총회원
	public int getBusinessCnt(SqlSession ss) {
	    return ss.selectOne("AdminBusinessMapper.getBusinessCnt");
	}

	//사업자리스트
	public List<BusinessMemberVo> selectBusinessList(SqlSession ss, PageVo pvo) {
		System.out.println("dao pvo :"+pvo);
	    return ss.selectList("AdminBusinessMapper.selectBusinessList", pvo);

	}

	
	//회원 여러개 승인
	public int approve(SqlSession ss, String[] noArr) {
		System.out.println("noArr : " + noArr);
		for (String x : noArr) {
			System.out.println("x : " + x);
		}
		 return ss.update("AdminBusinessMapper.approve",noArr);
	}

	public int delete(SqlSession ss, String[] noArr) {
			
		
		System.out.println("noArr : " + noArr);
		for (String x : noArr) {
			System.out.println("x : " + x);
		}
		 return ss.update("AdminMemberMapper.delete",noArr);

		
	}

	
}
