package javatest;

import java.util.Scanner;

/*
 * 응용문제1.
 * 외부클래스 명 data2를 활용하여 조건문을 완성하는 코드를 작성하시오.
 * "첫번째 숫자를 입력합니다"
 * "두번째 숫자를 입력합니다"
 * 어느값이 큰값인 콘솔로 출력하시오 .
 * 단, 첫번째 , 두번째 숫자 중 하나라도  미 입력시 재호출 되도록 합니다.
 * */
public class java5 {

	public static void main(String[] args) {
		new data2().abc();
	}
}

class data2{
	//intern : 문자형에 쓰임 
	Scanner sc =null;
	static int a1 =0;
	static int b1 =0;
	public void abc() {
		this.sc = new Scanner(System.in); //사용자가 입력하는 형태
		System.out.println("첫번째 숫자를 입력하세요");
		String a = this.sc.nextLine().intern();
		System.out.println("두번째 숫자를 입력하세요");
		String b = this.sc.nextLine().intern();
		
		if(a == null || a =="" || b==null || b=="" ) {// || (모든 조건중 하나라도 맞을 경우), && 모든 조건이 맞을 경우			
			System.out.println("미입력");
			abc(); //재호출
		}
		else{
			int aa = Integer.parseInt(a);
			//int aa = Integer.valueOf(a);
			int bb = Integer.parseInt(b);
			if(aa>bb) {
				System.out.println("첫번째 값"+a+"이(가) 큽니다");
			}
			else if(aa<bb) {
				System.out.println("두번째 값"+b+"이(가) 큽니다");
			}
			else {
				System.out.println("두값 "+a+"와"+b+"이(가) 같습니다.");
			}
		}
	}
}
