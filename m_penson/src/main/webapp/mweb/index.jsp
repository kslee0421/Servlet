<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>호텔 & 펜션 예약시스템</title>
    <link rel="stylesheet" type="text/css" href="./css/m_index.css?v=1">
    <script src="./js/m_index.js?v=1" defer></script>
    <script src="./js/top.js?v=1" defer></script>
</head>
<body>
<!-- 상단 시작 -->
<%@ include file="./top.jsp"%>
<!-- 상단 끝 -->
<main>
<!-- 배너 시작 -->
<%@ include file="./banner.jsp"%>
<!-- 배너 시작 -->
<!-- 중단 시작 -->
<%@ include file="./main.jsp"%>
<!-- 중단  끝-->
<!-- 퀵메뉴 시작-->
<%@ include file="./qmenu.jsp"%>
<!-- 퀵메뉴 끝-->
</main>
<!-- 하단 시작-->
<footer>
<%@ include file="./copy.jsp"%>
</footer>
<!-- 중단 끝-->
</body>
</html>