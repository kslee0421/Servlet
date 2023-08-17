package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//Stream으로 파일로드 방식 + 쓰기 
public class file11 {

	public static void main(String[] args) {
		try {
			data8 d =new data8();
			d.abc();
		}
		catch(Exception e){
			System.out.println("소스 코드 및 경로 실패!!");
		}
	}

}
class data8{
	public void abc() throws Exception{
		InputStream is = new FileInputStream("E:\\project\\web\\src\\main\\webapp\\datalist.txt");
		//디렉토리 위치 확인
		//System.out.println(is.available()); //용량 체크 available() : 파일 전체 크기
		//byte temp[] = new byte[is.available()]; //파일 전체를 모두 byte 배열로 적용
		byte temp[] = new byte[1024*10];  //10KB 1MB = 1024 * 1024 * 1
		is.read(temp); //파일더블클릭 열기 전체 크기 확인 방식 한번 읽어오기 아스키는 리드라인으로 읽음
		//read()가 필요한 이유는 해당 파일 바이너리 형태로 읽기 때문에 read 메소드로 파일 전체를 읽어 들임
		//System.out.println(ea); 
		
		String data = new String (temp,"UTF-8"); //강제로 언어셋 변경
		System.out.println(data);
		is.close();
		try {
			data9 z =new data9();
			z.zzz();
		}
		catch(Exception e) {
			System.out.println("데이터 쓰기 오류 발생!!");
			
		}
	}
}

class data9{
	public void zzz() throws Exception{
		String test = "\n연습입니다.";
		OutputStream os = new FileOutputStream("E:\\project\\web\\src\\main\\webapp\\datalist.txt",true); //파일 저장
		//true쓰는거 잊지 말기 : 안쓰면 데이터위에 덮어씌우게 된다
		byte[] data = test.getBytes();  //문자열을 byte 단위로 변환 (바이너리)
		os.write(data); //바이트 형태이다
		os.flush();
		os.close();
	}
}

