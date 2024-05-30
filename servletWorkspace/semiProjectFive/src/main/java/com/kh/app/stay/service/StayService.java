package com.kh.app.stay.service;

import org.apache.ibatis.session.SqlSession;
import static com.kh.app.db.SqlSessionTemplate.getSqlSession;
import com.kh.app.stay.dao.StayDao;
import com.kh.app.stay.vo.StayVo;

public class StayService {

	private final StayDao dao;
	
	public StayService() {
		dao = new StayDao();
	}
	
	//숙소등록
	public int register(StayVo vo) throws Exception {
		//비즈니스 로직
		
		//DAO 호출
		SqlSession ss = getSqlSession();
		int result = dao.register(ss, vo);
		
		if(result == 1) {
			ss.commit();
		} else {
			ss.rollback();
		}
		
		ss.close();
		
		return result;
	}
}
