<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
        <%@ include file="/WEB-INF/views/layout/util.jsp" %>
    
    <link rel="stylesheet" href="/app/resources/css/login.css">
    <script defer src="/app/resources/js/login.js"></script>
    
</head>
<body>
    <div class="container">
       
        <div class="tabs">
            <button onclick="changeFormMember()" id="generalTab" class="tab active">회원</button>
            <button onclick="changeFormBiz()" id="businessTab" class="tab">사업자</button>
            <button onclick="changeFormAdmin()" id="adminTab" class="tab">관리자</button>
        </div>
        <form action="/app/member/login" method="post" id="loginForm" class="active" >
            <div class="input-group">
                <label for="username">아이디</label>
                <input type="text" id="userId" name="id" placeholder="아이디를 입력하세요">
            </div>
            <div class="input-group">
                <label for="password">비밀번호</label>
                <input type="password" id="password" name="pwd" placeholder="비밀번호를 입력하세요">
            </div>
            <button type="submit">Login</button>
        </form>
        <form action="/app/biz/login" method="post" id="bizLoginForm">
            <div class="input-group">
                <label for="username">사업자 아이디</label>
                <input type="text" id="userId" name="id" placeholder="아이디를 입력하세요">
            </div>
            <div class="input-group">
                <label for="password">비밀번호</label>
                <input type="password" id="password" name="pwd" placeholder="비밀번호를 입력하세요">
            </div>
            <button type="submit">Login</button>
        </form>
        <form action="/app/admin/login" method="post" id="adminLoginForm">
            <div class="input-group">
                <label for="username">관리자 아이디</label>
                <input type="text" id="userId" name="id" placeholder="아이디를 입력하세요">
            </div>
            <div class="input-group">
                <label for="password">비밀번호</label>
                <input type="password" id="password" name="pwd" placeholder="비밀번호를 입력하세요">
            </div>
            <button type="submit">Login</button>
        </form>
    </div>


</body>
</html>
