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
	private String roomName;
	private String capacity;
	private String price;
	private String thumbnail;
	private String delYn;
	private String bio;
	
	
	
	
	public StayVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StayVo(String no, String storeName, String address, String internetAd, String phone, String email,
			String stayCode, String businessNo, String businessMemberNo, String waterPlayYn, String typeDog,
			String roomName, String capacity, String price, String thumbnail, String delYn, String bio) {
		super();
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
		this.roomName = roomName;
		this.capacity = capacity;
		this.price = price;
		this.thumbnail = thumbnail;
		this.delYn = delYn;
		this.bio = bio;
	}
	@Override
	public String toString() {
		return "StayVo [no=" + no + ", storeName=" + storeName + ", address=" + address + ", internetAd=" + internetAd
				+ ", phone=" + phone + ", email=" + email + ", stayCode=" + stayCode + ", businessNo=" + businessNo
				+ ", businessMemberNo=" + businessMemberNo + ", waterPlayYn=" + waterPlayYn + ", typeDog=" + typeDog
				+ ", roomName=" + roomName + ", capacity=" + capacity + ", price=" + price + ", thumbnail=" + thumbnail
				+ ", delYn=" + delYn + ", bio=" + bio + "]";
	}
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
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	

	
	
	
	
	
	
}//class
