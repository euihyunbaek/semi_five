<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <header class="header">
        <div  class="menu">
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
    <c:when test="${sessionScope.loginBizMemberVo != null}">
        <a href="/app//business/mypage" class="mypage">
            <i class="fa-solid fa-bars"></i>
        </a>
    
    </c:when>

    <c:otherwise>
        <a href="/app/login" class="mypage">
            <i class="fa-solid fa-bars"></i>
        </a>
    </c:otherwise>
   
   </c:choose>
        </div>
        <div class="menu">
            <a href="/app/home" class="mypage">
                <i class="fa-solid fa-house"></i>
            </a>
        </div>
    </header>