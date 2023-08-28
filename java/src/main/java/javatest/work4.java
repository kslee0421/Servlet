package javatest;
import java.sql.*;
import java.util.*;

public class work4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = null;
		String pw = null;
		String name = null;
		String tel = null;
		String email = null;
		String number = null;
		Connection ct = null;
		System.out.println("회원가입의 형태를 적어주세요");		
		System.out.println("1. 일반고객\n2. 사업자 고객 ");
		String type = sc.nextLine().intern();
		if(type=="1") {
			System.out.println(type);
			type = "일반고객";
			System.out.println("아이디를 입력하세요");
			id = sc.nextLine();	
			System.out.println("패스워드를 입력하세요");
			pw = sc.nextLine();
			System.out.println("이름을 입력하세요");
			name = sc.nextLine();
			System.out.println("전화번호 혹은 휴대폰 번호를 입력하세요");
			tel = sc.nextLine();
			System.out.println("이메일 주소를 입력하세요");
			email = sc.nextLine();
			number = null;
		}else {
			type = "사업자고객";
			System.out.println("아이디를 입력하세요");
			id = sc.nextLine();	
			System.out.println("패스워드를 입력하세요");
			pw = sc.nextLine();
			System.out.println("이름을 입력하세요");
			name = sc.nextLine();
			System.out.println("전화번호 혹은 휴대폰 번호를 입력하세요");
			tel = sc.nextLine();
			System.out.println("이메일 주소를 입력하세요");
			email = sc.nextLine();
			System.out.println("사업자번호를 입력하세요 (11자리)");
			number = sc.nextLine();

		}

		dbconfig22 db = new dbconfig22();
		try {
			ct = db.info();
			String insert = "insert into membership values ('0','"+type+"','"+id+"',password('"+pw+"'),'"+name+"','"+tel+"','"+email+"','"+number+"',now())";
			PreparedStatement ps = ct.prepareStatement(insert); 
			
			int oksign = ps.executeUpdate(); 
			
			if(oksign == 1) { 
				System.out.println("저장이 잘 되었습니다.");
				sc.close();
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


class dbconfig22 {  
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
