package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 응용문제1. 
 모바일에서 login.jsp에서 넘어온 아이디, 패스워드를 이용하여
 session을 통하여 정상적으로 로그인이 되도록 하며,
 로그인이 완료되었을 경우 index2.jsp로 이동 되도록 합니다.
 
 아이디 /패스워드 (Free)
 단, session은 아이디와 이름만 생성 합니다.
 session명은 다음과 같습니다/
 아이디 : perid
 이름 pernm
 
 아이디와 패스워드가 하나라도 미일치시 "회원정보를 다시한번 확인하세요"
 */
import javax.servlet.http.HttpSession;

@WebServlet("/m/mlogin.do")
public class mlogin extends HttpServlet {
	RequestDispatcher rd = null;
	private static final long serialVersionUID = 1L;
   
    public mlogin() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType ("text/html;charset=utf-8");
		String id = request.getParameter("mid").intern();
		String pwd = request.getParameter("mpass").intern();
		
		HttpSession se= request.getSession();
		PrintWriter pw = response.getWriter();
		if(id==""|| pwd=="") {
			pw.write("<script>alert('값 전달 오류 입니다');"
					+"history.go(-1);"
					+"</script>");		
		}else {
			if(id=="hong" && pwd=="a1234") {
				se.setAttribute("perid",id);
				se.setAttribute("pernm","이경선");
				pw.write("<script>"
						+ "alert('로그인 되셨습니다.');"
						+ "location.href='./index2.jsp';"
						+ "</script>");
			}else {
				pw.write("<script>"
						+ "alert('아이디 패스워드를 확인하세요');"
						+ "history.go(-1);"
						+ "</script>");
			}
		}
		pw.close();
	}	

}
