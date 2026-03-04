package exercise;

public class Circle {
//Circle instance 만들때마다 크기 100인 circle 1개 생성된다. 
//변수 초기할 때마다 생성자를 사용해야 하므로, 인스턴스 변수 사용해야 함

	public Circle(String color, double radius) {
		this.color = color; // 인스턴스 변수 = 매개변수
		this.radius = radius;
		numCircle++;
		numberOfCircles++;
		// 이떄 숫자를 세는 방식이면 인스턴스 변수보다는 static 변수를 사용해야 한다.
	}
//생성자

	String color;
	double radius;
	static int numberOfCircles; // 메서드 영역으로 올라갈 때 초기화
	int numCircle; // 인스턴스 변수 -> 객체가 만들어질 때마다 0으로 초기화
//필드

	void printInfo() {// 일반 메서드는 void와 static 둘다 참조
		System.out.printf("%s, 크기가 %.1f인 공이 %d개(%d) 생성되었습니다.\n", color, radius, numberOfCircles, numCircle);
	}

	void instanceMethod() {
		// 자기끼리 호출가능함
		this.printInfo();
		printInfo(); // 인스턴스 메서드
		staticMethod();
		staticMethod2();
		// heap영역에서 메서드를 참조할 수 있기 때문에 인스턴스 메서드는 method를 참조하여 static 메서드 참조 가능하다.

		// 인스턴스 변수 부를 수 있음
	}

	static void staticMethod() {
		staticMethod2();
		// static끼리만 가능함

		// nstanceMethod();//메서드 영역에 있는 끼리만 호출하기 때문에 heap 영역에 있는 애를 호출하지 못한다.
		numberOfCircles++;
		// numCircle+;
		// this가 생략되었고, heap 영역만 this를 사용가능하기 때문에 static 변수만 호출되고 인스터스 변수는 호출 못한다.
	}

	static void staticMethod2() {

	}

//메서드

}
