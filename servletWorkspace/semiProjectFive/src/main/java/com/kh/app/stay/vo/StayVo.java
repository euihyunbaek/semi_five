package com.kh.app.stay.vo;

public class StayVo {
	
	private String no;
	private String storeName;
	private String address;
	private String internetAd;
	private String phone;
	private String email;
	private String stayCode;
	private String businessNo;
	private String businessMemberNo;
	private String waterPlayYn;
	private String typeDog;
	private String delYn;
	
	//NoArgConstructor
	public StayVo() {
		
	}

	//AllArgsConstructor
	public StayVo(String no, String storeName, String address, String internetAd, String phone, String email,
			String stayCode, String businessNo, String businessMemberNo, String waterPlayYn, String typeDog,
			String delYn) {
		this.no = no;
		this.storeName = storeName;
		this.address = address;
		this.internetAd = internetAd;
		this.phone = phone;
		this.email = email;
		this.stayCode = stayCode;
		this.businessNo = businessNo;
		this.businessMemberNo = businessMemberNo;
		this.waterPlayYn = waterPlayYn;
		this.typeDog = typeDog;
		this.delYn = delYn;
	}

	//getters and setters
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getInternetAd() {
		return internetAd;
	}

	public void setInternetAd(String internetAd) {
		this.internetAd = internetAd;
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

	public String getStayCode() {
		return stayCode;
	}

	public void setStayCode(String stayCode) {
		this.stayCode = stayCode;
	}

	public String getBusinessNo() {
		return businessNo;
	}

	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
	}

	public String getBusinessMemberNo() {
		return businessMemberNo;
	}

	public void setBusinessMemberNo(String businessMemberNo) {
		this.businessMemberNo = businessMemberNo;
	}

	public String getWaterPlayYn() {
		return waterPlayYn;
	}

	public void setWaterPlayYn(String waterPlayYn) {
		this.waterPlayYn = waterPlayYn;
	}

	public String getTypeDog() {
		return typeDog;
	}

	public void setTypeDog(String typeDog) {
		this.typeDog = typeDog;
	}

	public String getDelYn() {
		return delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

	@Override
	public String toString() {
		return "StayVo [no=" + no + ", storeName=" + storeName + ", address=" + address + ", internetAd=" + internetAd
				+ ", phone=" + phone + ", email=" + email + ", stayCode=" + stayCode + ", businessNo=" + businessNo
				+ ", businessMemberNo=" + businessMemberNo + ", waterPlayYn=" + waterPlayYn + ", typeDog=" + typeDog
				+ ", delYn=" + delYn + "]";
	}
	
	
}
