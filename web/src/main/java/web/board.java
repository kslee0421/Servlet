package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(  //필수조건
		 //업로드한 파일의 크기를 측정 당, 첨부파일 크기보다 클 경우 temp 디렉토리 저장됨
		fileSizeThreshold = 1024*1024*1,  //1MB
		//업로드 가능한 최대 크기 즉, 첨부파일 갯수를 모두 합한 용량
		maxFileSize = 1024*1024*10, // 10MB
		//전체 multipart의 크기를 말한다
		maxRequestSize = 1024 * 1024* 100 //100MB
		
)
public class board extends HttpServlet {
    dbconfig  db =null;   
    PreparedStatement ps = null;
	private static final long serialVersionUID = 1L;
       

    public board() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		Part file =request.getPart("file"); //파일은 바이너리므로 파트로 받는다
		//System.out.println(file.getName()); //name값명
		//System.out.println(file.getSize()); //파일 사이즈
		//System.out.println(file.getHeaderNames()); //파일에 대한 속성
		//System.out.println(file.getSubmittedFileName()); //파일명이 나온다
		String filenm = file.getSubmittedFileName().intern();
		if(filenm=="") {
			System.out.println("첨부파일없음");
		}
		else {
			System.out.println("첨부파일이있음");
		}
		String btitle = request.getParameter("btitle").intern();
		String bname = request.getParameter("bname").intern();
		String bpass = request.getParameter("bpass").intern();
		String bfile = request.getServletContext().getRealPath("/upfile/");
		String bcon = request.getParameter("bcon").intern();
		PrintWriter pw = response.getWriter(); //스크립트 출력
		if (bname==""||bpass==""||bcon=="") {
			pw.write("<script>"
					+"alert('올바른 정보가 전달 되지 않으셨습니다');"
					+"history.go(-1);"
					+"</script>");
		}else {
			try {
				this.db = new dbconfig();
				Connection con = this.db.dbinfo();
				//람다식 형태의 코드로 작성
				String sql = "insert into board values("
				+"'0',?,?,password(?),?,?,now(),'0')"; //람다식 방식 ?만 세서 1번  부터
				this.ps = con.prepareStatement(sql);
				this.ps.setString(1, btitle);
				this.ps.setString(2, bname);
				this.ps.setString(3, bpass);
				this.ps.setString(4, bfile);
				this.ps.setString(5, bcon);
				int call = this.ps.executeUpdate();
				String msg =  "";
				//System.out.println(call);
				if(call > 0) {
					msg ="정상적으로 작성이되었습니다.";
					pw.write("<script> alert('"+msg+"'); location.href='./list.html';</script>");
				}
				else{
					msg ="비정상적인 접근 입니다.";
				};
				pw.close();
				this.ps.close();
				con.close();
			}
			catch(Exception e) {
				System.out.println("Database 정보 오류!!");
				System.out.println(e);
			}
		}
		
	}

}
