package javatest;
/*초급 class _ method 활용 (java2)*/
public class java1 {

	public static void main(String[] args) {
		abc a = new abc(); //인스턴스에 객체 올리자 마자 실행 : 즉시실행,객체 + 인스턴스
		/*해당 클래스에서 필드에 있는 변수에 값을 이관함*/
		//new abc();
		a.aa = 10;
		a.bb = 20;
		a.cc = 30;
		a.data(); //일반 메소드 작동
		abc.data2(); //메모리 메소드를 로드
		//System.out.println(a.number); //외부 클래스에 있는 필드 변수값을 가져옴
		String result = a.data3(100,200); 
		//System.out.println(result);
		
		int call = a.data4("500","500"); //return 숫자형
		System.out.println(call);
	}

}
