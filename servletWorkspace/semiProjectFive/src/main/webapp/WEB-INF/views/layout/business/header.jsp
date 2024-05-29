<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layout/util.jsp" %>
    <!--  <div class="heading-space">
      <h2>사업자 마이페이지</h2>
      <div class="buttons">
        <div id="home-button">
          <a id="home-anchor" href="/app/home"><i class="fi fi-rr-home"></i></a>
        </div>
        <div id="sidb-bar-btn">
          <a id="logout" href="/app/business/logout"><i class="fi fi-rr-exit"></i></a>
        </div>
      </div>
    </div> -->
    <div class="login-space">
      <div id="login-img-space">
        <img id="login-img" src="./resources/img/abc3.png" width="40px" height="40px" alt="로그인사진">
      </div>
      <div id="login-info-space">
      	<c:if test="${not empty sessionScope.loginMemberVo}">
      		<span>${sessionScope.loginMemberVo.nick} </span>
      	</c:if>
        님 환영합니다!
      </div>
    </div>