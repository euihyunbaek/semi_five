<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <nav class="navbar">
        <ul>
            <li>
                <a href="/app/stay/detail/bio?no=${requestScope.vo.no}">
                    <div>숙소 소개</div>
                </a>
            </li>
            <li>
                <a href="./stay_detail_review/stay_detail_review.html">
                    <div>리뷰</div>
                </a>
            </li>
            <li>
                <a href="/app/reservation/book?no=${requestScope.vo.no}">
                    <div>객실예약</div>
                </a>
            </li>
            <li>
                <a href="/app/stay/detail/photo?no=${requestScope.vo.no}">
                    <div>사진</div>
                </a>
            </li>

        </ul>
    </nav>