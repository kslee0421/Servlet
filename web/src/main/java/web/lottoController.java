package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class lottoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public lottoController() {
        super();  
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("no1");
		String b = request.getParameter("no2");
		String c = request.getParameter("no3");
		String d = request.getParameter("no4");
		String e = request.getParameter("no5");
		String f = request.getParameter("no6");		
		
		index in = new index();
//	 위와같은 말	new index().test();
	//문자 값을 문자메소드로 전달 -> 최종 결과값을 문자로 받음
		//1. String result = in.test(a,b); //위에서 파라메타로 받은 값을 test로 던지자
		//2. String result = in.test2(Integer.parseInt(a),Integer.parseInt(b));
		//3. 문자값을 숫자로 변환 후 -> Modeule로 값을 전달 후 결과값을 문자로 받는 형태
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		int cc = Integer.parseInt(c);
		int dd = Integer.parseInt(d);
		int ee = Integer.parseInt(e);
		int ff = Integer.parseInt(f);
		
		
		System.out.print(aa);
		System.out.print(bb);
		System.out.print(cc);
		System.out.print(dd);
		System.out.print(ee);
		System.out.print(ff);
		System.out.printf("%s %s %s %s %s %s",aa,bb,cc,dd,ee,ff);
	}
//	int : 타입 
//	Integer: 매개변수의 객체 

}
