<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
//공백제거 trimDirectiveWhitespaces="true" 기본이 false
//out.print에서 jsp 문법을 공백으로 인식해버림
//true일때 문법만 공백없이 적용시킴
/*  response.addHeader : CORS(도메인 다른 경우, 외부서버에서 접속을 할 때 보안상 접속을 자동 차단) 
	-접속 허가를 해주는 클래스*/
	response.addHeader("Access-Control-Allow-Origin", "*");
	response.addHeader("Access-Control-Allow-Credentials", "true");
	//intern 문자열을 연산 기호로 조건문 사용할 수 있도록하는 클래스
	String userid = request.getParameter("mid").intern();
	String msg ="";
	//Database : select 로 row 확인 작업
	
	if(userid=="admin"){
		msg ="no";
	}
	else if(userid==""){
		msg="error";
	}
	else{
		msg ="yes";
	}
	out.print(msg);  //ajax 로 요천한 사항을 Front-end에게 return한 결과 값 
%>