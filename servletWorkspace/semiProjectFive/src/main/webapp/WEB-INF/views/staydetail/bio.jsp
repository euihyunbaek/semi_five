<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>stay-bio</title>
    <%@ include file="/WEB-INF/views/layout/util.jsp" %>
    <link rel="stylesheet" href="/app/resources/css/staydetail/staydetail.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css" integrity="sha512-Avb2QiuDEEvB4bZJYdft2mNjVShBftLdPG8FJ0V7irTLQ8Uo0qcPxh4Plq7G5tGm0rU+1SPhVotteLpBERwTkw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <script defer src="./stay_detail.js"></script>
</head>
<body>
    <%@ include file="/WEB-INF/views/layout/staydetail/header.jsp" %>
    
    <%@ include file="/WEB-INF/views/layout/staydetail/thumbnail.jsp" %>

    <%@ include file="/WEB-INF/views/layout/staydetail/nav.jsp" %>



    <main class="main-content">
        <section class="container">
            
                <div class="stay-info">
                    <div class="stay-info-container">
                        <div class="location">
                            <i class="fa-solid fa-location-dot"></i>
                            <span>${requestScope.vo.address}</span>
                        </div>
                        <div class="telephone">
                            <i class="fa-solid fa-phone"></i>
                           
                            <span>${requestScope.vo.phone}</span>
                            
                        </div>
                        <div class="internet-address">
                            <i class="fa-solid fa-globe"></i>
                            <span>${requestScope.vo.internetAd}</span>
                        </div>

                    </div>
                </div>
                <div class="stay-info">
                    <div class="stay-notice">
                        <div class="notice-title">
                            <i class="fa-solid fa-bullhorn"></i>
                            <!-- 공지사항 제목 -->
								숙소 소개                           
                        </div>
                        <div class="notice-content">
                            <!-- 공지사항 내용 -->
                            ${requestScope.vo.bio}
                            
                        </div>

                    </div>
                </div>
 


               
           
        </section>
    </main>

        <%@ include file="/WEB-INF/views/layout/footer.jsp" %>

    <button onclick="topFunction()" id="topBtn" title="Go to top">
      <i class="fas fa-chevron-up"></i>
    </button>
    
</body>
</html>
