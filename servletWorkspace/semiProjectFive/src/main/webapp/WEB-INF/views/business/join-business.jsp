<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>사업자 회원가입</title>
  <link rel="stylesheet" href="/app/resources/css/business/join-business.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script defer src="/app/resources/js/business/join-business.js"></script>
  <!-- 폰트 및 아이콘 -->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
  <link rel='stylesheet' href='https://cdn-uicons.flaticon.com/2.3.0/uicons-regular-rounded/css/uicons-regular-rounded.css'>
</head>
<body>
  <header>
    <!-- <h1 id="title">숙박업소 등록</h1>
    <p id="description"><a href="#back" id="back-button">back</a></p> -->
    <div class="heading-space">
      <h2>사업자 회원가입</h2>
      <div class="buttons">
        <div id="home-btn">
          <a id="home-anchor" href="/app/home"><i class="fi fi-rr-home"></i></a>
        </div>
        <!-- <div id="sidebar-btn">
          <a id="home-anchor" href="./business-mypage.html"><i class="fi fi-rr-menu-burger"></i></a>
        </div>
        <div id="logout-btn">
          <a id="logout" href=""><i class="fi fi-rr-exit"></i></a>
        </div> -->
      </div>
    </div>
    <div class="login-space">
      <!-- <div id="login-img-space">
        <img id="login-img" src="./resources/img/abc3.png" width="40px" height="40px" alt="로그인사진">
      </div>
      <div id="login-info-space">
        ABC님 환영합니다!
      </div> -->
    </div>
  </header>
  <main>
    <form action="" method="post" id="register-form">
      <fieldset id="essential-info">
        <legend>필수정보</legend>
        <label for="name" id="name-label">
          성함: <input type="text" name="name" id="name" placeholder="성함 입력" required>
        </label>
        <label for="nick" id="nick-label">
          닉네임: 
          <input type="text" name="nick" id="nick" placeholder="닉네임 입력" required> <button id="nick-dup" type="button" onclick="checkNickDup();">중복검사</button>
        </label> 
        <!-- 아이디 : 최소 4글자 최대 12글자. 첫 글자는 영문대소문자만. 두번째 글자부터는 영문대소문자, 숫자, #, _ , -, . 포함-->
        <label for="id" id="id-label">
          ID: <input type="text" name="id" id="id" placeholder="ID 입력" required pattern="^[a-zA-z]([\w_\-#\.]{3,12})$"> <button id="id-dup" type="button" onclick="checkIdDup();">중복검사</button>
        </label>
        <!-- 비밀번호 : 영문 대문자, 소문자, 숫자, 특수기호 각각 적어도 하나씩 포함 8-16자리. -->
        <label for="pwd" id="pwd-label">비밀번호: <input type="password" name="pwd" id="pwd" placeholder="영문대소문자 특수기호 포함 8-16자리" required pattern="^(?=.*[a-zA-Z])(?=.*[A-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,15}$"></label>
        <label for="pwd2" id="pwd2-label">비밀번호 다시 입력: <input type="password" name="pwd2" id="pwd2" placeholder="영문대소문자 특수기호 포함 8-16자리" required pattern="^(?=.*[a-zA-Z])(?=.*[A-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,15}$"></label>
      </fieldset>
      
      
      <input id="submit" type="submit" value="회원가입" />
    </form>
  </main>
  <a id="top-button">TOP</a>
  <footer>
    <p>Copyright 2024. 함께하개 All Rights Reserved</p>
  </footer>
</body>
</html>