package ch10;

import java.util.ArrayList;

public class LambdaDemo5 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10); // 오토박싱으로 객체로 자동 형변환
		list.add(20);
		list.add(30);
		System.out.println(list);

		for (Integer integer : list) {
			System.out.println(integer);
			;
		}
		list.forEach(i -> System.out.println(i)); // consumer의 구현체에 람다식을 넣는다.
		// consumer는 매개변수가 있고, 반환 타입이 없다.
		// list 같이 반복하는 객체는 리터널을 상속 받음
		// i : integer, s : string 등을 준다
		// 따라서 foreach문과 비슷한 결과가 나온다

		// 4번 돌면서 하나씩 꺼낸다. 이때 정적인 변수가 있으므로 removeIf 사용
		// removeIf : 매개변수가 있고 반환타입이 boolean, 결과가 맞으면 삭제한다.
		list.removeIf(i -> i % 2 == 0);//

		list.replaceAll(i -> i * 10);
		// UnaryOperator의 구현식
		// 1과 3인 남은 상태에서 i를 읽고 i * 10 수행

		list.forEach(i -> System.out.println(i)); // Consumer 의 구현체,람다식 ==> 매개변수가 있고, 반환타입이 없는 람다식
		list.removeIf(i -> i % 2 == 0); // Predicate 의 구현체, 람다식
		list.forEach(i -> System.out.println(i)); // Consumer 의 구현체,람다식
		list.replaceAll(i -> i * 10); // UnaryOperator 의 구현체, 람다식
		list.forEach(i -> System.out.println(i));

	}

}
