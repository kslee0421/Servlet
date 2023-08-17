package io;

import java.io.*;

//파일 쓰기 (writer)
public class file4 {

	public static void main(String[] args) {
		try {
			new data3().abc();
		}
		catch(Exception e) {
			System.out.println("파일오류발생!!");
		}

	}

}
class data3{
	//Filerwirwr : 문자ㅣ 데이터ㅡㄹㄹ 파일에 쓰는 클레스
	FileWriter fw = null;
	public void abc() throws Exception{
		String user[] = { "홍길동","유관순","이순신","강감찬","안중근"};
		//this.fw = new Filewriter("E:\\project\\web\\src\\main\\webapp\\data.txt");
		this.fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\data.txt",true);		
		//FileWriter true는 : 기존 데이터를 삭제하지 않고 지속적으로 데이터를 추가하는 형태			
		for(String name : user) {
			this.fw.write(name);// writer 메소드는 헤당 파일에 데이터를쓰기 ㅛㅇㅇ도
		}
		this.fw.close(); //파일종료
	}
}