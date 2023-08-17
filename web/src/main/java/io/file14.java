package io;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//I/O응용편 
/*
 * 응용문제1번
 * 해당 데이터를 파일로 저장 후 출력하는 프로세서를 제작하시오.
 * "hong", "kim", "park", "lee"
 * "25", "30", "44", "26"
 * "홍길동", "김유신", "박찬호", "이순신"
	
	파일의 저장 형태는 다음과 같습니다.
	홍길동: hong(25)
	김유신: kim(30)
	박찬호: park(44)
	이순신: lee(26)
	단, 파일명은 member_list.txt로 저장 되어 있어야 합니다.

 * */
public class file14 {

	public static void main(String[] args) {
		try {
			data15 a =new data15();
			a.abc();
		}
		catch(Exception e) {
			System.out.println("파일오류발생!!");
			System.out.println(e);
		}

	}

}
class data15{
	FileWriter fw = null;
	public void abc() throws Exception{
		Object user[][] = {
				{"hong", "kim", "park", "lee"},
				{"25", "30", "44", "26"},
				{"홍길동", "김유신", "박찬호", "이순신"}				
		};
		/*빈 파일 생성*/
		//Path data5 = Paths.get("E:\\project\\web\\src\\main\\webapp\\member_list.txt");
		//Files.createFile(data5);
		
		//this.fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\member_list.txt",true);		
		//FileWriter true는 : 기존 데이터를 삭제하지 않고 지속적으로 데이터를 추가하는 형태	
		fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\member_list.txt");
		
		ArrayList<Object> al = new ArrayList<Object>();

		for(int i=0;i<user[0].length;i++) {
			al.add(user[2][i]+":"+user[0][i]+"("+user[1][i]+")");
		}
		for(int i=0;i<user.length;i++) {
			fw.write();
		}
		System.out.println(al);
		OutputStream os = new    
		//fw.close(); //파일종료
		//fw.flush();
		
		//FileReader fr = new FileReader("E:\\project\\web\\src\\main\\webapp\\member_list.txt");
		/*try {
			data16 dt = new data16();
			dt.abc();
		}
		catch(Exception e) {
			
		};*/
	}
}
/*
class data16{
	public void abc() throws Exception{
		InputStream is = new FileInputStream("E:\\project\\web\\src\\main\\webapp\\member_list.txt");
		byte temp[] = new byte[is.available()]; //파일 전체를 모두 byte 배열로 적용
		is.read(temp); //파일더블클릭 열기 전체 크기 확인 방식 한번 읽어오기 아스키는 리드라인으로 읽음
		//read()가 필요한 이유는 해당 파일 바이너리 형태로 읽기 때문에 read 메소드로 파일 전체를 읽어 들임
		//System.out.println(ea); 
		
		String data = new String (temp,"UTF-8"); //강제로 언어셋 변경
		System.out.println(data);
		is.close();
		try {
			data9 z =new data9();
			z.zzz();
		}
		catch(Exception e) {
			System.out.println("데이터 쓰기 오류 발생!!");
			
		}
	}
}*/
