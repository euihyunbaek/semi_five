package com.kh.app.member.vo;

public class MemberVo {
	private String no;
	private String id;
	private String pwd;
	private String pwd2;
	private String nick;
	private String name;
	private String phone;
	private String email;
	private String modifyDate;
	private String enrollDate;
	private String quitYn;
	private String picUrl;
	private String vipYn;
	public MemberVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberVo(String no, String id, String pwd, String pwd2, String nick, String name, String phone, String email,
			String modifyDate, String enrollDate, String quitYn, String picUrl, String vipYn) {
		super();
		this.no = no;
		this.id = id;
		this.pwd = pwd;
		this.pwd2 = pwd2;
		this.nick = nick;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.modifyDate = modifyDate;
		this.enrollDate = enrollDate;
		this.quitYn = quitYn;
		this.picUrl = picUrl;
		this.vipYn = vipYn;
	}
	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", id=" + id + ", pwd=" + pwd + ", pwd2=" + pwd2 + ", nick=" + nick + ", name="
				+ name + ", phone=" + phone + ", email=" + email + ", modifyDate=" + modifyDate + ", enrollDate="
				+ enrollDate + ", quitYn=" + quitYn + ", picUrl=" + picUrl + ", vipYn=" + vipYn + "]";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPwd2() {
		return pwd2;
	}
	public void setPwd2(String pwd2) {
		this.pwd2 = pwd2;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public String getQuitYn() {
		return quitYn;
	}
	public void setQuitYn(String quitYn) {
		this.quitYn = quitYn;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getVipYn() {
		return vipYn;
	}
	public void setVipYn(String vipYn) {
		this.vipYn = vipYn;
	}
	
	
	
	
	
	
}
