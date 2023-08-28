package javatest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

/*
   응용편 Java + Database
   Library 추가 필요 https://mvnrepository.com/ ->mysql 검색
*/
public class db_test1 {
	public static void main(String[] args) {
		/*
		Date today = new Date();
		SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd");
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat datetime = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		System.out.println(datetime.format(today));
		*/
		/*
		String times = new timezone().now_time(1);
		System.out.println(times);*/
		Scanner sc = new Scanner(System.in);
		Connection ct = null;
		try {
			dbconfig6 db =new dbconfig6();
			ct = db.info();
			//System.out.println(ct.toString()); //DB접속 확인
			System.out.println("제목을 입력하세요:");
			String subject =sc.nextLine(); //Scanner에 입력된 값
			//DB문법 
			String insert ="insert into web values('0','이경선','sun@nate.com','"+subject+"','에이핑크 화이팅!!',now())";
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
class dbconfig6{ //Database 접속 환경 설정 class
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









