package homework;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Controll")
public class Controll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Controll() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");  //한글이 안뜬다 이거해야한다
		
		String usernm =request.getParameter("usernm").intern();
		String userid =request.getParameter("userid").intern();
		String userem =request.getParameter("useremail").intern();
	//	System.out.println(usernm + userem);
		
		String members[][] = {
				{"장진호","배유미","염무원","김승균","김경민","장진호","김경민"},			 
				{"jang_ho@nate.com","bae_mi@nate.com","number1@gmail.com","kim@nate.com","min@nate.com","ho@naver.com","k_min@gmail.com"},
				{"jang_ho","bae_mi","number1","kim","min","ho","k_min"}
		};
		
		int w =0;
		int count= 0; //데이터 확인 후 동일한 결과일 경우 1, 데이터가 없을 경우 0
		int ea = members[0].length;
		String msg ="";
		while (w <ea) { 
			if(usernm == members[0][w] && userid == members[1][w] && userem == members[2][w]) {
						count = 1;
						msg="임시 패스워드 : a123456";
						break;						
			}
			w++;
		}
		if(count==0) { // 해당 배열에 조건이 아무것도 매칭이 되지 않을 경우  
			msg ="해당 정보를 확인하지 못하였습니다.";
		}
		System.out.println(msg);
		PrintWriter pw = response.getWriter();
		pw.write(msg);
	}
}


