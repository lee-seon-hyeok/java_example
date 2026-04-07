package ch03;

public class A {
	// JVM 시작점, 메인 메소드를 호출한다.프로그램의 시작 지점

	public static void main(String[] args) {

		B b = new B();
		// B를 새로 b라고 부른다.
		System.out.println(B.sum());

		MyMath math = new MyMath();
		// System.out.println(math.add(10, 20));
		// System.out.println(math.sub(10, 20));

		System.out.println(math.add(10L, 20L));
		System.out.println(math.add(10L, 20L, 30L));
		System.out.println(math.add(10, 20, 30, 40));
	}// 자기랑 같은 레벨의 메소드 호출

}

class MyMath {
	long add(long a, long b) {
		// method overloading 된 곳
		// 단, 리턴 타입은 시그니처에 영향 안준다
		return a + b;
	}

	/*
	 * int add(long a, long b) { //순서가 같지만, 리턴 타입이 다르면 오버로딩 조거에 해당 x return a + b; }
	 */
	long add(long a, long b, long c) {
		return a + b + c;
	}

	long add(int a, int b) {
		return a + b;
	}
	// long add(long a, long b)와 long add(int a, int b)에서 뒤의 시그니처인 long a,b와 int
	// a,b에 매개변수가 다르기 때문에 오버로딩이 됨

	long add(int a, int b, int c) {
		return a + b + c;

	}

	long add(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	// 메서드 오버로딩 : 여러 기능을 가진 매개변수의 타입과 순서가 다르지만, 하나의 메서드로 쓸 수 있다.
	// => 여러 메서드를 하나의 메서드로 정의
	// 주의 : 이름은 동일하지만, 개수와 타입, 순서가 달라야 함
	// 메소드 add를 오버로딩을 함
}

class B { // public이라는 범위 지정자가 빠진 class
//public이 없는 클래스는 default라는 범위 지정자가 있음 -> 다른 패키지를 가져다 쓸 수 있음
//이전에는 같은 클래스 안에서는 static 때문에 객체를 안 만들고 이름만 불렀지만, 다른 클래스는 성을 붙어야 함

	// static int sum라면, 메인 메서드에 B.sum을 불러서 리턴값이 온다.

	static int sum() {
		int total = 1 + 2 + 3;
		return total;
	}

}
