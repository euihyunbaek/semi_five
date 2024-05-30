package com.kh.app.stay.vo;

public class StayPicVo {

	private String originName;
	private String changeName;
	
	//NoArgConstructor
	public StayPicVo() {
		
	}

	//AllArgsConstructor
	public StayPicVo(String originName, String changeName) {
		this.originName = originName;
		this.changeName = changeName;
	}

	//getters and setters
	public String getOriginName() {
		return originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public String getChangeName() {
		return changeName;
	}

	public void setChangeName(String changeName) {
		this.changeName = changeName;
	}

	@Override
	public String toString() {
		return "StayPicVo [originName=" + originName + ", changeName=" + changeName + "]";
	}
	
	
}
