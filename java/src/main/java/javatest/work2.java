package javatest;
import java.util.*;

public class work2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단 7단~9단 까지 숫자를 하나 입력하세요 :");
		String input = sc.nextLine().intern();
		
		try {
			data12 d = new data12();
			d.aaa(input);			
		}
		catch(Exception e) {
			System.out.println("입력 오류");
		}

	}

}

class data12{
	public void aaa(String a) {		
		int aa = Integer.parseInt(a);
		do {
			int i = 1;
			while(i<=5){
				System.out.println(aa + "*" + i + " = " + (i*aa));
				i++;
			};
			break;
		}
		while(aa >= 7 && aa <= 9);		
	}
}