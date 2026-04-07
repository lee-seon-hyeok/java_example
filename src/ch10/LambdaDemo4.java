package ch10;

import java.util.function.Function;

public class LambdaDemo4 {

	public static void main(String[] args) {
		/*
		 * Runnable r = ()-> System.out.println("runnable 구현체입니다."); //Runnable 함수형
		 * 인터페이스의 람다식 r.run(); //runnable 실행문
		 */
		/*
		 * Consumer<String> c = t -> System.out.println(t + "Consumer의 구현체입니다.");
		 * c.accept("hello"); //t.accept -> 매개변수로 받음
		 */
		// Supplier<String> s = () -> null;
		// 매개변수 전달된게 없으면 () 생략 x
		/*
		 * Supplier<String> s = () -> "hello"; System.out.println(s.get()); // s.get으로
		 * 매개변수 받음
		 */
		Function<String, Integer> f = t -> t.length();
		// 매개변수가 T 반환값이 R, 이때 재너릭일 경우 String과 integer 반환
		System.out.println(f.apply("hello"));
		// apply로 매개변수 받음

	}
}
/*
 * @FunctionalInteface public Interface Runnable{ public abstract void run(); }
 */
