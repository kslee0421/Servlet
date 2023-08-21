package example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class file2 {
	/*
	 * 응용문제2.
	 * 해당 buffer.txt의 파일을 읽어 들인 후 배열로 내용을 저장 후 
	 * 짝수 배열값만 출력시키는 프로세서를 제작하시오.
	 * 
	 * 결과값 : 출력확인 하는 중입니다...
	 * 	      JAVA BufferReader 힘듬..
	 * */
	public static void main(String[] args) {
		try {
			new notice().abc();
		}
		catch(Exception e) {
			System.out.println("파일 오류 발생!!");
		}
	}
}
class notice {
	//Reader -> Buffered -> ArrayList  ::byte(아스키 형태이므로 필요없음)
	//Stream -> BufferedStream -> ArrayList  ::byte필요
	//Stream -> BufferedStramReader -> Reader -> ArrayList ::byte필요
	FileReader fr = null;
	BufferedReader br =null;
	ArrayList<String> ar = null;
	
	public void abc() throws Exception{
		String url ="E:\\project\\example\\src\\main\\webapp\\buffer.txt";
		this.fr = new FileReader(url);
		this.br =new BufferedReader(this.fr);
		this.ar =new ArrayList<String>();
		//System.out.println(this.br.readLine());
		//System.out.println(this.fr.read());
		String data =null;
		int count = 1;
		while ((data = br.readLine())!=null) {
			if(count%2==0) {
				this.ar.add(data);
			}
			count++;
		}	//일단 넣고 봐야함 안그러면 첫번째 데이터가 소실됨 
		System.out.println(this.ar);
		this.br.close();
		this.fr.close();
	}
}


