package ch10;

import java.util.function.Consumer;

public class MethodRefDemo {

	public static void main(String[] args) {

		// Mathematical m = d -> Math.abs(d);
		// 클래스 이름과 메서드만 남긴다. -> 람다식을 요약
		Methmatical m = Math::abs;

		// double 타입 받아서 double 타입을 반환
		// 반복되므로 d를 통해 추론핟.

		System.out.println(m.calculate(-10.0));
		// 람다식으로 입맛에 맞게 구현체를 만들어서 사용

		// Pickable p = (s, i) ->s.charAt(i);
		// 숫자를 받아서 캐릭터 넷에 i번째를 할당
		Pickable p = String::charAt;
		// 인스턴스 메서드 방식으로 축약 -> 매개변수 양쪽에 있으면 생략 가능 -> 인스턴스 메서드 참조
		System.out.println(p.pick("hello", 0));
		// 0번째 문자에 선택하라

		Utils utils = new Utils();
		System.out.println(utils.add(10, 20));

		Computable c = utils::add; // 인스턴스 메서드 참조
		System.out.println(c.compute(10, 20));
		// utill에 10,20 추가

		// Computable c = (i1, i2) -> utils.add(i1, i2);
		// Computable c = utils::add;
		// 인스턴스 메서드로 줄임 -> 인스턴스 메서드 참조
		// System.out.println(c.compute(10,20));
		// i1과 i2를 utils에 넣는다.

		// Consumer<String> c1 = s-> System.out.println(s);
//	Consumer<String> c1 = System.out.println(s);
		Consumer<String> c1 = System.out::println;
		// Consumer s 문자열을 전달받아서 s를 출력할 경우

		// NewObject<String> s1 = x -> new String(x);
		// 반복 됬으므로 줄인다.
		NewObject<String> s1 = String::new; // 생성자 참조

	}
}

interface Methmatical {
	double calculate(double d);
} // functional 인터페이스 : 추상메서드 1개만 가진 인터페이스

interface Pickable {
	char pick(String s, int i);
	// functional 인터페이스

}

@FunctionalInterface
interface Computable {
	int compute(int x, int y);
}

class Utils {
	int add(int a, int b) {
		return a + b;
	}
}

@FunctionalInterface
interface NewObject<T> {
	T getObject(T o);
}