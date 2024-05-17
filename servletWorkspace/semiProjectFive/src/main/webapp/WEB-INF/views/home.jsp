<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>home</title>
    <link rel="stylesheet" href="/app/resources/css/home.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css" integrity="sha512-Avb2QiuDEEvB4bZJYdft2mNjVShBftLdPG8FJ0V7irTLQ8Uo0qcPxh4Plq7G5tGm0rU+1SPhVotteLpBERwTkw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <script defer src="/app/resources/js/home.js"></script>
</head>
<body>
    <header class="header">
        <a href="#" class="mypage">
            <i class="fa-solid fa-bars"></i>
        </a>
    </header>
    <div class="SchBox">
        <form action="" method="get" onsubmit="">
            <input type="hidden" name="mid" value="dd">
            <input type="text" maxlength="40" class="exlSt" name="search_keyword" placeholder="검색어를 입력하세요">
            <span class="button">
                <input type="submit" value="검색">
            </span>
        </form>
    </div>
    <div class="homepage-image">
        <img src="https://media.istockphoto.com/id/1482199015/ko/%EC%82%AC%EC%A7%84/%ED%96%89%EB%B3%B5%ED%95%9C-%EA%B0%95%EC%95%84%EC%A7%80-%EC%9B%A8%EC%9D%BC%EC%8A%A4-%EC%96%B4-%EC%BD%94%EA%B8%B0-14-%EC%A3%BC%EB%A0%B9-%EA%B0%9C%EA%B0%80-%EC%9C%99%ED%81%AC%ED%95%98%EA%B3%A0-%ED%97%90%EB%96%A1%EC%9D%B4%EA%B3%A0-%ED%9D%B0%EC%83%89%EC%97%90-%EA%B3%A0%EB%A6%BD%EB%90%98%EC%96%B4-%EC%95%89%EC%95%84-%EC%9E%88%EC%8A%B5%EB%8B%88%EB%8B%A4.jpg?s=612x612&w=is&k=20&c=CkTkWxs_QitkIcwMhbE155bnuLBoRBQ_AQaDNRh0Bh8=" alt="강아지">
    </div>
    <nav class="navbar">
        <ul>
            <li>
                <a href="">
                    <i class="fa-solid fa-hotel"></i>
                    <p>호텔</p> 
                </a>
            </li>
            <li>
                <a href="">
                    <i class="fa-solid fa-umbrella-beach"></i>
                    <p>리조트</p> 
                </a>
            </li>
            <li>
                <a href="">
                    <i class="fa-solid fa-tents"></i>
                    <p>캠핑장</p> 
                </a>
            </li>
            <li>
                <a href="">
                    <i class="fa-solid fa-question"></i>
                    <p>고객센터</p> 
                </a>
            </li>
        </ul>
    </nav>
    <main class="main-content">
        <section class="container">
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
    <footer>
        <p>Copyright 2024. 함께하개 All Rights Reserved</p>
    </footer>
    <button onclick="topFunction()" id="topBtn" title="Go to top">
      <i class="fas fa-chevron-up"></i>
    </button>
    
</body>
</html>
