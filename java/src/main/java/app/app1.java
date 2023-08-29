package app;
//java test package java9와 연계

//외부 패키지에서 외부 클래스 까지 적용하려면 상속 public class에서 상속 받은 후 
//해당 public class를 호줄하면 외부 클래스 까지 로드 하여 실행 시킬 수 있음
public class app1 extends app1_box {
	@Override
	public void abc() {
		super.abc();
	}
	public static void main(String[] args) {
		//다른 패키지에 있는 public class만 호출하여 가져올 수 있음
		app1 ap = new app1();
		ap.abc();
		System.out.println("외부 패키지 class 입니다.");
	}
}
class app1_box{ // 패키지가 다른 외부 class는 직접적으로 호출하여 사용하지 못함
	public void abc() {
		System.out.println("외부 class중 abc 메소드");
	}
}

