package javatest;

import java.util.Scanner;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

/*
 double loop 응용편 (do~while +for)
다음결과값 처럼 출력되도록 하시오.
9*1 =9
9*2 =18
9*3=27
8*1=8
8*2=16
8*3=24
7*1 =7
7*2 =14
7*3 =21
 
 */
//System.out.println("단어를 입력하세요");
//Scanner sc = new Scanner(System.in);
//String word = sc.nextLine();
//int ea = word.length();
//System.out.println(ea);
public class java8 {
	static String a =null;
	public static void main(String[] args) {
		Scanner sc =null;
		//new data5().abc();
		sc = new Scanner(System.in); //사용자가 입력하는 형태
		System.out.println("구구단 2단~9단 까지 숫자 하나를 입력하세요");
		String value = sc.nextLine().intern();
		data5 d = new data5();
		d.abc(value);
		try {
			/*
			 응용문제5 Scanner를 이용하여 다음과 같이 결과값이 나오도록 합니다/
			 "구구단 2단 ~ 9단까지 숫자를 하나 입력하세요:"
			 사용자가 5를 입력시
			 5*1 ~5*9=45
			 단, 메인 메소드에서 입력받은 후 외부클래스 메소드로 전송하여 출력
			 */
		}
		catch (NumberFormatException e) {			
			System.out.println("숫자만 입력하세요");	
		}
		catch(Exception e) {	
			System.out.println("입력오류");	
		}

	}

}

class data5{
	public void abc(String a) {
		int aa = Integer.parseInt(a);
		//int aa = Integer.valueOf(a);
		int j = 1;
		int total = 1;
		System.out.println();
		for(j=1; j<=9; j++) {
				total = j*aa;
				System.out.println(aa +"*"+ j+"="+ total);				
		}

	}
	
}

/*
class data6{
	public void abc() {
		int i = 9;
		int j = 1;
		int total = 1;
		do {
			for(j=1; j<=3; j++) {
				total = i*j;
				//System.out.println(i +"*"+ j+"="+ total);				
			}
			i--;
			
		}
		while(i>=7);
	}
	
}*/