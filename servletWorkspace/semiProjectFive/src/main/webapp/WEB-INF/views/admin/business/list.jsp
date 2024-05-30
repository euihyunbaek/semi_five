<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>user_list</title>
  <link rel="stylesheet" href="/app/resources/css/admin/member/list.css">
        <%@ include file="/WEB-INF/views/layout/util.jsp" %>

  <script defer src="/app/resources/js/admin/business/list.js"></script>


</head>
<body>
  <header>
    <div class="menu"><a href="/app/home">홈</a></div>
    <div class="menu"><a href="/app/admin/menu">메뉴</a></div>

  </header>
  <div class="SchBox">
    <form action="" method="get" onsubmit="">
      <input type="hidden" name="mid" value="dd">
      <select name="search_target" class="exlSt">
        <option value="title">아이디</option>
        <option value="content">닉네임</option>
      </select>
      <input type="text" maxlength="40" class="exlSt" name="search_keyword">
      <span class="button">
        <input type="submit" value="검색">
      </span>
    </form>
  </div>
    <nav>
        <ul>
            <li><a href="#">전체</a></li>
            <li><a href="/app/admin/member/list">일반회원</a></li>
            <li><a href="/app/admin/business/list">사업자</a></li>
        </ul>
    </nav>
    <main>
        <section>

            <table border="1">
              <thead>
                <tr>
                  <th>번호</th>
                  <th>아이디</th>
                  <th>닉네임</th>
                  <th>가입일자</th>
                  <th><input type="checkbox" id ="selectAll"></th>
                </tr>
              </thead>
              <tbody>

                 <c:forEach items="${voList}" var="vo">
              	  <tr>
                  <td>${vo.no}</td>
                  <td>${vo.id}</td>
                  <td> <a href="/app/admin/business/detail?no=${vo.no}">${vo.nick}</a></td>
                  <td>${vo.enrollDate}</td>
                  <td><input type="checkbox" class="ck" value="${vo.no}"></td>
              	  </tr>
                  </c:forEach>
               
              </tbody>
              <tfoot>
                <td colspan="5">
                  <div>
                    <div><button onclick="deleteUser();">추방하기</button></div>
                    <div><button onclick="approveBiz();">승인하기</button></div>
                  </td>

              </tfoot>
            </table>



        </section>
    </main>

    <div class="page-wrap">
    <div class="page-area">
				<c:if test="${pvo.currentPage > 1}">
					<button onclick = "location.href='/app/admin/business/list?pno=${pvo.currentPage-1}'">이전</button>
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
						<a href="/app/admin/business/list?pno=${x}">
						${x}
						</a>
					</c:if>
				</c:forEach>
				<c:if test="${pvo.currentPage < pvo.maxPage }">
					<button onclick = "location.href='/app/admin/business/list?pno=${pvo.currentPage+1}'">다음</button>
				</c:if>
				</div>
    </div>

    <footer>
        <p>Copyright2024.함께하개 All Rights Reserved</p>
    </footer>
</body>
</html>