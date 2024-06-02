package com.kh.app.stay.service;

import org.apache.ibatis.session.SqlSession;
import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import java.util.List;

import com.kh.app.stay.dao.StayDao;
import com.kh.app.stay.vo.StayPicVo;
import com.kh.app.stay.vo.StayVo;

public class StayService {

	private final StayDao dao;
	
	public StayService() {
		dao = new StayDao();
	}
	
	//숙소등록
	public int register(StayVo vo, List<StayPicVo> stayPicVoList) throws Exception {
		//비즈니스 로직
		
		//DAO 호출
		SqlSession ss = getSqlSession();
		int result = dao.register(ss, vo);
		System.out.println("service > result : " + result);
		
		if(result == 1) {
			ss.commit();
		} else {
			ss.rollback();
		}
		
		int attResult = 1; //파일이 없어도 커밋해야하므로 1로 설정. 어차피 파일 첨부 시도하다 실패하면 0이 될거임.
		if(stayPicVoList.size() > 0) {
			attResult = dao.insertStayPic(ss, stayPicVoList);
		}
		
		if(attResult >= 1) {
			ss.commit();
		} else {
			ss.rollback();
		}
		
		ss.close();
		
		return result * attResult;
	}

	public List<StayVo> selectStayList() throws Exception {

	SqlSession ss = getSqlSession();
	List<StayVo> voList = dao.selectStayList(ss);
	ss.close();
	return voList;
	
	
	}
}
