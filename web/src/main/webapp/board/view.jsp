<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//문자열로 getAttribut 변환
/* 
변환방식 : (String ), toString(), String.valueOf()
*/
	String url = request.getAttribute("dbfile").toString(); //getAttribute는 문자로 바꿔야한다
	out.print("<script>alert('정상적으로 첨부파일이 저장 완료 되었습니다.');</script>");
%>
<script>
alert
</script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 확인 </title>
</head>
<body>
[첨부파일]
<a herf="<%=url%>">[첨부파일]</a>
</body>
</html>