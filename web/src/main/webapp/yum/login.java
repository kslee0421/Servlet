package web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public login() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String uid =  request.getParameter("uid").intern();
		String upw =  request.getParameter("upw").intern();  //사용자가 입력 패스워드(미암호화)
		
		//원래 밖으로 빼야되는 부분
		dbconfig db = new dbconfig();
		PreparedStatement ps = null;
		try {
			Connection con = db.dbinfo();   //DB환경설정 연결
			String password = "select password('"+upw+"') as pwd";   //사용자가 입력한 패스워드 암호화시킴
			ps = con.prepareStatement(password);
			//execute() => int(X),String(X),boolean(O), executeUpdate() => int  //execute는 boolean으로 쓰임
			//executeQuery() => ResultSet(O) , select 전용
			ResultSet result = ps.executeQuery();
			while(result.next()) {
				System.out.println(result.getString("pwd"));				
			}
			
			ps.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println("DB 접속 오류 사항 발생!");
		}
		
	}

}
