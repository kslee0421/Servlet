package javatest;
//Thread란 ? cpu가 일할 수 있는 공간 (메인 class는 안함 )
/*
 * extends => 상속 (Thread)  
 * interfase => Runnable 
 * */
//Thread란 1개의 cpu 공간
//MultiThread : 개발자가 1개 이상의 cpu공간을 활용하는 사항
public class java18 {

	public static void main(String[] args) {
		int a[]= {10,5,19,22,13,6,4};
		int ea = a.length; //갯수
		int ww = 0;
		pluse ps = null;
		while(ww < ea) {
			ps = new pluse(a[ww]);
			ps.start(); //Thread run 메소드를 실행
			ww++;
		}
	}
}
class pluse extends Thread {
	private int w =1; //값이 num이 바뀌더라도 바뀌지 않는다 :해당 메소드를 
	private int total =0; //모두 합한값
	public int num = 0;
	//int num은 배열애 각각의 값을 해당 메소드가 전달을 받음
	public pluse(int num) { // 해당갑에 맞춰서 모두 더하는 값 형태로 
		this.num = num; //인자값을 다른 메소드에서 사용하기 위함 (setter)
		while(this.w <= num) {
			this.total += this.w;
			//System.out.println(this.w);
			this.w++;
		}
	}//즉시실행 메소드가있어야 값을 받음
	@Override
	public void run() { //결과만 출력
		System.out.println(" 1부터~"+this.num+"까지의 합 = "+this.total);
	}
}