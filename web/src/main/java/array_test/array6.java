package array_test;
//2차 배열
//
public class array6 {

	public static void main(String[] args) {
		new array6().test();

	}
	public void test() {
		//int a[] = new int[2];
		//a[0] =1;  //정적배열		
		//int b[] = {1,2,3,4,5};  //동적배열
		
		String member[][] = {
				{"박초롬","윤보미","정은지","김남주","오하영"},
				{"31","29","33","31","32"}
		};
		int ea = member.length;
		//System.out.println(ea);
		int data_ea = member[0].length;
		//System.out.println(data_ea);
		/*응용문제 7
		박초롬
		31
		윤보미
		29
		정은지
		33
		김남주
		31
		오하영
		32
		 */
		int f,ff=0; 
		for(f=0;f<ea;f++) { 
			for(ff=0;ff<data_ea;ff++) {				
				//System.out.println(member[f][ff]);	
			}
		}
		for(ff=0;ff<data_ea;ff++) { //5바퀴
			for(f=0;f<ea;f++) {			//2바퀴	
				//System.out.println(member[ff][f]);	
			}
		}
		/*
		 * 응용문제8 해당 데이터 배열에 있는 모든 값 중 짝수 값만 모두 더하여 결과값을 출력하는 코드를 작성하시오
		 */
		/*
		 * 1번 {11,42,22,16} 2번 {7,33,10,29} 결과값은 90
		 */
		int number[][] = {
				{11,42,22,16},
				{7,33,10,29}
		};
		int total =0; //합산 결과 변수값
		for(int a[] : number) { //2차배열을 1차 배열로 따로따로 구성
			//System.out.println(Arrays.toString(a));
			for(int b : a) { //위에서 구성된 1차배열에 있는 데이터를 분리
				if(b %2 ==0) {//짝수 조건일 경우
					//System.out.println(b);
					total +=b;
				}
			}
		}
		System.out.println(total);
	
	/*
	 숙제 : 
	 해당 두개의 배열 데이터가 있습니다.
	 각 배열별로 인덱스가 같은 번호를 더하여 짝수, 홀수 인지 배열 결과 데이터로 재설정하여 출력하시오/
	Adata = 5 17 19 22 23
	Bdata = 1 2   3  4   5
	결과출력예시
     ["짝수","홀수","짝수",짝수","짝수"] 	 
	 */
		
	}
}
