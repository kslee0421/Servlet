package javatest;

import java.util.*;

/*응용문제1
 override를 활용함
"학생명를 입력해 주세요"
"검색할 과목명을 입력하세요 (국어, 수학, 과학, 역사):"
데이터는 데이터 별도의 class를 이용합니다. 해당 calss안에 해당 배열 데이터가
있으며, 해당 데이터를 상속 받아서 다음과 같이 결과가 돌출 되도록 프로세서를 작성하시오.
[데이터] -override
{"홍길동","이순신","유관순"},
{"80","78","92","40"},
{"40","80","80","100"},
{"55","40","50","90"}

결과 -overload
홍길동
과학 88점
 */
public class java13 {

	public static void main(String[] args) {
		search sh = new search();
		//sh.list(); //상속 받은 
		sh.datasearch();
	}

}

class datalist {//DB영역
	String members[][] =null; //원시배열 선언
	String userlist[] =null;
	
	public void list() {
		this.userlist =new String[]{"홍길동","이순신","유관순"};
		this.members =new String[][] {
			{"80","78","92","40"},
			{"40","80","80","100"},
			{"55","40","50","90"}
		};
	};
};
class search extends datalist{ //deepToString 2차배열에서 사용하는 메소드
	Scanner sc = null;
	@Override
	public void list() {	
		super.list(); //super은 상속 받을 때 해당 메소드를 실행 후 상속 받음
		//System.out.println(this.members[1][1]);
		//System.out.println(Arrays.toString(this.members));
		
	}
	public void datasearch() {
		this.list();
		this.sc = new Scanner(System.in);
		//System.out.println(Arrays.deepToString(this.members));//2차배열 출력시
		System.out.println("학생명를 입력해 주세요");
		String name = this.sc.nextLine().intern();
		int node = 0;
		for(String n : this.userlist) {
			if(n==name) {
				node =node;
				break;
			}
			else {
				node++;				
			}
		}
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


//class print extends student {
//	Scanner sc = new Scanner(System.in);
//	public void datainput(){
//		System.out.println("학생명를 입력해 주세요");
//		String name = sc.nextLine().intern();
//		System.out.println("검색할 과목명을 입력하세요 (국어, 수학, 과학, 역사):");
//		String sub = sc.nextLine().intern();
		//int ea =data[][].length();
		//if(data[])
//		String a[] = new String[data.length];
//		String q[] = {"학생명를 입력해 주세요","검색할 과목명을 입력하세요 (국어, 수학, 과학, 역사):"};
//		String aswer[] = new String[data.length];
//		int w= 0;
//		while(w <q.length) {
//			System.out.println(q[w]);
//			aswer[w] = sc.nextLine();
//			w++;
//		}
//		System.out.println(Arrays.toString(aswer));
//		System.out.println((data[1][2]));
//	}
//}

