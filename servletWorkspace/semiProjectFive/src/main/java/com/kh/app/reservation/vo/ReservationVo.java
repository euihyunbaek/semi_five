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
	private String countDog;
	
	//noArgConstructor
	public ReservationVo () {
		
	}

	//allArgsConstructor
	public ReservationVo(String reservationId, String userNo, String checkInDate, String checkOutDate,
			String enrollDate, String totalGuest, String totalPrice, String stayNo, String reservationStatus,
			String countDog) {
		this.reservationId = reservationId;
		this.userNo = userNo;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.enrollDate = enrollDate;
		this.totalGuest = totalGuest;
		this.totalPrice = totalPrice;
		this.stayNo = stayNo;
		this.reservationStatus = reservationStatus;
		this.countDog = countDog;
	}

	//getters and setters
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

	public String getCountDog() {
		return countDog;
	}

	public void setCountDog(String countDog) {
		this.countDog = countDog;
	}

	//toString()
	@Override
	public String toString() {
		return "ReservationVo [reservationId=" + reservationId + ", userNo=" + userNo + ", checkInDate=" + checkInDate
				+ ", checkOutDate=" + checkOutDate + ", enrollDate=" + enrollDate + ", totalGuest=" + totalGuest
				+ ", totalPrice=" + totalPrice + ", stayNo=" + stayNo + ", reservationStatus=" + reservationStatus
				+ ", countDog=" + countDog + "]";
	}
	
}
