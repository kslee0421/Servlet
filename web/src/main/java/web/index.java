package web;
//Module 파트 Class로 만듬
public class index {
	//this 뭐뭐 써봤닝
	int sum = 0; // 필드에 선언하면 아해 this를 쓸 수 있다.
	public String test(String a, String b) {
		/*
		 * Integer.valueOf :  문자를 숫자로 변환시 값이 숫자인지 문자인지 검토 후 int로 변환을 설정 속도가 더 느리다
		 * Integer.parseInt : 문자를 (int 형으로 변환)
		 * */
		this.sum = Integer.valueOf(a) + Integer.parseInt(b);
		
		//return 메소드 자료형이 문자형 이므로 결과값을 리턴시킬경우 숫자를 문자화 하여 반환함
		//System.out.println(this.sum);
		//return Integer.toString(this.sum);
		return String.valueOf(this.sum);
	}
	public String test2(int a , int b) {
		this.sum = a + b;
		double d = 21.5;
		//형변환 (casting) 변환
		int dd = (int)d;
		
		return String.valueOf(this.sum);
	}

}
