package io;

import java.io.FileWriter;
import java.util.Scanner;

/*
 * 응용문제 1
 Scanner를 이용하여 사용자가 입력한 숫자를 모두 저장 되도록 합니다.
 "사용자가 1~100까지의 숫자 중 한가지를 입력하세요" 
 단, 한줄에 하나의 숫자가 입력 되도록 하며, quit라는 명령어를 입력시 더이상 프로세서를 작동되지 않도록 합니다.
 저장 파일명은 number.txt 로 저장 되도록 하시오.
 */
public class file6 {
	Scanner sc = null;
	
	public static void main(String[] args) {
		try {
			data4 da = new data4();
			da.abc();
		}
		catch(Exception e ) {
			System.out.println("해당 메소드 오류 발생!!");
		}
	}
}
	
class data4{
	Scanner sc =null;
	FileWriter fw = null;
	
	public void abc() throws Exception {
		this.sc = new Scanner (System.in);
		this.fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\number.txt",true);
		while(true) {
			System.out.println("1~100까지의 숫자를 하나 입력하세요");
			String num = this.sc.nextLine().intern(); //quit때문에 sring으로 받음 
			if(num =="quit") {
				break;
			}
			else {
				if(Integer.parseInt(num) > 100) { //100이상 입력시 해당 
					System.out.println("숫자는 제발 100 이하로 입력하세요");
				}
				else { //100이하 입력시 해당 
					this.fw.write(num+"\n");						
				}
			}
		}
		fw.close();  //파일 저장 (close 안할 경우 해당 파일은 오픈되어 있으므로 저장되지 않는 상황 발생)
		sc.close(); //Scanner 종료
		System.out.println("모든 내용은 정상적으로 저장되었습니다");
	} 
}	
	
