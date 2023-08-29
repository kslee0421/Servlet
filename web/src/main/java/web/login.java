package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet {
    dbconfig  db =null;   
    PreparedStatement ps = null;
	private static final long serialVersionUID = 1L;
    public login() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String uid =  request.getParameter("uid");
		String upw =  request.getParameter("upw");
		//원래 밖으로 빼야되는 부분
		dbconfig db = new dbconfig();
		PreparedStatement ps = null;
		try {
			Connection con = db.dbinfo();   //DB환경설정 연결
			String password = "select password('"+upw+"') as pwd";   //사용자가 입력한 패스워드 암호화시킴
			ps = con.prepareStatement(password);
			//execute() => int(X),String(X),boolean(O), executeUpdate() => int  //execute는 boolean으로 쓰임
			//executeQuery() => ResultSet(O) , select 전용
			ResultSet rs = ps.executeQuery(); //ResultSet => select된 값을 배열화
			String user_pw = null;
			while(rs.next()) { //rs.next() => true, false 
				//System.out.println(rs.getString("pwd"));
				user_pw = rs.getString("pwd").intern(); //getString("as 컬럼명")
			}
			con.close();
			
			/* 사용자 아이디와 패스워드를 database에서 가져오는 코드*/
			Connection con2 =db.dbinfo();
			String sql = "select * from shop where sid=? and son='Y'";
			ps = con2.prepareStatement(sql);
			ps.setString(1, uid); //아이디값
			ResultSet rs2 = ps.executeQuery();
			//execute() => boolean(0)
			//executeUpdate() => int(insert,update,delete,alter,create)
			//executeQuery() => select전용 Resultset(배열)
			String sql_id = ""; //DB에 저장된 사용자 아이디
			String sql_pw = ""; //DB에 저장된 사용자 패스워드
			String sql_use = ""; //로그인 가능한지 Y/N
 			while(rs2.next()) { //Database에서 문자형 변수로 변환 작업하는 코드
				sql_id = rs2.getString("sid").intern();
				sql_pw = rs2.getString("spass").intern();
				sql_use = rs2.getString("son").intern(); //f로그인 유/무
			}
 			con2.close();
 			ps.close();
 			PrintWriter pw = response.getWriter();
 			if(sql_id=="") {  //sql문법 실행시 해당 정보가 없을 경우 
 				pw.write("<script>alert('해당 사용자 정보를 확인하지 못하였습니다.');"
 						+ "history.go(-1);</script>");
 			}else { //id가 확인 되고, 패스워드를 검토할 때 사용
 	 			if(sql_pw==user_pw) { //동일한 패스워드일 경우
 	 				if(sql_use=="Y") {
 	 					pw.write("<script>alert('로그인 하셨습니다.');</script>");
 	 				}else {
 	 					pw.write("<script>alert('관리자 권한으로 로그인 하실 수 없습니다');"
 	 	 						+ "history.go(-1);</script>");
 	 				}
 	 			}else {
 	 				pw.write("<script>alert('패스워드가 틀립니다');"
 	 						+ "history.go(-1);</script>");
 	 			}
 			}
 			pw.close();
		}
		catch(Exception e) {
			System.out.println("DB 접속 오류 사항 발생!");
		}
		
	}

}
