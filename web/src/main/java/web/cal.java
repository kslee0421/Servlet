package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class cal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public cal() {
        super();  
    }

	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("data1");
		String b = request.getParameter("data2");

		index in = new index();
//	 위와같은 말	new index().test();
		String result = in.test(a,b); //위에서 파라메타로 받은 값을 test로 던지자
	}

}