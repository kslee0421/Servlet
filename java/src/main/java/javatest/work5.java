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
		try {		
			even ev = new even(); 
			ev.list();
			}
		catch(Exception e){
			System.out.println(e.toString());
		}

	}
}
class db {//DB영역
	Integer db[]=null;
	public void list() {
		this.db= new Integer[]{55,1,6,8,10,22,96,33,31,45,48,60};
	};
};
class even extends db{ //deepToString 2차배열에서 사용하는 메소드
	Scanner sc = null;
	
	@Override
	public void list() {
		super.list();
		this.sc = new Scanner(System.in);
		System.out.println(" 1번. 짝수 2. 홀수를 선택하세요 ");
		String data = this.sc.nextLine().intern();
		int ea = db.length;
		int i =0;
		int j =0;
		int k =0;
		int count1 =0;
		int count2 =0;
		for(Integer n : db) {
			if(n%2==0) {
				count1++;
			}else {
				count2++;
			}
		};
		int even[] = new int[count1];
		int odd[] = new int[count2];
		//System.out.println(count1);
		//System.out.println(even.length);
		//System.out.println(count2);
		//System.out.println(odd.length);
		//System.out.println(data);
		//System.out.println(ea);
		for(i =0; i<ea; i++) {
			//System.out.println(db[i]);
			if(db[i]%2==0) {
				even[j]=db[i];
				j++;
			}
			else if(db[i]%2!=0){
				odd[k]=db[i];
				k++;
			}
		}
		Arrays.sort(odd);
		Arrays.sort(even);
		if(data =="1") {
			System.out.println(Arrays.toString(even));
		}else {
			System.out.println(Arrays.toString(odd));			
		}
	}
}	