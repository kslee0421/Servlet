package io;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//I/O응용편 
/*
 * 응용문제1번
 * 해당 데이터를 파일로 저장 후 출력하는 프로세서를 제작하시오.
 * "hong", "kim", "park", "lee"
 * "25", "30", "44", "26"
 * "홍길동", "김유신", "박찬호", "이순신"
	
	파일의 저장 형태는 다음과 같습니다.
	홍길동: hong(25)
	김유신: kim(30)
	박찬호: park(44)
	이순신: lee(26)
	단, 파일명은 member_list.txt로 저장 되어 있어야 합니다.

 * */
public class file14 {

	public static void main(String[] args) {
		try {
			data15 a =new data15();
			a.abc();
		}
		catch(Exception e) {
			System.out.println("파일오류발생!!");
			System.out.println(e);
		}

	}

}
class data15{
	FileWriter fw = null;
	/*빈 파일 생성*/
	//Path data5 = Paths.get("E:\\project\\web\\src\\main\\webapp\\member_list.txt");
	//Files.createFile(data5);
	public void abc() throws Exception{
		String user[][] = {
				{"hong", "kim", "park", "lee"},
				{"25", "30", "44", "26"},
				{"홍길동", "김유신", "박찬호", "이순신"}				
		};
		this.fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\data.txt");
		//FileWriter true는 : 기존 데이터를 삭제 하지 않고 지속적으로 데이터를 추가하는 형태 
		int ea = user[0].length;
		for(int i=0; i<ea; i++) {
			this.fw.write(user[2][i] +":"+ user[0][i] +"("+ user[1][i]+")"+"\n" );
		}
		fw.close();
	}
}






