package data_structure;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		System.out.println(list);
		// 리스트로 출력

		list.remove(3);

		System.out.println(list);
		System.out.println(list.get(list.size() - 1));
		// list에서 인덱스 위치에 있는 값을 가져온다. -> 마지막에 있는 값을 갖고 온다.
		System.out.println("현재 동적 배열의 크기는 " + list.size());

		list.forEach(System.out::println);
		// foreach로 한개씩 밑으로 출력

		System.out.println(list.isEmpty());

	}

}
