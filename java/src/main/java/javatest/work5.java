package javatest;

import java.util.Arrays;
import java.util.Scanner;

/*
 숙제: 상속형태의 클래스를 이용하여 다음 문제에 맞는 결과값을 도출하는 코드를 작성하시오
 [DB] = {55,1,6,8,10,22,96,33,31,45,48,60}
 "해당 데이터를 1번. 짝수 2. 홀수 를 선택하세요 "
 
 [결과]
 짝수값 : 6,8,10,22,96,48,60
 홀수값 : 55,1,33,31,45
 정렬까지 하기
 [최종값(짝수)] : 6,8,10,22,48,60,96 (오름차순으로 정렬)
 최종값에 대한 오름차순으로 정렬하여 최종 출력 합니다.(sort)
 */
public class work5 {

	public static void main(String[] args) {
		search sh = new search();
		//sh.list(); //상속 받은 
		sh.datasearch();
	}
}

class db {//DB영역
	String members[][] =null; //원시배열 선언
	int even[]=null;
	int db[]=null;
	public void list() {
		this.db= new int[]{55,1,6,8,10,22,96,33,31,45,48,60};
	};
};
class even extends db{ //deepToString 2차배열에서 사용하는 메소드
	Scanner sc = null;
	
	@Override
	public void list() {
		super.list();
		this.sc = new Scanner(System.in);
		//System.out.println(Arrays.deepToString(this.members));//2차배열 출력시
		System.out.println("해당 데이터를 1번. 짝수 2. 홀수를 선택하세요 ");
		String data = this.sc.nextLine().intern();
		int node = 0;
		int ea = db[].length;
		if(data =="1") {
			for(int i =1; i<=db[].length; i++) {
				
			}
			if(sum %2==0) {//짝수
				msg="짝수";
			}else {//홀수
				msg ="홀수";
			}
			node =node;
			break;
		}
		else {
			node++;				
		}
		
	}
	public void datasearch() {
		
		this.sc = new Scanner(System.in);
		//System.out.println(Arrays.deepToString(this.members));//2차배열 출력시
		System.out.println("해당 데이터를 1번. 짝수 2. 홀수를 선택하세요 ");
		String data = this.sc.nextLine().intern();
		int node = 0;
		int ea = db[].length;
		if(data =="1") {
			for(int i =1; i<=db[].length; i++) {
				
			}
			if(sum %2==0) {//짝수
				msg="짝수";
			}else {//홀수
				msg ="홀수";
			}
			node =node;
			break;
		}
		else {
			node++;				
		}
		web/arraytest.java
		
		int ea = n[0].length;
		int w =0;
		int sum; //int sum =0 ;  이렇게 쓰는경우:: sum +=변수 or sum =sum+변수 
		String newdata[] = new String[ea];
		while(w <ea) {
			sum = n[0][w] + n[1][w];
			if(sum %2==0) {//짝수
				msg="짝수";
			}else {//홀수
				msg ="홀수";
			}
			newdata[w] =msg; 
			w++;
		}
		System.out.println(Arrays.toString(newdata));
		
		int a[] = {10, 1 ,6, 9, 20, 11};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//System.out.println(node);
		System.out.println("검색할 과목명을 입력하세요 (국어, 수학, 과학, 역사):");
		String subject = this.sc.nextLine();
		int snode = 0; //과목에 대한 노드 번호
		switch(subject) {
		case "국어":
			snode =0 ;
		break;
	
		case "수학":
			snode =1 ;
		break;	
		case "과학":
			snode =2 ;
		break;	
		case "역사":
			snode =3 ;
		break;	
		default: //case 외에 사용도는 명령어
			System.out.println("해당과목은 존재하지 않는 과목입니다.");
		break;	
		}
		System.out.println("-"+name+" 학생의 " + subject + " 점수는 "+this.members[node][snode]+"입니다." );
	}
}