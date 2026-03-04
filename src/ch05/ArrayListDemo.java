package ch05;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		// 동적 배열 선언

		al.add(10);
		al.add(20);
		al.add(30);

		System.out.print(al);
		// 크기가 고정되지 않아서 자유롭게 넣을 수 있고 전붇 출력한다
		// 메모리가 허용된 한, 데이터를 계속 넣을 수 있다.
		// 역속된 공간을 확보 못하면, 오류가 나온다.

	}

}
