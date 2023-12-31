package javatest;

import java.util.*;

/*
 숙제.
 추상클래스 + 중첩 클래스를 이용하여  프로세서를 제작합니다.
 추상클래스에서는 father라는 가지고 있으며,
 메소드는 f_method라는 이름을 가집니다.
 
 또한 변수도 u_name이라는 문자형 변수를 생성합니다.
 
 f_method에 문자형으로 인자값을 하나 받는 형태로 제작합니다.
  메인에서 Scanner를 이용하여 사용자 이름을 입력하는 프로세서를 구성 합니다.
 구성 후 외부 클래스로 f_method로 값을 전달합니다. 
 
  전달된 값을 자식 클래스에 전달 하며, 해당 메소드에 다음과 같이 처리 합니다.
  홍길동 ,이순신, 유관순 또는 유관순은 일반회원 입니다. 라고 출력을 하며
  강감찬은 장보고는 실버회원 입니다. 라고 출력을 합니다.
  그 외에 사용자 이름을 입력시 "해당 사용자는 비회원입니다." 라고 출력되도록 하시오.
  
 public class{
   메인에서 scanner입력된 내용 던지기
 }
 abstract class father{
 	f_method();
 }
 class box extends father{
 override
 	class box2{
 		method();  //메소드 생성 및 결과값 출력
 	}
 }
  
  
 */
public class work6 {
	public static void main(String[] args) {
		Scanner sc = null;
		sc = new Scanner(System.in);
		System.out.println("회원명를 입력해 주세요");
		String u_name = sc.nextLine().intern();
		son s = new son();
		s.f_method(u_name);
	}

}

abstract class father{
	public abstract void f_method(String u_name);
	String user[][]=null;
}

class son extends father{
	

	@Override
	public void f_method(String u_name) {
		this.user = new String[][] {
			{"홍길동","이순신","유관순","강감찬","장보고"},
			{"일반회원","일반회원","일반회원","실버회원","실버회원"}
		};
		int i = 0;
		int count =0;
		for(i=0; i<user[0].length; i++){
			if(u_name==user[0][i]) {
				count++;
				System.out.println(user[0][i] + "은(는)" + user[1][i] + "입니다." );
				break;
			}
		}
		if(count!=1) {
			System.out.println("해당 사용자는 비회원입니다.");
		}
	}
}








