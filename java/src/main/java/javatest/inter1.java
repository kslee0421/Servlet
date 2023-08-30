package javatest;

import java.util.Scanner;

public interface inter1 { //처음부터 객체와 인스턴스를 활용하여 클래스 api class를 생성시팀
	String name ="홍길동"; //필드에 적용된 전역변수
	String userid="hong";
	//처음부너 객체와 인스턴스를 활용하여 api class를 생성시킴
	Scanner  sc =null;
	// 변수는 안 먹음 default String useremail = "hong@nate.com"; 
	public void a1(); //일반메소드
	default void aa1() { //override를 필수로 하지 않고 필요할때만 로드하여 사용랄때 로드하여 사용 
		System.out.println(this.userid);
	}
	class zzz{ //interfac;
		public void zzjj() {// 자시 클래스 메소드
			System.out.println("interface안에 외부 클래스 활용!!");
		}
	}
}
