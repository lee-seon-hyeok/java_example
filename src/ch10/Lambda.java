package ch10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "d", "c");
		// 참조변수 선언할 때 제네럴 타입을 지정해야 함 -> 문자열만 담는 리스트

		System.out.println(list);
		Collections.sort(list); // 오름차순으로 정렬
		System.out.println(list);

		/*
		 * // 자바 유틸에 갖고 있는 collection에 sort를 사용한다 Collections.sort(list, new
		 * Comparator<String>() { // 내림차순으로 정렬하기 위해 Comparator FI의 구현체인 람다를 활용한다.
		 * 
		 * @Override public int compare(String o1, String o2) { // return
		 * o1.compareTo(o2); //오름차순 // 부호를 뒤집으로면 o2,o1를 바꾼다 return o2.compareTo(o1); }
		 * // comparator에 ctrl + space로 사용 // comparator 안에 있는 int compare( T o1, To2)
		 * 사용하여 구현체를 만든다. // 인터페이스 앞에는 public가 생략되었기 때문에 int compare()에 public 붙인다. });
		 */

		// 익명 객체 안에 있는 구현체에 대한 메서드를 람다로 줄일 수 있다.
		Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
		System.out.println(list);

	}

}
