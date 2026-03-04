package ch05;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		// 동적 배열 선언

		al.add(10);
		al.add(20);
		al.add(30);
		// 배열에 데이터 추가

		System.out.print(al);
		// 크기가 고정되지 않아서 자유롭게 넣을 수 있고 전붇 출력한다
		// 메모리가 허용된 한, 데이터를 계속 넣을 수 있다.
		// 역속된 공간을 확보 못하면, 오류가 나온다.

		al.remove(1);
		System.out.print(al);
		al.remove(2);
		System.out.print(al);
		// 1번 인덱스를 항복을 지우고, 한 칸씩 이동하여

		// 값을 추가한 때 맨 마지막 부분에 넣어 증가한다.
		// 값을 삭제를 때는 원하는 인덱스 부분에 삭제하여 데이터의 인텍스가 1칸 씩 증가한다.

	}

}
