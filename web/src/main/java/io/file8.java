package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

//FileReader + Buffered 응용편 (datalist.txt)
/*
 * 응용문제2 
 * datalist.txt에 숫자가 있습니다. 해당 파일을 읽어 들여서 해당 숫자 중 짝수 값만 모두 출력되도록 하시오.
 * */
public class file8 {
	
	public static void main(String[] args) {
		try {
			data6 d =new data6();
			d.abc();
		}
		catch(Exception e) {
			System.out.println("파일 오류 발생");
		}
		
	}

}
class data6{
	FileReader fr = null; //파일리더가 있어야 버퍼리더를 쓸 수있다
	BufferedReader br =null;
	public void abc() throws Exception {
		this.fr = new FileReader("E:\\project\\web\\src\\main\\webapp\\datalist.txt");
		this.br = new BufferedReader(this.fr);
		
		ArrayList<String> al = new ArrayList<String>();
		String a =null; //buffer를 line에 넣어준다
		while ((a= this.br.readLine())!=null) {
			if(Integer.parseInt(a)%2 ==0) {
				System.out.println(a);
			}
		}
		System.out.println(al);
		br.close();
		this.fr.close();
		
	}
}