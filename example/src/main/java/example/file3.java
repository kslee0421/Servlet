package example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class file3 {
	/*숙제
	 *user_tel.txt 파일을 로드 후 해당 사용자에 맞게 전화번호가 등록 되도롣 배열화 하여
	 *콘솔로 출력 되도록 합니다.
	 *단, cms_db.txt 해당 내용이 저장되어야 합니다.
	 *결과:
	 *홍길동(01011245564)
	 *김유신(01020041004) */
	public static void main(String[] args) {
		try {
			new tel().abc();
		}
		catch(Exception e) {
				System.out.println("파일 오류 발생!!");
				System.out.println(e);
		}
	}
}
class tel {
	FileReader fr = null;

	BufferedReader br =null;
	ArrayList<String> ar = null;
	FileWriter fw = null;
	
	public void abc() throws Exception{
		String url ="E:\\project\\example\\src\\main\\webapp\\user_tel.txt";
		this.fr = new FileReader(url);
		this.br =new BufferedReader(this.fr);
		this.ar =new ArrayList<String>();
		
		String data =null;
		String data2[] =null;
		this.fw = new FileWriter("E:\\project\\example\\src\\main\\webapp\\cms_db.txt");
		while ((data = br.readLine())!=null) {
			this.ar.add(data);
		}
		for(int i =0; i<ar.size(); i++) {
			data2 = ar.get(i).split("[|]");
			data2[1]=data2[1].replaceAll("-","");
			//System.out.println(Arrays.toString(data2));
			this.fw.write(data2[0]+"("+data2[1]+")"+"\n");
		}
		this.fw.close();
		this.br.close();
		this.fr.close();
		
		try {
			new tel2().abc();
		}
		catch(Exception e) {
			System.out.println("파일 오류 발생2!!");
			System.out.println(e);
		}
	}
	
}

class tel2 {
	FileReader fr2 = null;
	public void abc() throws Exception{
		this.fr2 = new FileReader("E:\\project\\example\\src\\main\\webapp\\cms_db.txt");
		BufferedReader bf = new BufferedReader(this.fr2);
		
		ArrayList<String> al = new ArrayList<String>();
		String line =""; 
		while ((line = bf.readLine())!=null) {
			al.add(line);
		}
		System.out.println(al);
	}
}