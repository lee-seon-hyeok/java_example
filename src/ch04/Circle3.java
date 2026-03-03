package ch04;

public class Circle3 {
	// 기본 생성자 오버로딩
	public Circle3() {
		color = "red";
		radius = 1.0;
	}

	// 기본 원의 값을 생성자가 초기화시킴
	public Circle3(String color, double radius) {
		// 지역변수를 줌 -> 매개변수 2개

		this.color = color;
		this.radius = radius;
		// 인스턴스 함수에 초기화시킴
	}

	public Circle3(String color) { // 매개변수 1개
		this(color, 1.0);
		// 생성자와 다른 코드를 함께 쓸때, 생성자를 먼저 작성해야 한다, 안 그럼 오류가 나온다.

		// this.color = color;
		// this., this(): 생성자를 부르거나 나 자신
		// radius = 1.0;
	}

	public Circle3(double radius) { // 생성자 오버로딩이 됨
		this("red", radius); // 매개변수가 2개인 생성자를 부르는 것처럼 보인다.
		// this () = this. -> 더 절약할 수 있음
		// this.color = "red";
		// this.radius = radius;
	}

	String color;
	double radius;

	void printInfo() {
		System.out.printf("원의 색깔은 %s, 반지름은 %.1f\n", color, radius);
		// this를 굳이 쓸 필요 없음
	}
}
