package ch09;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		// Array list = new ArrayList(); -> 아무것나 담을 수 있음
		// ArrayList<E>
		// E : 요소, T : 타입

		list.add(10);
		list.add(3.14);
		list.add("abc");
		// 아무거나 담을 수 있음 -> 꺼낼 때 문제 생김

		// list.get(0);
		// Integer i1 = list.get(0);
		// Object을 담았기 때문에, Object으로 꺼냄

		Object i = list.get(0);
		if (i instanceof Integer ii) {

		} // 타입 체크 + 형변환 동시에 해야 한다.
		i = list.get(1);
		Integer i3 = (Integer) i;
		System.out.println(i3 + 10);
		// 개발자가 확인못하면 exeception 발생

		ArrayList<Integer> intArr = new ArrayList<>();
		// ArrayList를 선언할 때, integer를 담음
		intArr.add(10); // int인지 타입 체크 미리 함
		// 이때 Auto 언박싱이 된다.
		// intArr.add(3.14);

		ArrayList<String> strArr = new ArrayList<>();
		strArr.add("abc");
		// strArr.add(10);
		// 0번째에서 꺼낸다.

	}

}
