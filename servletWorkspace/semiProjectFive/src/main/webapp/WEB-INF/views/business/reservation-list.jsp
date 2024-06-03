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
      <h2 id="title">예약요청 조회</h2>
      <div class="buttons">
        <div id="home-button">
          <a id="home-anchor" href="./home.html"><i class="fi fi-rr-home"></i></a>
        </div>
        <div id="logout-btn">
          <a id="logout" href=""><i class="fi fi-rr-exit"></i></a>
        </div>
      </div>
    </div>
    <div class="login-space">
      <div id="login-img-space">
        <img id="login-img" src="./resources/img/abc3.png" width="85px" height="40px" alt="">
      </div>
      <div id="login-info-space">
        ABC님 환영합니다!
      </div>
    </div>
  </header>
  <main>
    <div id="container">
      <table border="1" id="table">
        <tr>
          <th>101호 - 스탠다드룸</th>
          <td rowspan="2">Jan 01, 2024 - Jan 04, 2024</td>
          <td rowspan="2"><button class="detailbtn">상세정보</button></td>
        </tr>
        <tr>
          <td>
            <img id="img1" src="./dd.jpeg" width="20px" height="20px" alt="">
            다미다미 님
          </td>
          <!-- <td></td> -->
          <!-- <td></td> -->
        </tr>
        <tr>
          <th>203호 - 트윈룸</th>
          <td rowspan="2">Feb 04, 2024 - Feb 10, 2024</td>
          <td rowspan="2"><button class="detailbtn">상세정보</button></td>
        </tr>
        <tr>
          <td>
            <img id="img1" src="./dd.jpeg" width="20px" height="20px" alt="">  
            푸들수호대 님
          </td>
          <!-- <td></td> -->
          <!-- <td></td> -->
        </tr>
        <tr>
          <th>203호 - 트윈룸</th>
          <td rowspan="2">Feb 08, 2024 - Feb 11, 2024</td>
          <td rowspan="2"><button class="detailbtn">상세정보</button></td>
        </tr>
        <tr>
          <td>
            <img id="img1" src="./dd.jpeg" width="20px" height="20px" alt="">
            Starlight01 님
          </td>
          <!-- <td></td> -->
          <!-- <td></td> -->
        </tr>
        <tr>
          <th>201호 - 스위트룸</th>
          <td rowspan="2">Mar 17, 2024 - Mar 21, 2024</td>
          <td rowspan="2"><button class="detailbtn">상세정보</button></td>
        </tr>
        <tr>
          <td>
            <img id="img1" src="./dd.jpeg" width="20px" height="20px" alt="">
            Travelbug 님
          </td>
          <!-- <td></td> -->
          <!-- <td></td> -->
        </tr>
        <tr>
          <th>101호 - 스탠다드룸</th>
          <td rowspan="2">Apr 01, 2024 - Apr 04, 2024</td>
          <td rowspan="2"><button class="detailbtn">상세정보</button></td>
        </tr>
        <tr>
          <td>
            <img id="img1" src="./dd.jpeg" width="20px" height="20px" alt="">  
            카푸치노 님
          </td>
          <!-- <td></td> -->
          <!-- <td></td> -->
        </tr>
        <tr>
          <th>203호 - 트윈룸</th>
          <td rowspan="2">May 04, 2024 - May 10, 2024</td>
          <td rowspan="2"><button class="detailbtn">상세정보</button></td>
        </tr>
        <tr>
          <td>
            <img id="img1" src="./dd.jpeg" width="20px" height="20px" alt="">
            couch78 님
          </td>
          <!-- <td></td> -->
          <!-- <td></td> -->
        </tr>
        <tr>
          <th>203호 - 트윈룸</th>
          <td rowspan="2">May 08, 2024 - May 11, 2024</td>
          <td rowspan="2"><button class="detailbtn">상세정보</button></td>
        </tr>
        <tr>
          <td>
            <img id="img1" src="./dd.jpeg" width="20px" height="20px" alt="">
            surfer11 님
          </td>
          <!-- <td></td> -->
          <!-- <td></td> -->
        </tr>
        <tr>
          <th>201호 - 스위트룸</th>
          <td rowspan="2">Jun 17, 2024 - Jun 21, 2024</td>
          <td rowspan="2"><button class="detailbtn">상세정보</button></td>
        </tr>
        <tr>
          <td>
            <img id="img1" src="./dd.jpeg" width="20px" height="20px" alt="">
            청국장 님
          </td>
          <!-- <td></td> -->
          <!-- <td></td> -->
        </tr>
        <tr>
          <th>203호 - 트윈룸</th>
          <td rowspan="2">Jul 08, 2024 - Jul 11, 2024</td>
          <td rowspan="2"><button class="detailbtn">상세정보</button></td>
        </tr>
        <tr>
          <td>
            <img id="img1" src="./dd.jpeg" width="20px" height="20px" alt="">
            BTS정국장 님
          </td>
          <!-- <td></td> -->
          <!-- <td></td> -->
        </tr>
      </table>
    </div>
  </main>
  <a id="top-button">TOP</a>
  <footer>
    <p>Copyright 2024. 함께하개 All Rights Reserved</p>
  </footer>
</body>
</html>