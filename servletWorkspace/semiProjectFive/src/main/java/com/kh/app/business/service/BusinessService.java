package com.kh.app.business.service;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.business.dao.BusinessDao;
import com.kh.app.business.vo.BusinessMemberVo;
import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

public class BusinessService {

	private final BusinessDao dao;
	
	public BusinessService() {
		dao = new BusinessDao();
	}
	
	//회원가입
	public int join(BusinessMemberVo vo) throws Exception {
		//비즈니스 로직
		//아이디 유효성 검사
		if(vo.getId().length() < 4) {
			throw new Exception("아이디가 너무 짧습니다.");
		}
		if(vo.getId().contains("admin")) {
			throw new Exception("관리자를 사칭할 수 없습니다.");
		}
		
		//비밀번호 유효성 검사
		if(vo.getPwd().length() < 8) {
			throw new Exception("비밀번호가 너무 짧습니다.");
		}
		
		if(vo.getPwd().length() > 16) {
			throw new Exception("비밀번호가 너무 깁니다.");
		}
		//비밀번호 일치여부 검사
		if(!vo.getPwd().equals(vo.getPwd2())) {
			throw new Exception("비밀번호가 일치하지 않습니다.");
		}
		
		//닉네임 유효성 검사
		if(vo.getNick().contains("관리자")) {
			throw new Exception("닉네임에 부적절한 단어가 포함되어있습니다.");
		}
		
		//DAO 호출
		SqlSession ss = getSqlSession();
		int result = dao.join(ss, vo);
		if(result == 1) {
			ss.commit();
		} else {
			ss.rollback();
		}
		
		ss.close();
		return result;
		
	}
	
	//로그인
	public BusinessMemberVo login(BusinessMemberVo vo) throws Exception {
		
		//비즈니스 로직
		
		//DAO 호출
		SqlSession ss = getSqlSession();
		BusinessMemberVo loginMemberVo = dao.login(ss, vo);
		
		ss.close();
		
		return loginMemberVo;
	}
}
