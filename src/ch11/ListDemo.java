package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// CRUD 테스트 (Create, read, Update, Delete)
		// 1)new ArrayList로 생성해서 원소 삽입 삭제 가능하며 set으로 수정 여부
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.get(0);
		list1.set(0, 20);
		list1.remove(0);

		// 2)Arrays.asList()로 생성해서 원소 삽입 삭제 가능하며 set으로 수정 여부
		// 12바이트 연속으로 정적인 배열이 있음
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		// list2.add(10) -> 에러가 나옴
		// list2.remvoe(10);
		System.out.println(list2.get(0));
		list2.set(0, 10);
		System.out.println(list2.get(0));

		// 3)List.of()로 생성해서 원소 삽입 삭제 가능하며 set으로 수정 여부
		List<Integer> list3 = List.of(1, 2, 3);
		// list3.add(10);
		// list3.remove(0);
		// list3.set(0,10);
		System.out.println(list3.get(0));

		// 불견 객체인 list.of에 추가, 삭제 가능하게 하려면 각변객체 ArrayList로 만든다.
		List<Integer> list4 = new ArrayList<Integer>(list3);
		list3.add(10);
		list3.get(0);
		list3.set(0, 20);
		list3.remove(0);

		// 가변객체(CRUD) ArrayList를 크기가 고정된 Array로 다시 변환하는 법
		Integer[] integears = list4.toArray(new Integer[3]);
		// Array는 크기가 고정이므로, 크기를 설정해야 한다.
		System.out.println(integears[0]);
		integears[0] = 10;
	}
}
