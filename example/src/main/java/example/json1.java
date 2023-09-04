package example;

import java.io.BufferedWriter;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class json1 {
// js.14.html에서 사용한 data.json을 제작하여 활용하는 형태
	/*
	 json1에서.java에서 원시 배열 값을 변환 후 Front가 해당 데이터를 ajax 로드하여 웹페이지에 출력하는 형태
	 */
	
	public static void main(String[] args) throws Exception{
		JSONObject jo = new JSONObject(); //키를만들때  put만 사용 키만 생성
		JSONArray ja = new JSONArray(); //배열형태 add만 사용, data를 생성
		int user[] = {2600,190,190}; //숫자형태 
		int w = 0;
		while (w < user.length) {
			//ja.add(user[w]); //키가 없는 형태의 배열
			//키 생성시 반복문으로 작동하면 객체 및 인스턴스를 새롭게 생성하면서 적용해야합니다.
			JSONObject jo2= new JSONObject(); //배열형태 add만 사용, data를 생 //키 생성상 반복문으로 작동하면 객체 및 인스턴스를 새롭게 생성하면서 적용해햐한다
			jo2.put("product"+w,user[w]);//("키이름",데이터값) 
			//ja.add(jo);
			ja.add(jo2);//[] 배열화 적용
			//System.out.println(user[w]);
			w++;
		}
		jo.put("member", ja); //대표키를 생성하는 형태
		System.out.println(ja);
		System.out.println(jo);
		FileWriter fw = new FileWriter("E:\\project\\example\\src\\main\\webapp\\member.json",false);
		//fw.write("test");
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("ajax_data("+jo.toString()+")"); //CORS를 해결하기 위한 함수호출로 적용
		//bw.write(jo.toString()); //배열형태를 문자열로 변환 후 저장
		
		bw.write(jo.toString());
		//fw.write(jo.toString());
		
		bw.flush();
		bw.close();
		fw.close();
	}
	
}
