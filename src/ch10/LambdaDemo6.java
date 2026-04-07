package ch10;

public class LambdaDemo6 {

	public static void main(String[] args) {
		String s = "hello"; // 외부에 선언된 변수 -> 람다 유희사항 1번
		// UseThis u = (s) -> System.out.println(s + "useThis 람다식 구현체입니다.");
		// s를 넣으면 람다식 내부에서 외부에서 선언된 변수를 들고 오니 에러가 나옴

		// UseThis u = (s1) -> System.out.println(s1 + "useThis 람다식 구현체입니다.");

		UseThis u = (s1) -> {
			// s = s + ",java";
			// 외부 지역변수를 람다식 변수로 선언하는 것은 안됨
			// 람다식 내부에서 지역변수의 값을 변경할 수 없다.

			System.out.println(s1 + s + "useThis 람다식 구현체입니다.");
		}; // 외부에 선언된 지역 변수를 가져다 참조 변수로 쓰는 것은 가능

		// 두 줄을 생략 못한다. -> 람다 유희사항 2번
		u.use("hi");
	}

}

@FunctionalInterface
interface UseThis {
	void use(String s);

}