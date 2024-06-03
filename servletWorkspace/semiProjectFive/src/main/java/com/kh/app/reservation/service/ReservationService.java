package com.kh.app.reservation.service;

import org.apache.ibatis.session.SqlSession;
import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import java.util.List;

import com.kh.app.common.vo.PageVo;
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
	
	//예약목록조회
	public List<ReservationVo> selectByBusiness(String no, PageVo pvo) throws Exception {
		
		//DAO 호출
		SqlSession ss = getSqlSession();
		List<ReservationVo> reservationVoList = dao.selectByBusiness(ss, no, pvo);
		return reservationVoList;
	}
	
	//예약갯수조회
	public int getReservationCnt() throws Exception {
		SqlSession ss = getSqlSession();
		int cnt = dao.getReservationCnt(ss);
		System.out.println("service memberCnt: "+cnt);
		ss.close();
		return cnt;
	}
	
	//예약일괄승인
	public int approve(String[] noArr) throws Exception {
	
	
		SqlSession ss = getSqlSession();
		int result = dao.approve(ss, noArr);
		if(result>0) {
			
			ss.commit();
	
		}else {
			ss.rollback();
	
		}ss.close();
		return result;
		
	}
}
