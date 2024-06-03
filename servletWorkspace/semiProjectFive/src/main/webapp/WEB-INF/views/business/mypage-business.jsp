<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>사업자 마이페이지</title>
  <%@ include file="/WEB-INF/views/layout/util.jsp" %>
  <link rel="stylesheet" href="/app/resources/css/business/mypage-business.css">
  <script defer src="/app/resources/js/business/mypage-business.js"></script>
</head>
<body>

  <header>
  		<div class="heading-space">
	      <h2>사업자 마이페이지</h2>
	      <div class="buttons">
	        <div id="home-button">
	          <a id="home-anchor" href="/app/home"><i class="fi fi-rr-home"></i></a>
	        </div>
	        <div id="sidb-bar-btn">
	          <a id="logout" href="/app/business/logout"><i class="fi fi-rr-exit"></i></a>
	        </div>
	      </div>
	    </div>
    	<%@ include file="/WEB-INF/views/layout/business/header.jsp" %>
	</header>  
    
  <main>
    <div class="grid-item top-element">
        <a id="business-member-edit" href="./business-member-edit.html"><i class="fi fi-rr-pencil"></i> 회원정보관리</a>
    </div>
    <div class="grid-item top-element">
      <a id="stay-register" href="/app/business/stay-register"><i class="fi fi-rr-home-location-alt"></i> 숙박업소등록</a>
    </div>
    <div class="grid-item top-element">
      <a id="stay-notice-write" href="./stay-notice-write.html"><i class="fi fi-rr-edit"></i> 공지사항등록</a>
    </div>
    <div class="grid-item">
      <a id="stay-notice-edit" href="./stay-notice-edit.html"><i class="fi fi-rr-cursor-finger"></i> 공지사항관리</a>
    </div>
    <div class="grid-item">
      <a id="business-book-list" href="/app/business/reservation-list"><i class="fi fi-rr-list-check"></i> 예약요청관리</a>
    </div>
    <div class="grid-item">
      <a id="review-reply" href="./review-reply.html"><i class="fi fi-rr-megaphone"></i> 리뷰관리</a>
    </div>
  </main>
  
  <a id="top-button">TOP</a>
  
  <footer>
    <p>&copy;Copyright 2024. 함께하개 All Rights Reserved</p>
  </footer>
</body>
</html>