package array_test;

import java.util.ArrayList;
import java.util.Arrays;

//ArrayList 배열구조
public class array8 {

	public static void main(String[] args) {
		new array8().test();
	}
	public void test() {
		//ArrayList : 배열을 사용하는 클래스의 한 종류
		/*add (데이터추가) , get(데이터값 출력), remove(삭제)
		  size(배열 index갯수)*/
			
			String member[] = {"이순신","홍길동","유관순","강감찬"};
			ArrayList<String> ar = new ArrayList<String>(); //<> : 자료형이 뭐니??
			//System.out.println(ar.size());
			ar.add(member[0]);
			ar.add(member[2]);
			ar.add(member[3]);
			//System.out.println(ar.size());
			//System.out.println(ar);
			//System.out.println(ar.get(1));
			ar.remove(2);
			//System.out.println(ar);
			//Arrays.asList()  =/>원시배열값을 한번에 ArrayList 배열로 데이터를 이관 
			Integer no[] = {3,4,2,7,5,10};
			//ArrayList는 int라는 자료형이 없음
			ArrayList<Integer> ar2 =new ArrayList<Integer>(Arrays.asList(no));
			//System.out.println(ar2.size());
			//System.out.println(ar2);
			//ArrayList에 있는 값을 모두 합한 결과값을 출력하시오/
			
//			Integer sum =0;
//			for(Integer n : ar2) {
//				sum+=n;	
//			}
//			System.out.println(sum);
			int sum=0;
			int w =0;
			while (w <ar2.size()) {
				sum = ar2.get(w);
				w++;
			}
			//System.out.println(sum);
			//만약에 int로 원시데이터일 경우 ArrayList 사용이 불가능 한가?
			int no2[] = {3,4,2,7,5,10};
			ArrayList<Integer> ar3 = new ArrayList<Integer>();
			for(int f = 0; f < no2.length; f++) {
				ar3.add(no2[f]);
			}
			//System.out.println(ar3);
			
			/*
			 * 응용문제10 
			 * 다음 데이터가 있습니다. 
			 * 10,7,6,1,11,37,41,22 입니다. 
			 * 이중 해당 데이터에서 짝수값을 모두 삭제 되도록 하여
			 * 배열을 출력되도록 합니다. 결과 [7,1,11,37,41]
			 * 단 ArrayList 활용
			 */
			Integer ori_data[] = {10,7,6,1,11,37,41,22};
			ArrayList<Integer> ar4 = new ArrayList<Integer>(Arrays.asList(ori_data)); //데이터를 List에 꽃아넣기
			ArrayList<Integer> ar5 = new ArrayList<Integer>(); //데이터를 List에 꽃아넣기
			//ver1
//			for(Integer data: ar4) {  
//				if(data % 2 != 0) {
//					ar5.add(data); //foreach는 위에서 데이터를 계속 로드하므로 안된다.
//				}
//			}
//			System.out.println(ar5);
			//ver2
//			int ww =0;
//			while(ww< ar4.size()){  //size는 이미 데이터를 기억하고 있다
//				if(ar4.get(ww)%2==0) {
//					ar4.remove(ww);
//				}
//			}
			
			//ver3
			int ww = 0;
			while (ww < ori_data.length) {
				if(ori_data[ww]%2!=0) {
					ar5.add(ori_data[ww]);
				}
				ww++;
			}
			System.out.println(ar5);
	}	
}

/*
 * 1. 원시배열 형태 및 종류 
 * 2. 배열 사용시 라이브러리 확인법 
 * 3. 반복문과 조건문을 이용한 배열활용
 * 4. foreach 사용법 및 활용법
 * 5. 원시배열 데이터를 원시 빈 배열로 이관
 * 6. Arrays.sort 사용법
 * 7. 2차 원시 배열
 * 8. 2차 배열을 응용한 1차배열 병합
 * 9. ArrayList 사용법 및 활용
 */
