package com.kh.app.stay.vo;

public class StayCategoryVo {

	private String no;
	private String name;
	public StayCategoryVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StayCategoryVo(String no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	@Override
	public String toString() {
		return "StayCategoryVo [no=" + no + ", name=" + name + "]";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
