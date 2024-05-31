<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>member-menu</title>
    <link rel="stylesheet" href="/app/resources/css/member/menu.css">
   	<%@ include file="/WEB-INF/views/layout/util.jsp" %>
   	
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css" integrity="sha512-Avb2QiuDEEvB4bZJYdft2mNjVShBftLdPG8FJ0V7irTLQ8Uo0qcPxh4Plq7G5tGm0rU+1SPhVotteLpBERwTkw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <script defer src="/app/resources/js/member/menu.js"></script>
   	 <link rel="stylesheet" href="/app/resources/css/memberMenuEdit.css">
</head>
<body>
    <header class="header">
        <div  class="menu">
            <a href="마이페이지로 이동" class="mypage">
                <i class="fa-solid fa-bars"></i>
            </a>
        </div>
        <div class="menu">
            <a href="/app/home" class="mypage">
                <i class="fa-solid fa-house"></i>
            </a>
        </div>
    </header>

<c:choose>

<c:when test="${loginMemberVo.picUrl != null}">
    <div class="member-profile-wrap">
        <img src="/app/resources/upload/memberprofile/${loginMemberVo.picUrl}" alt="프로필사진">
    </div>
</c:when>
   <c:when test="${loginMemberVo.picUrl == null}">
       <div class="member-profile-wrap">
        <img src="/app/resources/img/member/profile/defaultProfile.jpg" alt="프로필사진">   </div>
   </c:when>

</c:choose>
    <div class="member-info">
        <div class="member-nick"> ${loginMemberVo.nick} </div>
        <div class="member-email"> ${loginMemberVo.email}</div>
        <button onclick = "location.href = '/app/member/logout'">로그아웃</button>
    </div>
    <nav class="navbar">
        <ul>
            <li>
                <a href="">
                    <div>내 정보</div>
                </a>
            </li>
            <li>
                <a href="./stay_detail_review/stay_detail_review.html">
                    <div> 내 예약 </div>
                </a>
            </li>
            <li>
                <a href="./stay_detail_room/stay_detail_room.html">
                    <div>내 리뷰 </div>
                </a>
            </li>
            <li>
                <a href="./stay_detail_photo/stay_detail_photo.html">
                    <div>Q&A바로가기</div>
                </a>
            </li>

        </ul>
    </nav>
    <main class="main-content">
        <section class="container">
     	<form action="/app/member/edit" method="post">
            <div> 
              <input type="hidden" value="${sessionScope.loginMemberVo.no}">
            </div>
            <div> 
              <label for="name">이름</label>
              <input readonly type="text" id="userName" name="name" placeholder="성함을 입력해주세요" value="${sessionScope.loginMemberVo.name}">
            </div>
            <div>
              <label for="id">아이디</label>
                <input readonly type="text" id="userId" name="id" placeholder="아이디 "  value="${sessionScope.loginMemberVo.id}">
            </div>


            <div>
              <label for="pwd">
                비밀번호
              </label>
              <input type="password" name="pwd" placeholder="비밀번호는 20자 이하" maxlength="20" required>
            </div>
            <div>
              <label for="pwd">
                비밀번호 확인
              </label>
              <input type="password" name="pwd2" placeholder= "비밀번호를 다시 입력해주세요" maxlength="20" required>
            </div>

            <div>
              <label for="nick">
                닉네임
              </label>
              <input type="text" name="nick" placeholder="닉네임을 입력해주세요" maxlength="12" value="${sessionScope.loginMemberVo.nick}">
            </div>
            <div>
              <label for="phone">
                전화번호
              </label>
              <input type="text" name="phone" placeholder=" '-'제외 11자리 입력(01012345678)" maxlength="12" value="${sessionScope.loginMemberVo.phone}">
            </div>
            <div>
              <label for="email">
                이메일
              </label>
              <input type="email" id="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" 
              placeholder="e.g) honggildong@naver.com"
              value="${sessionScope.loginMemberVo.email}">

            </div>
            <div>
              <label>프로필사진</label>
              <input type="file" name="profile" >
            </div>  


            <div>
              <button type="submit"id="memberjoin" >정보 수정하기</button>
              <button type ="button" onclick = "location.href = '/app/member/quit'">탈퇴하기</button>
              
            </div>

        </form>


               
           
        </section>
    </main>
    <footer>
        <p>Copyright 2024. 함께하개 All Rights Reserved</p>
    </footer>
    <button onclick="topFunction()" id="topBtn" title="Go to top">
      <i class="fas fa-chevron-up"></i>
    </button>
    
</body>
</html>
