package array_test;

//원시배열 + 조건문 + 반복문
public class array2 {
	public static void main(String[] args) {
		array2 ar =new array2();
		ar.test();
		new array2().test();
	}
	public void test() {
		String id[] = {"hong", "kim","park","lee","jang","so"};
		//힌트 
		int word = id[0].length();
		//System.out.println(word);
	/* 
		 * 응용문제1 해당 사용자 아이디 배열값 중 아이디가 3자리 이하의 사용자만 출력하시오
		 */

		
		int w =0;
		int ea = id.length;
		do {
			//System.out.println(id[w]);
			if(id[w].length() <=3) {
				//System.out.println(id[w]);	
			}
			w++;
		}while(w < ea);
		/*
		 응용문제2
		 데이터는 다음과 같습니다. 15 60 11 14 27 의 총 5개의 숫자가 있으며
		 해당 데이터의 합을 구합시오
		 */
		int data[] = {15,60,11,14,27};
		int ww =0;
		int total =0;
		while(ww < data.length) {
			//System.out.println(data[ww]);
			//total =total + data[ww];
			total += data[ww];
			ww++;
		}
		//System.out.println(total);
		
		/*
		 응용문제3
		 다음 숫자 데이터 리스트 중 짝수의 값만 모두 더한 최종 결과값을 출력하시오.
		 5 10 15 20 25 30 25
		 
		 int num =45;
		 if(num % 2==0){
		 	System.out.println("짝수");
		 }else{
		 System.out.println("홀수");
		 }
		 */
		int data2[] = {5,10,15,20,25,30,35};
		int ww2 =0;
		int total2 =0;
		
		for(ww2=0; ww2<data2.length;ww2++) {
			//System.out.println(data2[ww2]);
			 if(data2[ww2] % 2==0){
				 //System.out.println(data2[ww2]);
				 	total2 += data2[ww2];
				 }		
			
		}
		System.out.println(total2);
		/*
		 * while(ww2 < data2.length) { if(data2[ww2] % 2==0){ total2 += data2[ww2]; }
		 * //total =total + data[ww]; ww2++; } System.out.println(total2);
		 */
		
	}
}
