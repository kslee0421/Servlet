package example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public controller() {
        super();

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter prw =response.getWriter();
		
		String id =request.getParameter("userid").intern();  //연산기호 쓸수 있게 intern 붙이기
		String pw =request.getParameter("userpw").intern();
		//System.out.printf("%s %s",id,pw);
		
		String list[] = {"hong", "kim","park","apink"};
		String passwd[] = {"a1234","b1324","c1234","apink"};
		//System.out.println("test");
		/*
		 응용문제 1.
		 해당 2개의 배열을 이용하여 다음과 같은 결과 값으로 출력되도록 하시오
		 예시)
		 	hong
		 	a1234
		 	kim
		 	b1234
		 	park
		 	c1324
		 	apink
		 	apink
		  */
		/*단,id 아이디가 없을 경우 "가입되지 않은 사용자 입니다. " 메세지 출력
		패스워드가 틀릴경우 "해당 패스워드를 확인하세요". 메세지 출력*/
 		//ver1.
		// for(int i=0; i<list.length; i++ ) {
		//	System.out.println(list[i]);
		//	System.out.println(passwd[i]);
		//};
		String msg="";
		int w =0;
		int count= 0;
		while (w <list.length) {
			//System.out.println(list[w]);
			//System.out.println(passwd[w]);
			if(id == list[w]) {
				count = 1;  //배열에 아이디가 있을 경우 1로 변경
				if(pw == passwd[w]) {
					msg="<script>alert('로그인이 되었습니다.');</script>";
					break;
				}
				else 
				{
					msg="<script>alert('해당 패스워드를 확인하세요.');history.go(-1);</script>";
					break;		
				}
			}
			w++;
		}
		if(count==0) { //반복문 종료시 해당 변수값이 변함이 없을 경우
			// history.go(-1) : 전단계 페이지로 이동하는 script언어
			// history.go(-2) : 전전단계 페이지로 이동하는 script언어
			msg="<script>alert('가입되지 않은 사용자입니다.'); history.go(-1);</script>";
		}
		prw.write(msg);
		//response.setContentType("text/html; charset=utf-8");
		//PrintWriter pw =response.getWriter();
		//pw.write("<script>alert('가입되지 않은 사용자 입니다.');</script>");
	}

}
