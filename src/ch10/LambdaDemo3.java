package ch10;

import java.util.function.Predicate;

public class LambdaDemo3 {

	public static void main(String[] args) {
		/*
		 * MyFunction func = new MyFunction() {
		 * 
		 * @Override public void Mymethod() { System.out.println("익명객체입니다."); }
		 * };//익명객체를 출력하게 오버라이딩을 함
		 */
		// 람다식으로 바꾼다.
		MyFunction func = () -> System.out.println("익명객체입니다.");

		aMethod(func); // 매개변수로 전달

		MyFunction ff = bMethod();
		// 람다식을 가리키는 익명객체
		ff.Mymethod();
		// 람다식을 출력한다.

		Predicate<String> isEmpty = t -> t.length() == 0;
		// 이때 length가 0인지 물어보는 조건식 넣어야 한다.
		isEmpty.test("a");
		// isEmpty에 대한 값을 판단한다.
		System.out.println(isEmpty.test(""));

	}

	static void aMethod(MyFunction f) {
		// 익명객체를 받음
		f.Mymethod();

	}

	static MyFunction bMethod() {
		return () -> System.out.println("람다식입니다.");
		// 람다식을 봔한하는 익명객체로, Myfunction에 return으로 전달

	}
	// Myfunction 인터페이스의 매개변수
}

@FunctionalInterface
interface MyFunction {
	void Mymethod();
	// functionalinterface를 매개변수로 쓰는 매서드
}