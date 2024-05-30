package com.kh.app.admin.service;

import com.kh.app.admin.dao.AdminDao;
import com.kh.app.admin.vo.AdminVo;
import com.kh.app.common.vo.PageVo;
import com.kh.app.member.vo.MemberVo;

import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class AdminService {
	
	//자주 쓸 dao필드로빼기
	private final AdminDao dao;
	
	public AdminService() {
		this.dao =  new AdminDao();
	}
	
	
	
	public AdminVo login(AdminVo vo) throws Exception {
		SqlSession ss = getSqlSession();
		AdminVo loginAdminVo = dao.login(ss,vo);
		ss.close();
		return loginAdminVo;
	
	}




	//총회원수
	public int getMemberCnt() throws Exception {
		SqlSession ss = getSqlSession();
		int cnt = dao.getMemberCnt(ss);
		ss.close();
		return cnt;
	}

//전체회원목록
	public List<MemberVo> selectMemberList(PageVo pvo) throws Exception {
		SqlSession ss = getSqlSession();
		List<MemberVo>voList = dao.selectMemberList(ss,pvo);
		ss.close();
		return voList;
	}



}
