<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>예약요청 조회</title>
  
  <!-- 폰트 및 아이콘 -->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
  <link rel='stylesheet' href='https://cdn-uicons.flaticon.com/2.3.0/uicons-regular-rounded/css/uicons-regular-rounded.css'><link rel="stylesheet" href="./business-book-list.css">
  <link rel='stylesheet' href='/app/resources/css/business/reservation-list.css'>
  <script src="/app/resources/js/business/reservation-list.js"></script>
</head>
<body>
  <header>
  		<div class="heading-space">
	      <h2>예약목록 조회</h2>
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
	<h2>${ loginBizMemberVo.name } 님 숙박업소의 예약목록</h2>
      <table border="1" id="table">
      	<thead>
      		<tr>
      			<th>방 이름</th>
      			<th>체크인 - 체크아웃</th>
      			<th>상세정보</th>
      			<th><input type="checkbox" id ="selectAll"></th>
      		</tr>
      	</thead>
      	<tbody>
	      	<c:forEach items="${ reservationVoList }" var="vo">
		        <tr>
		          <th>${ vo.roomName }</th>
		          <td rowspan="2">${ vo.checkInDate } - ${ vo.checkOutDate }</td>
		          <td rowspan="2"><a href="/app/admin/business/detail?no=${vo.reservationId}">상세정보</a></td>
		          <td rowspan="2"><input type="checkbox" name="status" class="ck" id="reservationStatus" value=${ vo.reservationId }></td>
		        </tr>
		        <tr>
		          <td>
		            ${ vo.nick } 님
		          </td>
		          <!-- <td></td> -->
		          <!-- <td></td> -->
		        </tr>
	      	</c:forEach>
      	</tbody>
        
        <tfoot>
        	<td colspan="4">
            	<div><button onclick="approveReservation();">승인하기</button></div>
            </td>
        </tfoot>
      </table>
      
      <div class="page-wrap">
    	<div class="page-area">
				<c:if test="${pvo.currentPage > 1}">
					<button onclick = "location.href='/app/admin/member/list?pno=${pvo.currentPage-1}'">이전</button>
				</c:if>
				<c:forEach begin="${pvo.startPage}" end="${pvo.endPage}" var="x">
					<c:if test="${pvo.currentPage == x}">
						<a>
						<strong>
						${x}
						</strong>						
						</a>
					</c:if>
					<c:if test="${pvo.currentPage != x}">
						<a href="/app/admin/member/list?pno=${x}">
						${x}
						</a>
					</c:if>
				</c:forEach>
				<c:if test="${pvo.currentPage < pvo.maxPage }">
					<button onclick = "location.href='/app/admin/member/list?pno=${pvo.currentPage+1}'">다음</button>
				</c:if>
		</div>
    </div>
    
  </main>
  <a id="top-button">TOP</a>
  <footer>
    <p>Copyright 2024. 함께하개 All Rights Reserved</p>
  </footer>
</body>
</html>