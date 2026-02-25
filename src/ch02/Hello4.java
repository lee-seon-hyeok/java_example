package ch02;

public class Hello4 {

	public static void main(String[] args) {// main : jvm의 시작점
		// 변수 선언과 초기화 ,사용[참조]하기 전에 초기화 되어야 한다. = variable
		int value = 3;
		// 변수는 값을 언제나 변화할 수 있음
		int value1;
		// JVM의 stack에 int의 4 BYTE를 확보
		int value2;
		// 다른 자리에 int의 4byte를 또 확보
		System.out.println(value);
		// 출력문 안에는 무조건 참조할 값을 출력

		// 상수 선언, 딱 한번만 사용하고, 값을 변할 수 없음(재할당 불가) => contant
		final double PI = 3.14;
		// final를 붙이는 순간 상수가 됨
		// P1 = 3.14000
		System.out.println(PI);
	}

}
