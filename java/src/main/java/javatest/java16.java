package javatest;

import java.util.Scanner;

//Interface 활용 
//Intetface 일반 메소드를 활용할 수 있음
public class java16 {

	public static void main(String[] args) {
		new box6().aa1();
		new box6().a1();
		new box6().b1();
	}

}
//extends =>  abstract , 외부클래스를 로드할 때
//interface => implements => 무조건 Override를 활용해야함
class box6 implements inter1,inter2{
	
	@Override
	public void aa1() {
		inter1.super.aa1();
		//interface안에 외부클래스를 객체 및 인스턴스 생성 후 해당 메소드 호출
		inter1.zzz h =new inter1.zzz();
		h.zzjj();
	}
	@Override
	public void a1() {
		String text = this.sc.nextLine(); //인스턴스에서 만들어서 가져왔기 떄문에 import안해도됨
		System.out.println(this.level);
		System.out.println(this.name); //inter1.java에 있는 전역변수의 값을 호출
	}
	@Override
	public void b1() {
		System.out.println(this.name); //inter1.java에 있는 전역변수의 값을 호출
	}
	@Override
	public String b2() {
		return null;
	}
}