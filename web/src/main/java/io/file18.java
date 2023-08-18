package io;

import java.io.FileWriter;
import java.util.Scanner;

//숙제 
/* 
  Scanner를 이용하여 총 10개의 숫자를 입력합니다
  단, 1~100까지의 숫자만 입력이 가능하며, 100이상 숫자를 입력할 경우
  해당 콘솔로 "100까지의 숫자만 입력가능 합니다." 라고 메세지를 출력 되어야 합니다.
  무조건 10개의 숫자를 받아야하며, 해당 숫자는 모두 data_num.txt 파일로 저장되어야 합니다.
  continue
  힌트 ) 무한반복 사용 및 카운팅을 사용 해야함 
  */
public class file18 {

	public static void main(String[] args) {
		try {
			data188 d =new data188();
			d.abc();
		}
		catch(Exception e) {
			System.out.println("파일 오류 발생");
		}

	}

}
class data188{
	Scanner sc =null;
	FileWriter fw = null;
	
	public void abc() throws Exception {
		this.sc = new Scanner (System.in);
		this.fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\data_num.txt");
		int i =0;
		while(true) {
			System.out.println("1~100까지의 숫자를 하나 입력하세요");
			String num = this.sc.nextLine().intern(); //quit때문에 sring으로 받음 
			if(num =="quit" || i == 10) {
				System.out.println("숫자10개를 모두 입력했습니다.");
				break;
			}
			else if(num == ""){
				System.out.println("공백은 입력하실 수 없습니다.");
			}
			
			else {
				if(Integer.parseInt(num) > 100) { //100이상 입력시 해당 
					System.out.println("100까지의 숫자만 입력가능 합니다.");
				}
				else { //100이하 입력시 해당 
					this.fw.write(num+"\n");
					i++;
					System.out.println(i +"번째 입력값");
					//continue;
				}
			}
		}
		fw.close();  //파일 저장 (close 안할 경우 해당 파일은 오픈되어 있으므로 저장되지 않는 상황 발생)
		sc.close(); //Scanner 종료
		System.out.println("모든 내용은 정상적으로 저장되었습니다");
	} 
}	
