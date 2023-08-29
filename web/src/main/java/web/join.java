package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class join extends HttpServlet {
	private static final long serialVersionUID = 1L;
    dbconfig  db =null;   
    PreparedStatement ps = null;
    public join() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String sid = request.getParameter("sid").intern();
		String sname = request.getParameter("sname").intern();
		String spw = request.getParameter("spw").intern();
		String scom = request.getParameter("scom").intern();
		String stel = request.getParameter("stel").intern();
		String semail = request.getParameter("semail").intern();
		PrintWriter pw = response.getWriter(); //스크립트 출력
		if (sid==""||sname==""||spw==""||scom=="") {
			pw.write("<script>"
					+"alert('올바른 정보가 전달 되지 않으셨습니다');"
					+"history.go(-1);"
					+"</script>");
		}else {
			try {
				this.db = new dbconfig();
				Connection con = this.db.dbinfo();
				//람다식 형태의 코드로 작성
				String sql = "insert into shop values("
				+"'0',?,?,password(?),?,?,?,now(),'Y')"; //람다식 방식 ?만 세서 1번  부터
				this.ps = con.prepareStatement(sql);
				this.ps.setString(1, sid);
				this.ps.setString(2, sname);
				this.ps.setString(3, spw);
				this.ps.setString(4, scom);
				this.ps.setString(5, stel);
				this.ps.setString(6, semail);
				int call = this.ps.executeUpdate();
				String msg =  "";
				System.out.println(call);
				if(call > 0) {
					msg ="정상적으로 가입이 완료 되었습니다";
					pw.write("<script> alert('"+msg+"'); location.href='./login.html';</script>");
				}
				else{
					msg ="가입이 원할하게 진행 되지 않았습니다";
				};
				pw.close();
				this.ps.close();
				con.close();
			}
			catch(Exception e) {
				System.out.println("Database 정보 오류!!");
			}
		}
		
	}

}
