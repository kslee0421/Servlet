package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.omg.CORBA.portable.InputStream;

//이미지 파일 처리 (Stream)
public class file13 {

	public static void main(String[] args) {
		try {
			data11 dt = new data11();
			dt.abc();
		}
		catch(Exception e) {
			
		};
	}

}
class data11{
	public void abc() throws Exception{
		java.io.InputStream is = new FileInputStream("E:\\project\\web\\src\\main\\webapp\\panda.jpg");
		System.out.println(is.available());
		/* 한번에 읽는 방법
		 * byte[] file = new byte[is.available()];
		int b =is.read(file);
		*/
		//is.read();
		OutputStream os = new FileOutputStream("panda.jpg");
		//System.out.println(b);
		//%로 확인
		//int b =is.read(file);
		
		//os.write(file);
		byte[] file = new byte[is.available()/100]; //한번에 읽어 들일 수 있는 크기
		int img =0; //읽어 들이는 byte수 
		int check =0; // 읽는 횟수 
		/*복사율을 표시하면서 progress-bar를 이용하여 보여 줄 때 */
		while(true) {
			img = is.read(file);  //읽어들일 수 있는 용량 만큼 읽기
			if(img ==-1) { //더 이상  byte가 없을 경우 정지 조건
				break;
			}
			else {
				if(check <= 80){	//80% 이하일 경우 자속적으로 복사 				
					os.write(file,0,img);
				}
				else { // 80%이상일 경우 정지
					break;
				}
			}
			check++;
			if(check % 2==0) {  //진행률 표시기능
				System.out.println(check + "%");
			}
		}
		os.flush();
		os.close();
		is.close();
	}
}
