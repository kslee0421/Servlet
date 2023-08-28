package javatest;

import java.sql.*;
import java.util.*;
/*숙제1 
 * "개인정보 수집 및 이용동의 (Y/N)"
 * "이메일 수집 및 이용동의 (Y/N)"
 * "통합서비스 약관 이용동의 (Y/N)"
 * 해당 동의를 모두 Y를 하였을 경우
 * "서비스 이용약관에 모두 동의 하셨습니다." 콘솔이 출력
 * 단, 하나라도 N 적용시 다시 처음부터 약관 동의 내용이 출력 되도록 합니다.
 * */
public class work1 {

	public static void main(String[] args) {
			try {
				new data().abc();	
			}
			catch(Exception e) {
				System.out.println("N과 Y만 입력해주세요");
				System.out.println(e);
			}
	}

}
class data {
	Scanner sc = null;
	public void abc() throws Exception{

		this.sc=new Scanner(System.in);
		System.out.println("####개인정보 이용 동의####");
		
		System.out.println("개인정보 수집 및 이용동의(Y/N)");
		String p_agree = this.sc.nextLine().intern();
		if (p_agree == "N" || p_agree == "") { 
			abc(); 
		}
		
		System.out.println("이메일 수집 및 이용동의 (Y/N)");
		String e_agree = this.sc.nextLine().intern();
		if (e_agree == "N" || e_agree == "") { 
			abc();  
		}
		System.out.println("통합서비스 약관 이용동의 (Y/N)");
		String  a_agree = this.sc.nextLine().intern();
		if (a_agree == "N" || a_agree == "") { 
			abc();  
		}
		else {
			System.out.println("서비스 이용약관에 모두 동의 하셨습니다.");
			
		}
		this.sc.close();
	}
	
}
