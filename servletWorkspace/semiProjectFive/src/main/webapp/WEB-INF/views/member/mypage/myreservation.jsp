<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>member-menu</title>
<link rel="stylesheet" href="/app/resources/css/member/menu.css">
<%@ include file="/WEB-INF/views/layout/util.jsp"%>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css"
	integrity="sha512-Avb2QiuDEEvB4bZJYdft2mNjVShBftLdPG8FJ0V7irTLQ8Uo0qcPxh4Plq7G5tGm0rU+1SPhVotteLpBERwTkw=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<script defer src="/app/resources/js/member/edit.js"></script>
<link rel="stylesheet" href="/app/resources/css/memberMenuEdit.css">
</head>
<body>
	<header class="header">
		<div class="menu">
			<a href="마이페이지로 이동" class="mypage"> <i class="fa-solid fa-bars"></i>
			</a>
		</div>
		<div class="menu">
			<a href="/app/home" class="mypage"> <i class="fa-solid fa-house"></i>
			</a>
		</div>
	</header>

	<c:choose>

		<c:when test="${loginMemberVo.picUrl != null}">
			<div class="member-profile-wrap">
				<img
					src="/app/resources/upload/memberprofile/${loginMemberVo.picUrl}"
					alt="프로필사진">
			</div>
		</c:when>
		<c:when test="${loginMemberVo.picUrl == null}">
			<div class="member-profile-wrap">
				<img src="/app/resources/img/member/profile/defaultProfile.jpg"
					alt="프로필사진">
			</div>
		</c:when>

	</c:choose>
	<div class="member-info">
		<div class="member-nick">${loginMemberVo.nick}</div>
		<div class="member-email">${loginMemberVo.email}</div>
		<button onclick="location.href = '/app/member/logout'">로그아웃</button>
	</div>
	<nav class="navbar">
		<ul>
			<li><a href="/app/member/menu">
					<div>내 정보</div>
			</a></li>
			<li><a href="/app/member/myreservation">
					<div>내 예약</div>
			</a></li>
			<li><a href="/app/member/myreview">
					<div>내 리뷰</div>
			</a></li>
			<li><a href="/app/qnalist">
					<div>Q&A바로가기</div>
			</a></li>

		</ul>
	</nav>
	<main class="main-content">
		<section class="container">

			<c:forEach var="x" items="myResList">
				<div>
					<div>예약 번호 : ${x.reservationId}</div>
					<div>숙소명 : ${x.storeName}</div>
					<c:if test="${empty x.roomName}">
						<div>객실명 : ${x.storeName}</div>
					</c:if>
					<div>객실명 : ${x.roomName}</div>
					<div>체크인 : ${x.checkInDate}</div>
					<div>체크아웃 : ${x.checkOutDate}</div>
					<div>예약상태 : ${x.name}</div>
					<div>총 인원 : ${x.totalGuest}</div>
					<div>동반 반려견 수 : ${x.countDog}</div>
					<div>총 금액: ${x.totalPrice}</div>
					<div>예약일시 : ${x.enrollDate}</div>
				</div>

			</c:forEach>




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
