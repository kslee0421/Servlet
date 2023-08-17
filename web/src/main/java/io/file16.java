package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
/*
 InputStream > InputStreamReader > BufferReader(O)
 InpuStream > BufferedInputStream (o)
 FileinputStream > BufferReader (X)
 FileWriter>  OutputStream> fileOutputStream (X)
 */

//inputStreamReader, OutputSteamWriter : 바이너리를 아스키로, BufferedReader(아스키), Bufferedwriter(아스키) :아무거나 쓰면된다 
public class file16 {

	public static void main(String[] args) {
		try {
			data13 d = new data13();
			d.abc();
		}
		catch(Exception e) {
			
		}
	}

}
class data13{
	//InputStreamReader => Stream => Reader 변환 
	public void abc() throws Exception{
		String file ="E:\\project\\web\\src\\main\\webapp\\number.txt"; //이미지는 바이너리
		InputStream is = new FileInputStream(file); //바이너리
		InputStreamReader ir = new InputStreamReader(is);  //바이너리를 아스키로 먼저 InputStream나와야 함 
		//System.out.println((char)ir.read());
		BufferedReader br = new BufferedReader(ir);  //ir 대신 is
		
		System.out.println(br.readLine()); //버퍼리더로 태웠기 때문 에 readLine이 가능하다
		String data;
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
		br.close();
		ir.close();
		is.close();
	}
}

