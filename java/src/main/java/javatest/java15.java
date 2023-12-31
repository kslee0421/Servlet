package javatest;

//class 안에 class
/*
  응용문제 중첩 클래스를 이용하여 자식 클래스에 결과값을 출력하는 프로세서를 제작하시오.
  부모클래스명은 : mother
  자식 클래스명은 : child
  메인 클래스에서 mother 클래스로 값을 전달 합니다.
  전달 값은 2개 이며, 부모 클래스에서 받은 값을 child 클래스에서 곱한 값을 출력하도록 합니다.
  
  부모클래스 (30,50);
  자식클래스 결과값 :1500
 */
public class java15 {

	public static void main(String[] args) {
		mother mt = new mother();
		mt.m_mother(30, 50); //부모 클래스 메소드에 30,50 숫자를 대입 
		mother.child ch = mt.new child(); //부모 객체를 이용하여 새로운 인스턴스를 생성
		ch.c_child(); //해당 메소드를 호출하영 실행함
	}

}
class mother{
	int aa, bb;
	//public static int aa, bb;
	public void m_mother(int a ,int b) {
		this.aa = a;
		this.bb = b;
		child ch = new child();
		ch.c_child();
		System.out.println(this.aa + " " + this.bb);
	}
	class child{
		int aa = mother.this.aa; //부모클래스에 있는 필드변수를 this를 이용하여 적용함
		int bb = mother.this.bb;
		public void c_child() {
			int cc = this.aa * this.bb;
			System.out.println(cc);
		}
	}
	
}


