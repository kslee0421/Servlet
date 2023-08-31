package javatest;
/*[숙제2]
상품금액 :2000 3000 1500 2300 3200 1100 3300 4200 6100 4300 
상품 수량 : 2 1 1 2 3 2 1 1 2 3 
상품금액과 상품수량을 곱하여 각 상품별 최종금액을 출력하시고
해당 사용형태는 Thread를 이용*/
public class work8 {

	public static void main(String[] args) {
		int a[][]= {
				{2000, 3000, 1500, 2300, 3200, 1100, 3300, 4200, 6100, 4300},
				{2, 1, 1, 2, 3, 2, 1, 1, 2, 3}
		};
		int ea = a.length;
		int ea2 = a[0].length;//갯수
		int ww = 0;
		product ps = null;
		while(ww < ea2) {
			ps = new product(a[0][ww], a[1][ww], ww);
			ps.start(); //Thread run 메소드를 실행
			ww++;
		}
	}
}
class product extends Thread {
	private int w =1; //값이 num이 바뀌더라도 바뀌지 않는다 :해당 메소드를 
	private int total =0; //모두 합한값
	public int num1 = 0;
	public int num2 = 0;
	public int ww = 0;
	private int i =1;
	//int num은 배열애 각각의 값을 해당 메소드가 전달을 받음
	public product(int num1 ,int num2, int ww) { // 해당값에 맞춰서 모두 더하는 값 형태로 
		this.num1 = num1;
		this.num2 = num2;//인자값을 다른 메소드에서 사용하기 위함 (setter)
		this.total = num1 * num2;
		this.ww = ww +1;
//		while(this.w <= num) {
//			this.total += this.w;
//			//System.out.println(this.w);
//			this.w++;
//		}
	}//즉시실행 메소드가있어야 값을 받음
	@Override
	public void run() { //결과만 출력
		System.out.println(ww+"번 고객의 " +"상품가격: "+ num1 +", 상품수량: " + num2+ "개, 총합: "+ +this.total+"원");

	}
}
