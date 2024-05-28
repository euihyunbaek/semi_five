<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입</title>
    <link rel="stylesheet" href="/app/resources/css/member/join.css">
    <script defer src="/app/resources/js/member/join.js"></script>
	<%@ include file="/WEB-INF/views/layout/util.jsp" %>

	
</head>
<body>

        <%@ include file="/WEB-INF/views/layout/header.jsp" %>

    <main>
      <section>

        <form action="/app/member/join" method="post">
            <div> 
              <label for="name">이름</label>
              <input type="text" id="userName" name="name" placeholder="성함을 입력해주세요" required>
            </div>
            <div>
              <label for="id">아이디</label>
                <input type="text" id="userId" name="id" placeholder="아이디 " required>
                <button type ="button" onclick="checkDup();">중복확인</button>
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
              <input type="text" name="nick" placeholder="닉네임을 입력해주세요" maxlength="12" required>
            </div>
            <div>
              <label for="phone">
                전화번호
              </label>
              <input type="text" name="phone" placeholder=" '-'제외 11자리 입력(01012345678)" maxlength="12">
            </div>
            <div>
              <label for="email">
                이메일
              </label>
              <input type="email" id="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" 
              placeholder="e.g) honggildong@naver.com"
              required>

            </div>
            <div>
              <label>프로필사진</label>
              <input type="file" name="profile" >
            </div>  


            <div>
              <button type="submit"id="memberjoin" >회원가입</button>
            </div>

        </form>

      </section>



    </main>

        <%@ include file="/WEB-INF/views/layout/footer.jsp" %>

</body>
</html>
    