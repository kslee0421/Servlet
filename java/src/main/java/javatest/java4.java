package javatest;
//public이 아예없어도됨 
class java5{
	public void java5_1() {
		
	}
}//:실행안됨public은 한번만

public class java4 {  
	int a,b = 0;
	
	public void java1() {
		this.a = 20;
		this.b = 30;
		java2(); //같은 클래스에서 해당 메소드로 실행  
		//java1에 데이터를 받아서 java2로 넘기기
	}
	public void java2() {
		int sum = this.a + this.b;
		System.out.println(sum);
	}
}
