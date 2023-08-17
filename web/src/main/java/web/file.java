package web;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

//파일업로드 기능
@MultipartConfig(
		 //업로드한 파일의 크기를 측정 당, 첨부파일 크기보다 클 경우 temp 디렉토리 저장됨
		fileSizeThreshold = 1024*1024*1,  //1MB
		//업로드 가능한 최대 크기 즉, 첨부파일 갯수를 모두 합한 용량
		maxFileSize = 1024*1024*10, // 10MB
		//전체 multipart의 크기를 말한다
		maxRequestSize = 1024 * 1024* 100 //100MB
		
)
public class file extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public file() {
        super();
 
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	response.setContentType("text/html;charset=utf-8");
    	//getServletContext().getRealPath() => WEB SERVER 프로젝트 경로를 말합니다.
    	String url = request.getServletContext().getRealPath("/upfile/");
    	//System.out.println(url);
    	
    	//Part: interface로 파일을받아서 처리함
    	Part file1 = request.getPart("imgfile"); //첨부파일은 part로 받는다
    	
    	//System.out.println(file1);
    	//파일명을 출력할때 사용함 
    	String filename = file1.getSubmittedFileName();
    	long Filesize = file1.getSize();
    	String filetype = file1.getContentType();
    	
    	//System.out.println(filename);
    	
    	file1.write(url + filename);
    	PrintWriter pw = response.getWriter();
    	pw.write("<script>alert('정상적으로 파일 업로드 되었습니다.');</script>");
    	pw.close();
    	
    	InputStream is = new FileInputStream(url +filename);
    	System.out.println(is.available());
    	is.close(); //class load한건 닫자
    }

}
