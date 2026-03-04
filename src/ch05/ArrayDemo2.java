package ch05;

import java.util.Arrays;

import ch04.Circle;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int[] scores = new int[5]; // 초기화를 하지 않음
		// int 객체를 heap 영역에 만든다.

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[0]); // 0으로 초기화된다
			System.out.println(scores[i]);
		} // for문으로 시간이 더오래 걸림

		scores[3] = 100;
		int score = scores[3]; // 참조
		System.out.println(score);
		System.out.println(Arrays.toString(scores));
		// for문 할 필요 없음

		// 배열에 담고 있는 바이트는 integer, 해당 주소로 가면 배열의 첫번째 값이 있다.

		/*
		 * for (int i = 0; i < scores.length; i++) { System.out.println(scores[i]); //
		 * 0으로 반복됨
		 * 
		 * }
		 */
		// 3번째 인덱스에 100을 넣는다. -> s[3] = 100

		int[] scores2 = new int[10];
		// 배열의 크기를 늘리기
		// 배열들을 옮기고 값을 채운다. -> 불편함 -> 동적 배열이 나오게 됨

		// 문자열(사람의 이름)을 담은 배열
		String[] s = new String[3]; //

		// 객체(원)을 담은 배열
		Circle[] circles = new Circle[3];
		// 4byte씩 확보 -> Circle은 참조 데이터 type -> heap에 저장된 byte은 기본이 4byte
		// 4byte에서 3byte를 넣을 수 있다. -> 최소 12byte는 확보해 준다.

		// Ball[] balls = new Ball[5] -> 4 * 5 = 20 byte로 주소를 확보한다.
		// 객체는 기본으로 4byte를 확보시켜준다.

		circles[0] = new Circle();
		// int 배열은 arrays 도움을 받아 출력한다.
		System.out.println(circles); // 배열이 circle은 갖는 객체로 주소 출력
		// arrays 도움을 받아 circles를 출력한다.
		// System.out.println(ArraysList());
	}

}
