package array_test;

import java.util.*;

public class arraytest {

	public static void main(String[] args) {
	new arraytest().test();
	}
	public void test() {
//		int number[][]= {
//				{5, 17, 19, 22, 23},
//				{1, 2, 3, 4, 5}
//		};
//		int array =0;
//		int i = 0;
//		int total = 0;
//		int number2[] =new int[number[0].length];
//		String number3[] =new String[number[0].length];
//		for(i=0; i< number[0].length; i++) {
//			total += number[array][i];
//			array++;
//			total += number[array][i];
//			number2[i]= sum;
//			if(number2[i]%2==0) {
//				number3[i] ="짝수";
//			}else {
//				number3[i] ="홀수";
//			}
//			array--;
//			total=0;
//		};
		//System.out.println(Arrays.toString(number2));		
//		System.out.println(Arrays.toString(number3));
		
		int n[][]= {
				{5, 17, 19, 22, 23},
				{1, 2, 3, 4, 5}
		};
		int ea1 = n[0].length;
		int w =0;
		int sum; //int sum =0 ;  이렇게 쓰는경우:: sum +=변수 or sum =sum+변수 
		String newdata[] = new String[ea1];
		String msg;
		while(w <ea1) {
			sum = n[0][w] + n[1][w];
			if(sum %2==0) {//짝수
				msg="짝수";
			}else {//홀수
				msg ="홀수";
			}
			newdata[w] =msg; 
			w++;
		}
		System.out.println(Arrays.toString(newdata));
	};

}
