package data_structure;

import java.util.ArrayList;

public class ArrListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);// capactiy보다 더 많은 양을 넣었기 때문에 에러가 걸린다. -> 수정 완료
		list.add(40);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		System.out.println(list);
		// 리스트로 출력

		for (int i = list.size() - 1; i > 0; i--) {
			System.out.println(list.remove(i) + "삭제되었습니다");

		} // 메모리낭비 과정 확인함
		/*
		 * list.remove(11); System.out.println(list.remove(3) + "이 삭제되었습니다.");
		 * System.out.println(list); System.out.println(list.remove(2) + "이 삭제되었습니다.");
		 * System.out.println(list); System.out.println(list.remove(1) + "이 삭제되었습니다.");
		 * System.out.println(list); System.out.println(list.remove(0) + "이 삭제되었습니다.");
		 * System.out.println(list); //removed가 처리가 안되어서 오류 System.out.println(list);
		 */
		System.out.println(list.get(list.size() - 1));
		// list에서 인덱스 위치에 있는 값을 가져온다. -> 마지막에 있는 값을 갖고 온다.
		System.out.println("현재 동적 배열의 크기는 " + list.size());

		System.out.println(list.isEmpty());

	}

}
