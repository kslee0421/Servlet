package javatest;

import java.util.Scanner;

//Thread를 이용하여 결과값을 돌출하는 프로세서를 작성하시오
/*
 응용문제1 
 데이터가 다음과 같이 있습니다.
 {10 5 19 22 13 6 4} 
 해당 Thread에 데이터를 하나씩 대입합니다.
 단, 결과 값 형태는 다음과 같습니다.
 
 10 데이터 입력되면 1~10 모두 더한 결과값 출력
 5 데이터 입력되면 1~5 모두 더한 결과값 출력
 19 데이터 입력되면 1~19 모두 더한 결과값 출력 형태로 
 각각의 배열 데이터 값 범위만큼 더하여 결과값을 출력합니다.
 */
public class java19 {

	public static void main(String[] args) {
		int w = 0;
		int a = 0;
		thd1 t =new thd1();	
		thd2 t2 =null;
		while(w <=a) {
			t2 =new thd2(w); //새로운 10개의 작업을 실행 
			t2.start(); //start는 Thread중에서 run 메소드를 실행시킴
			w++;
		}
		
	}

}

class thd1 { //일반 class
	int start(int a) { //return 메소드
		return a;
	}
}
class thd2 extends Thread{ //Thread class 상속
	int b = 0;
	int sum =0;
	public thd2(int a) { //class 호출시 작동하는 메소드
		this.b =a;
			sum+=a;
		//System.out.println(this.b);
		//System.out.println(a);
		
		//System.out.println(sum);
	}
	@Override
	public void run() {//Thread에서 제공되는 메소드 (실행메소드)
		//System.out.println(sum);
	}
}  







