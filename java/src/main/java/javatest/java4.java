package javatest;

import java.util.*;

//public이 아예없어도됨
class data1{
	Scanner sc =null;
	static String a1 =null;
	static int b1 =0;
	static String c1 =null;
	public void abc(String a, int b, String c) {
		this.a1 =a;//기억
		this.b1 =b;
		this.c1 =c;
		System.out.println("고객명 및 패스워드 체크!!");
		this.sc = new Scanner(System.in); //사용자가 입력하는 형태
		System.out.print("고객명을 입력하세요!");
		//String usernm =this.sc.next();
		//System.out.println(usernm);
		String usernm =this.sc.nextLine();  //사용자가 입력한 값
		//System.out.println(usernm);
		System.out.println("패스워드를 입력하세요!");
		String userpw = this.sc.nextLine().intern(); //사용자가 입력한 값 intern()을 사용시
		
		if(usernm.equals("홍길동")) {
			if(userpw=="a12345") {
				System.out.println("등록된 사용자입니다");
				this.sc.close();
			}
			else {
				System.out.println("패스워드를 확인하세요");
				abc(this.a1,this.b1,this.c1); //재귀 메소드 (자신의 메소드를 재호출)
				
			}
			
		}
		else {
			System.out.println("해당 고객은 가입되지않았습니다.");
			System.exit(0);
		}
	}
}

public class java4 { //메인 클래스  
	int a,b = 0;
	
	public void java1() {
		this.a = 20;
		this.b = 30;
		java2(); //같은 클래스에서 해당 메소드로 실행  
		//java1에 데이터를 받아서 java2로 넘기기
	}
	public void java2() {
		int sum = this.a + this.b;
		//System.out.println(sum);
	}
}
