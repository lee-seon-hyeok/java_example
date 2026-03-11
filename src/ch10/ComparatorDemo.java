package ch10;

import java.util.Arrays;

public class ComparatorDemo {

	public static void main(String[] args) {
		String[] arr = { "hello", "abc", "bcd" };
		// 아무 기준이 없으면 오름차순 정렬한다.
		/*
		 * Arrays.sort(arr, new Comparator<T>)() { public int compare(string o1, string
		 * o2) { //익명객체의 구현체로 람다를 갖고 있음
		 * 
		 * } };
		 */
		Arrays.sort(arr, (o1, o2) -> 0);
		System.out.println(Arrays.toString(arr));
		// 사전순으로 sort 되었는데, 이분에 기준을 바꾼다.
		// 글자수가 작은 것이 앞으로 오게 한다.

		// o1괴 o2의 길이 비교 ->comparable을 sort에 응용시킨다.
		Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());
		// 길이가 짧은 데이터가 앞으로 온다.

	}

}
