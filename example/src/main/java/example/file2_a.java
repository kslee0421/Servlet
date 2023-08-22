package example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class file2_a {
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
			new cccc().abc();
		}
		catch(Exception e) {
			System.out.println("파일 로드 오류!!");
		}
	}
}
class cccc {
	Scanner sc = null;  //file에 스캐너를 올려놓고 시작
	FileReader fr = null;
	public void abc() throws Exception{
		this.sc = new Scanner (System.in);
		this.fr = new FileReader("E:\\project\\example\\src\\main\\webapp\\buffer.txt");

		BufferedReader bf = new BufferedReader(this.fr);
		ArrayList<String> al = new ArrayList<String>();
		String line =""; 
		while ((line = bf.readLine())!=null) {
			al.add(line);
		}	
		System.out.println(al);
		for (int i =0; i< al.size(); i++) {
			if(i%2!=0) {
				String data =al.get(i);
				System.out.println(data);
				}
		}	
		bf.close();
		fr.close();
		sc.close();
	}
}


