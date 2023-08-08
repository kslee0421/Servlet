package web;
//Controller servlet으로만들면 Controller
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class main extends HttpServlet {
	//웹 통신에 사용하기 위한 암호화된 페이지 명시한 메모리 형태의 명령어
	private static final long serialVersionUID = 1L; //2L도 해도됨 건들일이 없음
       

    public main() {
        super();
  
    }// Class명과 method 명이 같으면 즉시 실행  : 즉시실행 메소드

	//doGet = Method Get전송시 사용
/*	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("data");
		System.out.println(a);
	}
*/
	//doPost = method Post전송시 사용
    
    
    /*
      HttpServletRequest : Front에서 값을 넘겨받는 통신 언어
      HttpServletResponse : 결과값을 출력 또는 Front로 return하는 통신언어
      getParameter : Front에 사용하는 name명 입니다.(모든 데이터는 문자 또는 boolean 형태로 구성)
     */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("data");
		System.out.println(a);
	}

}
