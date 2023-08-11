package example;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public insert() {
        super();

    
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		//name값이 1개 이상 동일한 사항일 경우 getParameterValues 메소드로 받아서 처리합니다.
		String user[] = request.getParameterValues("user");
		//System.out.println(Arrays.toString(user));
		int ea =user.length;
		//System.out.println(ea);
		ArrayList<String> as = new ArrayList<String>(); //<> : 자료형이 뭐니??
		//System.out.println(ar.size());
		int w =0;
//		while(w< user.length) {
//			if(user[w]!=""){
//				//System.out.println(user[w]);
//				as.add(user[w]);
//			}
//			w++;
//		};
		for(int f = 0; f < ea; f++) {
			if(user[f]!="") {				
				as.add(user[f]);
			}
		}
		System.out.println(as);
	}

}
