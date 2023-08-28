package javatest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 Java + Database 응용편1
 게시판 작성하는 프로세서를 제작합니다.
 문의제목, 고객명, 패스워드는 6자리 이상, 문의내용
 단, 패스워드는 암호화하지 않고 제작 합니다. 패스워드 6자리 이하 입력시 DB에 저장 안됩니다 lentgh
  
 */
public class db_test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문의 제목을 입력하세요:");
		String subject =sc.nextLine(); 
		System.out.println("고객명을 입력하세요:");
		String name =sc.nextLine(); 
		//재귀함수로 핸들링
		String result = new db_test2().passwordck();
		
		
		
		System.out.println(result);
		System.out.println("문의 내용을 입력하세요");
		String text =sc.nextLine();
		sc.close();
		Connection ct = null;
		
	}
	public String passwordck() {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("패스워드를 6자리이상 입력하세요");
		String pass =sc2.nextLine().intern();
		if(pass.length()<6) {
			System.out.println("제발 좀 6자리 입력해주세요");
			new db_test2().passwordck();  //배열이없으니까 null로 지정
		}
		return pass;
	}
}

class dbconfig4{ //Database 접속 환경 설정 class
	//Connction : Interfase 사용
	public static Connection info() throws Exception{
		String db_drive ="com.mysql.jdbc.Driver";
		String db_url ="jdbc:mysql://localhost:3307/web";
		String db_user ="hong";
		String db_pass ="a123456";
		
		Class.forName(db_drive);
		Connection con =DriverManager.getConnection(db_url,db_user,db_pass);
		return con;
	}
}


