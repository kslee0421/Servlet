package web;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
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
		
		//날짜 => 파일 업로드시 같은 이름일 경우 덮어쓰는 현상을 막기 위해서 사용함
		Date time = new Date(); //Data (java.util)
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
		String timetext = sf.format(time);
		//첨부파일 용량
		int filesize= (int)file.getSize();
		//String filenm = file.getSubmittedFileName().intern();
		//첨부파일 저장 공간
		String savepath =request.getServletContext().getRealPath("/board/upload/"); //디렉토리 파일 웹경로에 만들어놓기
		//업로드시 사용하는 파일명
		String filename = timetext + "_"+file.getSubmittedFileName();
		//실제 저장되는 형태
		String uploadfile = savepath + filename ;
		//[Stream으로 첨부파일 처리]
		InputStream is =file.getInputStream();//스트림으로 변환
		FileOutputStream fs = new FileOutputStream(uploadfile); //스트림이므로 바이트다
		
		System.out.println(savepath); //서버의 경로
		if(filesize==0) {
			//첨부파일이 없을 때의 SQL
			System.out.println("첨부파일없음");
		}
		else {
			byte[] buf = new byte[is.available()];// 사용자가 첨부한 파일 만큼 크기 늘려주겠다
			int size = 0;
			while ((size = is.read(buf))!=-1) {
				fs.write(buf,0,size);  
				fs.flush();//스트림일때는 버퍼 안써도 된다
			}
			fs.close();
			is.close();
			System.out.println("첨부파일이있음");
		}
		//경로지정 (DB에 저장되는 경로 갈음)
		String dbfile = "./upload/"+filename;
	
		//View로 출력 (view.jsp 전달)
		request.setAttribute("dbfile", dbfile); //별명,변수명
		RequestDispatcher ds = request.getRequestDispatcher("./view.jsp");
		ds.forward(request, response);
		
		String btitle = request.getParameter("btitle").intern();
		String bname = request.getParameter("bname").intern();
		String bpass = request.getParameter("bpass").intern(); 
		//String bfile = request.getServletContext().getRealPath("/upfile/");
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
				this.ps.setString(4, filename);
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
