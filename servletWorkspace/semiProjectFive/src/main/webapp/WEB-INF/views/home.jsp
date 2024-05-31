<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>home</title>
	<%@ include file="/WEB-INF/views/layout/util.jsp" %>
    <link rel="stylesheet" href="/app/resources/css/home.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css" integrity="sha512-Avb2QiuDEEvB4bZJYdft2mNjVShBftLdPG8FJ0V7irTLQ8Uo0qcPxh4Plq7G5tGm0rU+1SPhVotteLpBERwTkw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <script defer src="/app/resources/js/home.js"></script>
</head>
<body>
    <header class="header">
   <c:choose>
    <c:when test="${sessionScope.loginAdminVo != null}">
        <a href="/app/admin/menu" class="mypage">
            <i class="fa-solid fa-bars"></i>
        </a>
    
    </c:when>
    <c:when test="${sessionScope.loginMemberVo != null}">
        <a href="/app/member/menu" class="mypage">
            <i class="fa-solid fa-bars"></i>
        </a>
    
    </c:when>

    <c:otherwise>
        <a href="/app/login" class="mypage">
            <i class="fa-solid fa-bars"></i>
        </a>
    </c:otherwise>
   
   </c:choose>
   
   
    </header>
    <div class="SchBox">
            <button maxlength="40">
                <div>
                    <span> 상세 조회&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Click!</span>
                    <div class="icon-container">
                        <i class="fa-solid fa-magnifying-glass"></i>
                    </div>
                </div>

            </button>
    </div>
    <div class="homepage-image">
        <img src="app/resources/img/homepage.png" alt="강아지">
    </div>


<%@ include file="/WEB-INF/views/layout/home/nav.jsp" %>

    <main class="main-content">
        <section class="container">
            <a href="../stay/stay_detail.html">
                <div class="item">
                    <div class="img-container">
                        <img src="https://images.unsplash.com/photo-1582719508461-905c673771fd?q=80&w=1325&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" alt="숙소 사진">
                    </div>
                    <div class="stay-info-container">
                        <div class="stay-name">
                            <span>숙소이름</span>
                        </div>
                        <div class="rate">
                            <span>
                                <i class="fa-solid fa-star"></i>
                                <span class="score">4.5</span>
                            </span>
                            <span class="count">
                                (150)
                            </span>
                        </div>
                        <div class="stay-cate">호텔</div>
                        <div class="stay-location">
                            <i class="fa-solid fa-location-dot"></i>
                            <span class="location">호산빌딩</span>
                        </div>
                        <div class="price">100,000원~</div>
                    </div>
                </div>
            </a>
            <a href="#">
                <div class="item">
                    <div class="img-container">
                        <img src="https://images.unsplash.com/photo-1582719508461-905c673771fd?q=80&w=1325&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" alt="숙소 사진">
                    </div>
                    <div class="stay-info-container">
                        <div class="stay-name">
                            <span>숙소이름</span>
                        </div>
                        <div class="rate">
                            <span>
                                <i class="fa-solid fa-star"></i>
                                <span class="score">4.5</span>
                            </span>
                            <span class="count">
                                (150)
                            </span>
                        </div>
                        <div class="stay-cate">호텔</div>
                        <div class="stay-location">
                            <i class="fa-solid fa-location-dot"></i>
                            <span class="location">호산빌딩</span>
                        </div>
                        <div class="price">100,000원~</div>
                    </div>
                </div>
            </a>
            <a href="#">
                <div class="item">
                    <div class="img-container">
                        <img src="https://images.unsplash.com/photo-1582719508461-905c673771fd?q=80&w=1325&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" alt="숙소 사진">
                    </div>
                    <div class="stay-info-container">
                        <div class="stay-name">
                            <span>숙소이름</span>
                        </div>
                        <div class="rate">
                            <span>
                                <i class="fa-solid fa-star"></i>
                                <span class="score">4.5</span>
                            </span>
                            <span class="count">
                                (150)
                            </span>
                        </div>
                        <div class="stay-cate">호텔</div>
                        <div class="stay-location">
                            <i class="fa-solid fa-location-dot"></i>
                            <span class="location">호산빌딩</span>
                        </div>
                        <div class="price">100,000원~</div>
                    </div>
                </div>
            </a>
            <a href="#">
                <div class="item">
                    <div class="img-container">
                        <img src="https://images.unsplash.com/photo-1582719508461-905c673771fd?q=80&w=1325&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" alt="숙소 사진">
                    </div>
                    <div class="stay-info-container">
                        <div class="stay-name">
                            <span>숙소이름</span>
                        </div>
                        <div class="rate">
                            <span>
                                <i class="fa-solid fa-star"></i>
                                <span class="score">4.5</span>
                            </span>
                            <span class="count">
                                (150)
                            </span>
                        </div>
                        <div class="stay-cate">호텔</div>
                        <div class="stay-location">
                            <i class="fa-solid fa-location-dot"></i>
                            <span class="location">호산빌딩</span>
                        </div>
                        <div class="price">100,000원~</div>
                    </div>
                </div>
            </a>
            <div class="item">숙소정보</div>
            <div class="item">숙소정보</div>
            <div class="item">숙소정보</div>
            <div class="item">숙소정보</div>
            <div class="item">숙소정보</div>
        </section>
    </main>

<!-- 푸터 -->
        <%@ include file="/WEB-INF/views/layout/footer.jsp" %>


<!-- top 버튼 -->
    <button onclick="topFunction()" id="topBtn" title="Go to top">
      <i class="fas fa-chevron-up"></i>
    </button>
    

<!-- 상세조회 모달(팝업)창  -->
        <%@ include file="/WEB-INF/views/layout/home/modal.jsp" %>

</body>
</html>
    