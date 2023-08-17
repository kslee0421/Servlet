package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

//BufferedInputStream, BufferedOutputStream
public class file15 {

	public static void main(String[] args) {
		try {
			data12 d =new data12();
			d.abc();
		}
		catch(Exception e) {
			System.out.println("파일 저장 코드 오류");
		}
	}

}

class data12{
	public void abc() throws Exception{
		String file ="E:\\project\\web\\src\\main\\webapp\\panda.jpg";
		String file2 ="E:\\project\\web\\src\\main\\webapp\\panda.jpg";
		//InputStream is =new FileInputStream(file); //아래랑 같은 말
		//FileInputStream fs = new FileInputStream(file);
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		byte filesize[] = new byte[bi.available()];
		//System.out.println(Arrays.toString(filesize));
		
		int total = bi.read(filesize);
		if(total > 50000) {
			System.out.println("이미지 제한 용량을 초과합니다.");
		}
		else {
			System.out.println("이미지 제한 용량 확인");
			OutputStream os = new FileOutputStream("panda2.jpg");
			os.flush();
			os.write(filesize);
			os.close();
		}
		
	}
}