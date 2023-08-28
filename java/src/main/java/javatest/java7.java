package javatest;
//doble loop
public class java7 {

	public static void main(String[] args) {
		new data4().abc();

	}

}
class data4{
	public void abc() {
		//for+for 
		/*
		int f,ff;
		int total;
		for(f=1; f<=5;f++) {
			for(ff=1; ff<=5; ff++) {
				total = f +ff;
				System.out.println(total);
			}
		}*/
		/*
		int w =1;
		int total = 0;
		while ( w<= 5) {
			int ww =1; //while문 dowhile문은 초기값이 바로 위에 있어야한다
			while(w<5) {
				total = w+ww;
				System.out.println(total);
				w++;
			}
			w++;
		}*/
		/*int z =1;
		int total; //누적되는 값이 아니면 값을 안 넣어도된다
		do {
			int zz =1;
			do {
				total = z +zz;
				System.out.println(total);
				zz++;
			}
			while(zz<=5);
			z++;
		}while (z<=5);
		*/
		/*
		 for+while 
		 1+1=2 
		 1+2=3
		 1+3=4
		 2+1=3
		 2+2=4
		 3+1=4
		 3+2=5
		 3+3=6 
		 
		 */
		int q=1;
		int esum =0;
		for(q=1; q<=3; q++) {
			int e =1;
			while(e<=3) {
				esum= q + e;
				System.out.println(q+"+"+e+"="+esum);
				e++;
			}
			
		}
		
	}
}





