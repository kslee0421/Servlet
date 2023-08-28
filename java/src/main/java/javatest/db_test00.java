package javatest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 Java + Database 응용편1
 게시판 작성하는 프로세서를 제작합니다.
 문의제목, 고객명, 패스워드는 6자리 이상, 문의내용
 단, 패스워드는 암호화하지 않고 제작 합니다. 패스워드 6자리 이하 입력시 DB에 저장 안됩니다 length
  
 */
public class db_test00 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문의 제목을 입력하세요:");
		String subject =sc.nextLine(); 
		System.out.println("고객명을 입력하세요:");
		String name =sc.nextLine(); 
		//재귀함수로 핸들링
		//String result = new db_test00().passwordck();
		//무한loop로 사용법
		for(;;) {
			System.out.println("패스워드를 6자리이상 입력하세요");
			String pass =sc.nextLine().intern();
			if(pass.length()<6) {
				System.out.println("제발 좀 6자리 입력해주세요");
			}
			else {
				break;
			}
		};		
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
			new db_test00().passwordck();  //배열이없으니까 null로 지정
		}
		return pass;
	}
}


