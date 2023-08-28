package javatest;
/*
 * 반복문 for, while, do~while
 * */
public class java6 {

	public static void main(String[] args) {
		new data3().abc();
	}

}
/*1~5까지 출력물 */
class data3{
	public void abc() {
		/*int f;
		for(f=1; f<5;f++) {
			//System.out.println(f);
		}
		System.out.println(f);
		*/
		
		/*int w = 1;
		while (w <=5) {
			System.out.println(w);
			w++;
		}*/
		
		/*
		int w = 1;
		do {
			System.out.println(w);
			w++;
		}
		while(w <= 5);
		*/
		/*
		 응용문제2. 해당숫자를 역순으로 출력합니다.
		 10 ~ 1 까지 (while)
		 * */
		int w = 10;
		while (w > 0) {
			//System.out.println(w);
			w--;
		}
		/*
		 응용문제3. 구구단 9단 9*1부터 9*9까지 
		 결과값출력 단, do~while
		 */
		
		int i = 1;
		do {
			int value = 9 * i;
			//System.out.println("9 * "+i+" = "+value);
			i++;
		}
		while(i <= 9);
		
		/*
		 응용문제 4번
		 100에서 150까지 모든 수를 합한 결과값 출력 while 값 :6375
		 */
		int j = 100;
		int sum = 0;
		while (j <=150) {
			sum += j;
			//System.out.print(j+"+");
			j++;
		}
		//System.out.println("="+sum);
		/*
		 응용문제 5번
		 100에서 150까지 모든 수를 곱 결과값 출력 for
		 */
		double total = 1;
		for(int k=100; k<=150; k++ ) {
			total *=k;	
			//System.out.println(k);
		}
		System.out.println(total);
		byte b = -128; //byte : -128~127
		byte c = 127;
		System.out.println(b);
	}
}
