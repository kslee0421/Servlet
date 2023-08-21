package example;

import java.util.Arrays;

public class split1 {

	public static void main(String[] args) {
		String test = "어벤져스-홈커밍,1위,2500";
		String test2 = "어벤져스-홈커밍|1위|2500";
		String test3 = "어벤져스-홈커밍+1위+2500";
		String data[]= test.split(",");
		String data2[]= test2.split("[|]");//자바스크립트는 ok but 자바에서는 연산기호라 안됨
		String data3[]= test2.split("[+]"); 
		System.out.println(data.length);
		System.out.println(Arrays.toString(data));
		System.out.println(Arrays.toString(data2));
		System.out.println(Arrays.toString(data3));
	}

}
