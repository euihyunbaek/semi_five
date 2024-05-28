package com.kh.app.business.vo;

public class BusinessMemberVo {
	
	private String no;
	private String id;
	private String pwd;
	private String pwd2;
	private String nick;
	private String name;
	private String enrollDate;
	private String quitYn;
	private String adminApprove;
	
	//NoArgConstructor
	public BusinessMemberVo() {
		
	}

	//AllArgsConstructor
	public BusinessMemberVo(String no, String id, String pwd, String pwd2, String nick, String name, String enrollDate,
			String quitYn, String adminApprove) {
		this.no = no;
		this.id = id;
		this.pwd = pwd;
		this.pwd2 = pwd2;
		this.nick = nick;
		this.name = name;
		this.enrollDate = enrollDate;
		this.quitYn = quitYn;
		this.adminApprove = adminApprove;
	}

	//getters and setters
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

	public String getAdminApprove() {
		return adminApprove;
	}

	public void setAdminApprove(String adminApprove) {
		this.adminApprove = adminApprove;
	}

	@Override
	public String toString() {
		return "BusinessMemberVo [no=" + no + ", id=" + id + ", pwd=" + pwd + ", pwd2=" + pwd2 + ", nick=" + nick
				+ ", name=" + name + ", enrollDate=" + enrollDate + ", quitYn=" + quitYn + ", adminApprove="
				+ adminApprove + "]";
	}

	
}
