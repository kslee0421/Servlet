package example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public search() {
        super();

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//java, servlet, spring 모두 한글 형태가 출력이 안됨(WEB)
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");  //한글이 안뜬다 이거해야한다
		
		String usernm =request.getParameter("usernm").intern();
		String userem =request.getParameter("useremail").intern();
	//	System.out.println(usernm + userem);
		
		/*
		 응용문제 5.
		 아이디 찾기 기능을 완성해야 합니다. 배열 데이터값을 확인하여 이름과 이메일이 동일한 정보일 경우
		 결과값을 출력하며, 만약 이름과 이메일 정보중 틀릴경우 error라는 메세지를 콘솔로 출력합니다.
		 맞을 경우 아이디 출력
		 */
		String members[][] = {
				{"장진호","배유미","염무원","김승균","김경민","장진호","김경민"},
				{"jang_ho@nate.com","beae_mi@nate.com","nmber1@gmail.com",
				"kim@nate.com","min@nate.com","ho@naver.com","k_min@gmail.com"},
				{"jang_ho","beae_mi","nmber1","kim","min","ho","k_min"}		
		};
		
		int w =0;
		int count= 0; //데이터 확인 후 동일한 결과일 경우 1, 데이터가 없을 경우 0
		int ea = members[0].length;
		String msg ="";
		while (w <ea) {
			if(usernm == members[0][w]) {  //이름 검토 &&로 써도 된다
				//System.out.println(members[0][w]);				
				if(userem == members[1][w]) { //이메일 검토
					//System.out.println(members[2][w]);
					count = 1;  //모두가 있을때 최종에 count를 1을 줬기때문에  count=0이 없어도됨
								//이름과 이메일이 동일 할 경우 카운팅 값을 변화시킴
					msg=members[2][w];
					break;
				}
			}
			w++;
		}
		if(count==0) { // 해당 배열에 조건이 아무것도 매칭이 되지 않을 경우  
			msg ="error";
		}
		//System.out.println(msg);
		PrintWriter pw = response.getWriter();
		pw.write(msg);
	}

}
