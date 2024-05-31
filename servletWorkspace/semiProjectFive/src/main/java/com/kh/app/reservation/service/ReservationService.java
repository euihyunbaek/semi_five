package com.kh.app.reservation.service;

import org.apache.ibatis.session.SqlSession;
import static com.kh.app.db.SqlSessionTemplate.getSqlSession;
import com.kh.app.reservation.dao.ReservationDao;
import com.kh.app.reservation.vo.ReservationVo;

public class ReservationService {

	private final ReservationDao dao;
	
	public ReservationService() {
		dao = new ReservationDao();
	}
	
	//예약신청
	public int book(ReservationVo vo) throws Exception {
		
		//비즈니스 로직
		//체크아웃 날짜가 체크인 날짜보다 이를 때
		
		//DAO 호출
		SqlSession ss = getSqlSession();
		int result = dao.book(ss, vo);
		
		if(result == 1) {
			ss.commit();
		} else {
			ss.rollback();
		}
		
		ss.close();
		
		return result;
	}
}
