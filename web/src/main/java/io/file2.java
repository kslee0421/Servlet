package io;

import java.io.FileReader;

//파일 읽어오기 I/O 파일데이터 읽어오기
public class file2 {

	public static void main(String[] args) {
		try {
			data1 d = new data1();
			d.aaa();
		}
		catch(Exception e) {
			//System.out.println(e);
		}

	}

}
class data1{
	public void aaa() throws Exception  {
	//문서 파일일 경우 UTF-8, ANSI 확인 후 저장 
		FileReader fr = new FileReader("E:\\project\\web\\src\\main\\webapp\\data.txt");
		//System.out.println(fr.getEncoding());  //파일을 읽어오는 인코더 형식 
		while(true) {   //무한 루프
			int m =fr.read();
			System.out.println(m);
			//System.out.println((char)m); //byte를 문자화해서 출력
			//1024byte == 1kbyte
			//1024kb = 1mb
			if(m== -1) {
				break;							
			}
		}
		fr.close(); //열린 파일 닫아줘야 한다
	}
}
;