<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>stay-bio</title>
<%@ include file="/WEB-INF/views/layout/util.jsp"%>
<link rel="stylesheet"
	href="/app/resources/css/staydetail/staydetail.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css"
	integrity="sha512-Avb2QiuDEEvB4bZJYdft2mNjVShBftLdPG8FJ0V7irTLQ8Uo0qcPxh4Plq7G5tGm0rU+1SPhVotteLpBERwTkw=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
	<%@ include file="/WEB-INF/views/layout/staydetail/header.jsp"%>

	<%@ include file="/WEB-INF/views/layout/staydetail/thumbnail.jsp"%>
	<%@ include file="/WEB-INF/views/layout/staydetail/stayinfo.jsp"%>

	<%@ include file="/WEB-INF/views/layout/staydetail/nav.jsp"%>



	<main class="main-content">
		<section class="photo-container">

			<div class="column" id="column1">

				<c:set var="list" value="${picVoList}" />

				<c:forEach var="pic" items="${picVoList}" varStatus="status">
					<c:if test="${status.index % 2 == 0}">
						<img src="/app/resources/upload/stay/${pic.changeName}" alt="Image" />
					</c:if>
				</c:forEach>

			</div>


			<div class="column" id="column2">
				<!-- 반복문 -->
				<c:forEach var="pic" items="${picVoList}" varStatus="status">
					<c:if test="${status.index % 2 != 0}">
						<img src="/app/resources/upload/stay/${pic.changeName}" alt="Image" />
					</c:if>
				</c:forEach>
			</div>




		</section>
	</main>

	<%@ include file="/WEB-INF/views/layout/footer.jsp"%>

	<button onclick="topFunction()" id="topBtn" title="Go to top">
		<i class="fas fa-chevron-up"></i>
	</button>

</body>
</html>
