package com.kh.app.member.service;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.member.dao.MemberDao;
import com.kh.app.member.vo.MemberVo;
import com.kh.app.reservation.vo.ReservationVo;

import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import java.util.List;


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

//회원정보수정
public int edit(MemberVo vo) throws Exception {
	
	 // 비즈니스 로직
    if(!vo.getPwd().equals(vo.getPwd2())) {
       throw new Exception("비밀번호 일치하지 않음");
    }
    
    // DAO 호출
	SqlSession ss = getSqlSession();
    int result = dao.edit(ss, vo);
	System.out.println("service vo : "+ vo);

    if(result == 1) {
       ss.commit();
    } else {
       ss.rollback();
    }
    ss.close();
    
    return result;
}

//아이디 중복검사
public boolean checkIdDup(String id) throws Exception {
	
	SqlSession ss = getSqlSession();
	int result = dao.checkIdDup(ss, id);
	System.out.println("result dao: " + result);
	ss.close();
	return result == 0;
}

//회원탈퇴
public int quit(String no) throws Exception {
	SqlSession ss = getSqlSession();
	
    int result = dao.quit(ss, no);
    
    if(result == 1) {
       ss.commit();
    } else {
       ss.rollback();
    }
    ss.close();
    
    return result;
}

public List<ReservationVo> getReservationList(String no) throws Exception{
	
	SqlSession ss = getSqlSession();
	List<ReservationVo>myResList= dao.getReservationList(ss, no);
	ss.close();
	return myResList;

}

   
	
}
