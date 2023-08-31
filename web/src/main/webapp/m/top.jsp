<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String user_id="";
	String user_name =""; 
	try{
	user_id = session.getAttribute("perid").toString(); //""로뜸
    user_name =session.getAttribute("pernm").toString();
    
    /*user_id = session.getAttribute("perid").toString();  //null로 뜸
    user_name =session.getAttribute("pernm").toString();*/

    /*user_id = String.valueOf(session.getAttribute("perid"));
    user_name = String.valueOf(session.getAttribute("pernm")); //문자 null로뜸*/
    
	}
	catch(Exception e){
		
	}
%>
<script>
function gopage(){
	location.href='./login.jsp';
}
</script>
<div>
<% if(user_id==""|| user_id==null){ %>
<span onclick="gopage()">로그인</span>
<%  } else { %>
<span><%=user_name%>님 환영합니다.</span><a href="./mlogout.jsp">[로그아웃]</a>
<% } %>
</div>