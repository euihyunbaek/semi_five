<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>room-reservation</title>
    <%@ include file="/WEB-INF/views/layout/util.jsp" %>
    
    <link rel="stylesheet" href="/app/resources/css/reservation/book.css">
    <script defer src="/app/resources/js/reservation/book.js"></script>
</head>
<body>
    <header class="header">
        <div class="menu">
            <a href="마이페이지로 이동" class="mypage">
                <i class="fa-solid fa-bars"></i>
            </a>
        </div>
        <div>로고</div>
        <div class="menu">
            <a href="홈화면" class="mypage">
                <i class="fa-solid fa-house"></i>
            </a>
        </div>
    </header>

    <div class="reservation-img-wrap">
        <img src="https://search.pstatic.net/common/?src=https%3A%2F%2Fnaverbooking-phinf.pstatic.net%2F20190808_213%2F1565269331998uYNKl_JPEG%2FKakaoTalk_20190707_152929203_23.jpg" alt="">
    </div>
    <div class="business-info">
        <div id="room-name">${stayInfoVo.roomName}</div>
        <div id="room-price"><span id="price">${stayInfoVo.price}</span>원 (1박)</div>
        <div id="room-capacity">최대 ${stayInfoVo.capacity}인</div>
    </div>
    <nav class="navbar">
        <ul>
            <li>
                <a href="">
                    <div>홈</div>
                </a>
            </li>
            <li>
                <a href="">
                    <div>리뷰</div>
                </a>
            </li>
            <li>
                <a href="">
                    <div>객실예약</div>
                </a>
            </li>
            <li>
                <a href="">
                    <div>사진</div>
                </a>
            </li>
        </ul>
    </nav>
    <main class="main-content">
        <section class="container">
            <!-- 달력 -->
            <form action="" method="post">
                <div class="calendar-wrap">
                    <div class="calendar-middle-wrap">
                        <div class="cal_nav">
                            <a href="javascript:;" class="nav-btn go-prev"></a>
                            <span class="year-month start-year-month"></span>
                            <a href="javascript:;" class="nav-btn go-next"></a>
                        </div>
                        <div class="cal_wrap">
                            <div class="days">
                                <div class="day">일</div>
                                <div class="day">월</div>
                                <div class="day">화</div>
                                <div class="day">수</div>
                                <div class="day">목</div>
                                <div class="day">금</div>
                                <div class="day">토</div>
                            </div>
                            <div class="dates start-calendar"></div>
                        </div>
                    </div>
                    <div class="checkInOutInfo">
                        <div>
                            <p>
                                <span>체크인</span>
                                <input type="date" id="check_in_day" name="check-in-day">
                            </p>
                            <p class="space">~</p>
                            <p>
                                <span>체크아웃</span>
                                <input type="date" id="check_out_day" name="check-out-day">
                            </p>
                        </div>
                    </div>
                    <label>인원을 선택하세요<input type="number" name="total-guest" min="1" max="10" value="1"> </label>
                    <label>동반 반려견 수<input type="number" name="count-dog" min="1" max="10" value="1"> </label>
                    <div class="total-price-wrap"><span class="total-price">예상 금액은 </span><span id="total-price-number">(계산한 금액)</span><span> 원 입니다.</span></div>
                    <button type="submit" class="cla-btn">예약하기</button>
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
