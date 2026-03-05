package ch06;

import static java.util.Arrays.sort;
//static 메서드 import : 앞에 arrays을 쓸 필요 x
//클래스 명 생략하고 메서드 이름만으로 호출되고 사용가능함
import java.util.Arrays;

//tostirng은 범위가 굉장히 크고 모호해서 거의 쓰지 않음 

public class StaticImportDemo {

	public static void main(String[] args) {
		int[] data = {3,5,2,7};
		
		System.out.println(Arrays.toString(data));
		Arrays.sort(data);
		//sort를 만나면 2,3,5,7로 정렬한다.
		
		double[] datas = {1.0, 0.1, 0.7};
		System.out.println(Arrays.toString(data));
	    System.out.println(Arrays.toString(datas));

	}

}
