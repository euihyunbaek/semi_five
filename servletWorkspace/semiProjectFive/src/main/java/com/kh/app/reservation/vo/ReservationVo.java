package com.kh.app.reservation.vo;

public class ReservationVo {

	private String reservationId;
	private String userNo;
	private String checkInDate;
	private String checkOutDate;
	private String enrollDate;
	private String totalGuest;
	private String totalPrice;
	private String stayNo;
	private String reservationStatus;
	private String name;//예약상태명
	private String countDog;
	private String nick; //회원의 닉네임
	private String roomName; //숙소의 방이름
	private String storeName; //숙소 이름
	
	
	public ReservationVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReservationVo(String reservationId, String userNo, String checkInDate, String checkOutDate,
			String enrollDate, String totalGuest, String totalPrice, String stayNo, String reservationStatus,
			String name, String countDog, String nick, String roomName, String storeName) {
		super();
		this.reservationId = reservationId;
		this.userNo = userNo;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.enrollDate = enrollDate;
		this.totalGuest = totalGuest;
		this.totalPrice = totalPrice;
		this.stayNo = stayNo;
		this.reservationStatus = reservationStatus;
		this.name = name;
		this.countDog = countDog;
		this.nick = nick;
		this.roomName = roomName;
		this.storeName = storeName;
	}

	@Override
	public String toString() {
		return "ReservationVo [reservationId=" + reservationId + ", userNo=" + userNo + ", checkInDate=" + checkInDate
				+ ", checkOutDate=" + checkOutDate + ", enrollDate=" + enrollDate + ", totalGuest=" + totalGuest
				+ ", totalPrice=" + totalPrice + ", stayNo=" + stayNo + ", reservationStatus=" + reservationStatus
				+ ", name=" + name + ", countDog=" + countDog + ", nick=" + nick + ", roomName=" + roomName
				+ ", storeName=" + storeName + "]";
	}
	public String getReservationId() {
		return reservationId;
	}
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public String getTotalGuest() {
		return totalGuest;
	}
	public void setTotalGuest(String totalGuest) {
		this.totalGuest = totalGuest;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStayNo() {
		return stayNo;
	}
	public void setStayNo(String stayNo) {
		this.stayNo = stayNo;
	}
	public String getReservationStatus() {
		return reservationStatus;
	}
	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountDog() {
		return countDog;
	}
	public void setCountDog(String countDog) {
		this.countDog = countDog;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}