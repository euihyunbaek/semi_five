<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>예약정보 상세조회</title>
  <%@ include file="/WEB-INF/views/layout/util.jsp" %>
  
  <link rel="stylesheet" href="/app/resources/css/reservation/detail.css">
  <script src="/app/resources/js/reservation/detail.js"></script>
</head>
<body>
  <header>
    <div class="heading-space">
	      <h2>예약목록 조회</h2>
	      <div class="buttons">
	        <div id="home-button">
	          <a id="home-anchor" href="/app/home"><i class="fi fi-rr-home"></i></a>
	        </div>
	        <div id="sidebar-btn">
            	<a id="home-anchor" href="/app/business/mypage"><i class="fi fi-rr-menu-burger"></i></a>
          	</div>
	        <div id="logout-btn">
	          <a id="logout" href="/app/business/logout"><i class="fi fi-rr-exit"></i></a>
	        </div>
	      </div>
	</div>
    	<%@ include file="/WEB-INF/views/layout/business/header.jsp" %>
  </header>
  <main>
   
       <div class="box">
        <div class="box-1">예약번호 : ${ requestScope.vo.reservationId }</div>
        <div class="box-2">예약일자 : ${ requestScope.vo.enrollDate }&ensp;</div>
        <div class="box-3">예약자 닉네임 : ${ requestScope.vo.nick }</div>
        <div class="box-4">체크인 날짜 : ${ requestScope.vo.checkInDate }</div>
        <div class="box-5">예약 인원 : ${ requestScope.vo.totalGuest }</div>
        <div class="box-6">체크아웃 날짜 : ${ requestScope.vo.checkOutDate }</div>
        <div class="box-7">동반 반려견 수 : ${ requestScope.vo.countDog }&nbsp;:</div>
        <div class="box-8">총 금액 : &#8361; ${ requestScope.vo.totalPrice } &ensp; </div>
      </div>
      
  </main>
  <a id="top-button">TOP</a>
  <footer>
    <p>Copyright 2024. 함께하개 All Rights Reserved</p>
  </footer>
</body>
</html>