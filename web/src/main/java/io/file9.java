package io;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

//FileReader, FileWriter, CharArrayReader : 파일읽고, 쓰기 (문서용) -아스키 -문자
//Buffered,LineNumberReader : 메모리 영역
//Stream 이란 : 문서용, 이미지, 동영상, 오디오 (바이너리) -숫자
//FileinpuStream, AudioInputStream, ObjectInputStream
//BufferedStream

//InputStream, OutputStream :대분류
//FileinputStream, AudioInputStream, ObjectinputStream : 소분류
public class file9 {

	public static void main(String[] args) {
		try {
			//InputStream is = System.in;  //키보드로 콘솔에서 받겠다
			//int code = is.read(); //해당 키를 입력시 ASCII코드로 인식하여 int로 변환
			//System.out.println(code);
			String a = "123456789";
			//String a = "ABCDE";
			//String a = "홍길동";
			byte[] b = a.getBytes();  //getBytes("언어패킷") - 문자를 byte 단위로 변환
			System.out.println(Arrays.toString(b)); //on 메모장 :alt +49
			OutputStream os = System.out;
			os.write(b,0,b.length); // (객체, 배열시작번호 :0 , 배열 종료번호)
			os.flush(); //무조건 0부터 시작해서 부어야지 0 대신에 
			//os.write(b,0,2);
			os.close();
			
			OutputStream os2 = new ByteArrayOutputStream();
			os2.write(new byte[] {10});
			os2.flush();
		}
		catch(Exception e) {
			System.out.println("코드오류발생");
			
		}

	}

}
