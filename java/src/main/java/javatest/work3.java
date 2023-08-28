package javatest;
import java.sql.*;
import java.util.*;

public class work3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection ct = null;
		System.out.println("당신의 성별은?");		
		System.out.println("1. 남성\n2. 여성 ");
		String gender = sc.nextLine().intern();
		if(gender=="1") {
			gender = "남성";
		}else { 
			gender = "여성";
		}
		System.out.print("당신의 연령층은? ");
		System.out.println("\n1.10대\n2.20대\n3.30대\n4.40대\n5.50대 이상");
		String age = sc.nextLine().intern();	
		if(age=="1") {
			age = "10대";
		}else if(age=="2") {
			age = "20대";
		}else if(age=="3") {
			age = "30대";
		}else if(age=="4") {
			age = "40대";
		}else{
			age = "50대 이상";
		}
		System.out.print("현재 기후 단계수준은?");
		System.out.println("\n1. 매우 심각하다\n2. 심각하다\n3. 보통이다\n4. 심각하지 않은 편이다");
		String content = sc.nextLine().intern();
		if(content=="1") {
			content = "매우 심각하다";
		}else if(content=="2") {
			content = "심각하다";
		}else if(content=="3") {
			content = "보통이다";
		}else {
			content = "심각하지 않은 편이다";
		}
		sc.close();
		
		dbconfig11 db = new dbconfig11();
		try {
			ct = db.info();
			String insert = "insert into weather values ('0','"+gender+"','"+age+"','"+content+"',now())";
			PreparedStatement ps = ct.prepareStatement(insert); //PreparedStatement :sql
			
			int oksign = ps.executeUpdate(); 
			
			if(oksign == 1) { 
				System.out.println("저장이 잘 되었습니다.");
				ps.close();
				ct.close();
			}else{
				System.out.println("SQL 문법 오류로 인하여 저장 되지 않았습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


class dbconfig11 {  //Database 접속 환경 설정 class
	//Connection : Interface 사용
	public Connection info() throws Exception {
		String db_drive ="com.mysql.jdbc.Driver";
		String db_url ="jdbc:mysql://localhost:3307/web";
		String db_user ="hong";
		String db_pass ="a123456";
		
		Class.forName(db_drive);
		Connection con = DriverManager.getConnection(db_url,db_user,db_pass);
		
		return con;
	}
}
