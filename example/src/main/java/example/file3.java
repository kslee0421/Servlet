package example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

/*숙제
 *user_tel.txt 파일을 로드 후 해당 사용자에 맞게 전화번호가 등록 되도롣 배열화 하여
 *콘솔로 출력 되도록 합니다.
 *단, cms_db.txt 해당 내용이 저장되어야 합니다.
 *결과:
 *홍길동(01011245564)
 *김유신(01020041004) */
public class file3 {
	public static void main(String[] args) {
		try {
			new tel().abc();
		}
		catch(Exception e) {
			System.out.println("파일 오류 발생!!");
		}
	}
}
class tel {
	//Reader -> Buffered -> ArrayList  ::byte(아스키 형태이므로 필요없음)
	//Stream -> BufferedStream -> ArrayList  ::byte필요
	//Stream -> BufferedStramReader -> Reader -> ArrayList ::byte필요
	FileReader fr = null;
	BufferedReader br =null;
	ArrayList<String> ar = null;
	
	public void abc() throws Exception{
		String url ="E:\\project\\example\\src\\main\\webapp\\user_tel.txt";
		this.fr = new FileReader(url);
		this.br =new BufferedReader(this.fr);
		this.ar =new ArrayList<String>();
		//System.out.println(this.br.readLine());
		//System.out.println(this.fr.read());
		String data =null;
		String tel[] =null;
		while ((data = br.readLine())!=null) {
			this.ar.add(data);
			String data2[]= data.split("[|]");
			System.out.println(Arrays.toString(data2));
		}	//일단 넣고 봐야함 안그러면 첫번째 데이터가 소실됨 
		//System.out.println(this.ar);
		for (int i=0; i< data.length(); i++ ) {
			ar.add();
		}
		this.br.close();
		this.fr.close();
	}
}
