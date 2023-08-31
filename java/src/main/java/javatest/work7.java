package javatest;
/*[숙제]
구구단 7단 중 해당 결과값을 Thread를 이용하여 출력 되도록 합니다.
*/

public class work7 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int ea = a.length; //갯수
		int ww = 0;
		Multy ps = null;
		while(ww < ea) {
			ps = new Multy(a[ww]);
			ps.start(); //Thread run 메소드를 실행
			ww++;
		}
	}
}
class Multy extends Thread {
	private int w =1; //값이 num이 바뀌더라도 바뀌지 않는다 :해당 메소드를 
	private int total =0; //모두 합한값
	public int num = 0;
	private int i =1;
	//int num은 배열에 각각의 값을 해당 메소드가 전달을 받음
	public Multy(int num) { // 해당값에 맞춰서 모두 더하는 값 형태로 
		this.num = num; //인자값을 다른 메소드에서 사용하기 위함 (setter)
		this.total=7*num;

//		while(this.w <= num) {
//			this.total += this.w;
//			//System.out.println(this.w);
//			this.w++;
//		}
	}//즉시실행 메소드가있어야 값을 받음
	@Override
	public void run() { //결과만 출력
		System.out.println("7"+ " * " +this.num +" = " + this.total);

	}
}