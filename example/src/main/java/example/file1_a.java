package example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class file1_a {

	public static void main(String[] args) {
		try {
			new box_office().abc();
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

class box_office {
	Scanner sc = null;  //file에 스캐너를 올려놓고 시작
	public void abc() throws Exception{
		String url ="E:\\project\\example\\src\\main\\webapp\\movie_db.txt";
		InputStream is = new FileInputStream(url);
		this.sc =new Scanner(System.in);
		System.out.println("1. 개봉작 리스트 출력 || 2. 프로그램 종료 ?");
		int no = sc.nextInt();
		//String no = sc.next().intern(); //스트링일때
		if(no==1) {
			//해당 모든 파일의 용량을 byte 배열로 변환 
			byte temp[] = new byte[is.available()];
			is.read(temp); //바이트로 읽었으면 read 필요
			String data = new String(temp); //해당 배열을 문자화 하여 적용 
			System.out.println(data); 
			//System.out.println(is.available());
			//System.out.println(is); // byte단위로 받아왔기 때문에 변환이 필요하다
			
		}
		else {
			System.out.println("프로그램 종료");
			System.exit(0);
		}
		is.close();
		this.sc.close();
	}
}