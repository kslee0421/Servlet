package javatest;
import org.apache.catalina.tribes.util.Arrays;

import app.app1; // 외부 패키지 가지고 오기 //패키지.public class명
//import : 가져오는 기능, export : 내보내는 기능 

//public(다른 패키지에도 사용가능 공개),private(같은 class에서만 씀), protected(패키지가 같을 경우 ) : 접근제한

/*
 1. 패키지가 다를 경우 public class 핸들링
 */
//package app(app1.java) 연계 프로세서
public class java9 {
	public static void main(String[] args) {
		app1 ap = new app1();
		ap.main(args);		
//		new abox().dataload();
//		new bbox().dataload();
//		new cbox().dataload();
		ddd[] d = {new abox(), new bbox(), new cbox()}; //추상클래스를 상속 받아서 처리하는 class를 배열화 하여 순차적으로 작동시키는 형태
		
//		for(ddd z : d) {
//			z.dataload();
//		}
		/* 반복문으로 순차적이 배열애 았는 class를 순차적으로 실행 시키는 상황 */
		int w = 0;
		while(w < d.length) {
			if(w!=1) { //해장 class 외에 다른 class만 실행 
				d[w].dataload();
			}
			w++;
		}
	}
}
//abstract : 추상 클래스 + 추상 메소드(프레임 워크에 활용)
/*
 public class가 없을 경우 abstract에서도 public으로 핸들링 할 수 있으며,
 단. public class가 있을 경우 default로 abstract를 이용합니다.
 */
abstract class ddd{
	public String userid = null; //공용으로 사용하는 변수 (this 모두 활용가능 )
	public String useremail = null;
	public int userpoint = 0;
	public abstract void dataload();
	
}
class abox extends ddd{
	@Override
	public void dataload() {
		abox ab = new abox();
		System.out.println(this.userpoint);
		System.out.println("abox 클래스");
	}
}
class bbox extends ddd{
	@Override
	public void dataload() {
		this.userpoint=2500;
		System.out.println("bbox 클래스");
	}
}
class cbox extends ddd{
	@Override
	public void dataload() {
		System.out.println("cbox 클래스");
	}
}




