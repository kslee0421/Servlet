package javatest;
//static, if + Scanner 
public class java3 {  //메인 클래스

	public static void main(String[] args) { //실행메소드
		java3_data jd = new java3_data(); //인스턴스 생성
		jd.abc();
		jd.abc();
		//java3_data jd2 = new java3_data(); //인스턴스 생성
		//jd2.abc();
		data1 d = new data1(); //java4에 있는 외부클래스
		d.abc("홍길동", 25, "a12345"); //해당 메소드를 로드 및 인자값 보냄 외따움표 안됨 받는쪽을 세팅하면 해당 자료형을 바로 알 수있다
	}

}
//static와 일반 변수 선언에 따른 결과차이
class java3_data{
	int a = 10;
	static int b = 10; 
	public void abc() {
		/*
		System.out.println("a값 : " + this.a);
		System.out.println("b값 : " + this.b);
		this.a =this.a + this.a;
		this.b =this.b + this.b;
		System.out.println("a값 : " + this.a);
		System.out.println("b값 : " + this.b);
		*/
	}
}


