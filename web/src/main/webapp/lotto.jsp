<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과값 출력 View 파트</title>
</head>
<body>
<!--getAttribute:Controller에서 가상 객체명을 받아서 출력하는 메소드 입니다.-->

숫자1 : <%=request.getAttribute("total") %>
숫자2 : <%=request.getAttribute("name") %>
숫자2 : <%=request.getAttribute("name") %>
<br><br><br>
<div id ="box"></div>
<script>
//Controller 데이터 값을 자바스트립트 변수로 받은 루 HTML에 직접 출력하는 형태
var total = "<%=request.getAttribute("total") %>";
document.getElementById("box").innerHTML ="최종데이터" +total;
</script>
</body>
</html>