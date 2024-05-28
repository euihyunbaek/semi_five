package com.kh.app.member.service;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.member.dao.MemberDao;
import com.kh.app.member.vo.MemberVo;
import static com.kh.app.db.SqlSessionTemplate.getSqlSession;


public class MemberService {
	
   private MemberDao dao;
   
   public MemberService() {
      dao = new MemberDao();
   }
   
   
   public int join(MemberVo vo) throws Exception {
	      // 비지니스 로직
	      // 아이디 유효성 검사
	   System.out.println("여기는 서비스"+vo);
//	      if(vo.getId().length() < 4) {
//	         throw new Exception("아이디가 너무 짧습니다.");
//	      }
//	      // 비밀번호 유효성 검사
//	      if(vo.getPwd().length() < 4) {
//	         throw new Exception("비밀번호가 너무 짧습니다.");
//	      }
//	      // 비밀번호 일치여부 검사
//	      if(!vo.getPwd().equals(vo.getPwd2())) {
//	         throw new Exception("비밀번호가 일치하지 않습니다.");
//	      }
//	      // 닉네임 유효성 검사
//	      if(vo.getNick().contains("관리자")) {
//	         throw new Exception("닉네임에 부적절한 단어가 포함되어있습니다.");
//	      }
	      
	      // DAO 호출
			SqlSession ss = getSqlSession();
	      int result = dao.join(ss,vo);
	      
	      if(result == 1) {
	         ss.commit();
	      } else {
	         ss.rollback();
	      }
	      
	      ss.close();
	      
	      return result;
	   }


public MemberVo login(MemberVo vo) throws Exception {

	SqlSession ss = getSqlSession();
	MemberVo loginMemberVo = dao.login(ss,vo);
	ss.close();
	return loginMemberVo;
}
   
	
}
