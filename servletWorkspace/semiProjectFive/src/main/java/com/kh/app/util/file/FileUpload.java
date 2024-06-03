package com.kh.app.util.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.Part;

import com.kh.app.stay.vo.StayPicVo;

public class FileUpload {

	public static StayPicVo safeFile(Part f,String rootPath) throws Exception {
		
		//서버에 파일 업로드
		InputStream is = f.getInputStream(); //파일에 빨때 꽂음
		//경로지정(민정노트북절대경로. 각자 테스트할 작업환경에 맞게 수정해야함)
//        String path = "C:\\Users\\user\\dev\\semi_five\\servletWorkspace\\semiProjectFive\\src\\main\\webapp\\resources\\upload\\stay\\";
//		String path = "D:\\semiProject\\servletWorkspace\\semiProjectFive\\src\\main\\webapp\\resources\\upload\\stay\\"; //숙소사진 저장 경로
        String path = rootPath+"resources\\upload\\stay\\";

		int random = (int)(Math.random() * 90000 + 10000); // 수정된 파일이름에 10000 - 99999 사이의 숫자 부여
		String originName = f.getSubmittedFileName(); //업로드된 파일 원래 이름
		String ext = originName.substring(originName.lastIndexOf(".")); //업로드된 파일로부터 확장자 가져옴
		String changeName = "TOGEDOG_" + System.nanoTime() + "STAY_" + random + ext; //파일명 : "함께하개_업로드시간_숙소_랜덤숫자.확장자"
		FileOutputStream fos = new FileOutputStream(path + changeName); //저장할 공간에 빨대 꽂고 저장함
		
		byte[] buf = new byte[1024]; //1바이트씩 업로드하는 대신 1킬로바이트를 버퍼로 받아 한번에 업로드 하기 위해 버퍼 만듬
		int size = 0;
		while( (size = is.read(buf)) != -1) {
			fos.write(buf, 0, size); //버퍼로 부터 데이터 받아와 fos 빨때 통해 새파일에 데이터 저장
		}
		
		is.close();
		fos.close();
		
		//VO에 필요한 데이터 저장
		StayPicVo picVo = new StayPicVo();
		picVo.setChangeName(changeName);
		picVo.setOriginName(originName);
		
		return picVo;
	}
}
