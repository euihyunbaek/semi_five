<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8">
    <title>숙박업소 등록</title>
    <%@ include file="/WEB-INF/views/layout/util.jsp" %>
    <link rel="stylesheet" href='/app/resources/css/business/stay-register.css'>
    <script src="/app/resources/css/business/stay-register.js"></script>
    
  </head>
  <body>
  	<header>
  		<div class="heading-space">
	      <h2>숙박업소 등록</h2>
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
      <form action="" method="post" id="register-form" enctype="multipart/form-data">
        <fieldset id="essential-info">
          <legend>필수정보</legend>
          <label for="name" id="name-label">
          	상호명: <input type="text" name="name" id="name" placeholder="상호명 입력" required>
          </label>
          <label for="tel" id="tel-label">
          	전화번호: <input type="tel" name="phone" id="tel" placeholder="전화번호 입력" required pattern="^0[1-6][0-4]?\d{3,4}\d{4}$">
          </label>
          <label for="address" id="address-label">
          	주소: <input type="text" name="address" id="address" placeholder="숙박업소 주소 입력" required>
          </label>
          <label for="webpage" id="webpage-label">
          	홈페이지: <input type="url" name="webpage" id="webpage" placeholder="홈페이지 입력">
          </label>
          <label for="email" id="email-label">
          	EMAIL: <input type="email" name="email" id="email" placeholder="올바른 이메일주소 입력" pattern="^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$">
          </label>
          <label for="business-number" id="business-number-label">
          	사업자등록번호: <input type="text" name="business-number" id="business-number" placeholder="사업자등록번호 입력" required pattern="\d{10}">
          </label>
        </fieldset>
        <fieldset id="accomo-info">
          <legend>숙박업소 상세정보</legend>
          <label for="dropdown">숙박업소 종류:
            <select name="accomo-type" id="dropdown" required>
              <option value="">(선택하세요)</option>
              <option value="1">호텔</option>
              <option value="2">펜션</option>
              <option value="3">풀빌라</option>
              <option value="4">캠프장</option>
            </select>
          </label>
          <label for="room">
            방이름: <input type="text" name="room" id="room" class="inline">
          </label>
          <label for="capacity">
            최대 수용 인원: <input type="number" name="capacity" id="capacity" class="inline" min="1" max="100" value="1">
          </label>
          <label for="price">
            가격: <input type="text" name="price" id="price" class="inline">
          </label>
          물놀이 가능 여부:
          <label for="waterplay-ok">
            <input type="radio" name="waterplay" id="waterplay-ok" class="inline" value="Y"> 물놀이 가능
          </label>
          <label for="waterplay-notok">
            <input type="radio" name="waterplay" id="waterplay-notok" class="inline" value="N" required> 물놀이 불가능
          </label>
          허용 반려견 종류:
          <label for="small">
            <input type="checkbox" name="dog-size" id="small" class="inline" value="1"> 소형
          </label>
          <label for="middle">
            <input type="checkbox" name="dog-size" id="middle" class="inline" value="2"> 중형
          </label>
          <label for="large">
            <input type="checkbox" name="dog-size" id="large" class="inline" value="3"> 대형
          </label>
          <label for="bio">숙소소개:
            <textarea id="bio" name="bio" rows="3" cols="30" placeholder="간단한 숙소소개..."></textarea>
          </label>
        </fieldset>
        <fieldset>
          <legend>숙소 사진 업로드</legend>
          <label for="thumbnail">썸네일 사진:
        	<input type="file" name="thumbnail" id="thumbnail">
          </label>
          <label for="picture">숙소 사진을 업로드하세요: 
            <input id="picture" type="file" name="f" multiple/>
          </label>
        </fieldset>
        <input id="submit" type="submit" value="숙소등록요청" />
      </form>
    </main>
    <a id="top-button">TOP</a>
    <footer>
      <p>Copyright 2024. 함께하개 All Rights Reserved</p>
    </footer>
  </body>
</html>