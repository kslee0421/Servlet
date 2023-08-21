package example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class file1 {

	public static void main(String[] args) {
		try {
			new box_office1().abc();
		}
		catch(Exception e) {
			System.out.println("파일 로드 오류!!");
		}

	}

}
/*Scanner를 이용하여 다음과 같이 실행 되도록 합니다.
 * 1. 개봉작 리스트 출력 2. 프로그램 종료
 * 
 * 1번 입력 후 엔터 실행시 영화 리스트가 출력되어야 하며,
 * 2번 입력시 프로그램을 강제 종료합니다.
 * 
 * */

class box_office1 {
	Scanner sc = null;  //file에 스캐너를 올려놓고 시작
	FileReader fr = null;
	public void abc() throws Exception{
		this.sc = new Scanner (System.in);
		this.fr = new FileReader("E:\\project\\example\\src\\main\\webapp\\movie_db.txt");

		BufferedReader bf = new BufferedReader(this.fr);
		ArrayList<String> al = new ArrayList<String>();
		String line =""; 
		while ((line = bf.readLine())!=null) {
			al.add(line+"\n");
		}	
		while(true) {
			System.out.println("1. 개봉작 리스트 출력 2. 프로그램 종료");
			String num = this.sc.nextLine().intern(); //quit때문에 sring으로 받음 
			if(num =="2") {
				System.exit(0); //프로그램 강제종료
			}
			else {
				System.out.println(al);
			}
		}
		
	}
}