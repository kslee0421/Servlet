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
public class db_test_0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection ct = null;
		try {
			dbconfig2 db =new dbconfig2();
			ct = db.info();
			//System.out.println(ct.toString()); //DB접속 확인
			System.out.println("문의 제목을 입력하세요:");
			String subject =sc.nextLine(); //Scanner에 입력된 값
			System.out.println("고객명을 입력하세요:");
			String name =sc.nextLine(); //Scanner에 입력된 값
			System.out.println("패스워드를 6자리이상 입력하세요");
			String value =null;
			String pass =sc.nextLine().intern();
			if(pass.length()<6) {
				System.out.println("패스워드는 6자리 이상입니다 다시입력해주세요");
				new db_test_0().main(null);  //배열이없으니까 null로 지정
			}
			System.out.println("문의 내용을 입력하세요");
			String text =sc.nextLine(); //Scanner에 입력된 값
			
			//DB문법 
			String insert ="insert into confirm values('0','"+subject+"','"+name+"',password('"+pass+"'),'"+text+"',now())";
			PreparedStatement ps = ct.prepareStatement(insert); //SQL문법을 작업준비 과정 
			/*
			 excute() : select 문법에만 사용
			 executeUpdte() : insert, update, delete, alter, create 문법 
			 */
			int oksign = ps.executeUpdate();  //SQL에 Query에 대한 값은 숫자로 처리
			if(oksign ==1) { //1 정상 저장
				System.out.println("저장이 잘 되었습니다.");
				ps.close();
				ct.close();
				sc.close();
			}
			else { //0 비정상 저장오류 sql문법오류, DB접속오류, 컬럼에 대한 범위오류
				System.out.println("SQL 문법 오류로 인하여 저장 되지 않았습니다.");
			}			
		}
		catch(Exception e) {
			System.out.println("DB 정보가 올바르지 않습니다.");
		}
		

	}

}

class dbconfig2{ //Database 접속 환경 설정 class
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


