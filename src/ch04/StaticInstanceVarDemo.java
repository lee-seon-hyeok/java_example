package ch04;

public class StaticInstanceVarDemo {

	public static void main(String[] args) {
		Circle2 c2 = new Circle2();
		Circle2.printStaticInfo();
		Circle2.numOfCircle = 1;
		Circle2.printStaticInfo();

		c2.radius = 1.0;
		c2.printInfo();

		Circle2 c3 = new Circle2();

		Circle2 c4 = new Circle2();

		Circle2 c5 = new Circle2();
		System.out.printf("%d %d %d %d", c2.numOfCircle, c3.numOfCircle, c4.numOfCircle);
		// 서로 다른 영역에 저장되어 공유가 , 메서드 4개의 객체가 다같이 공유한다
		// 모든 클래스의 객체는 공통된 변수를 공유한다.
		// nof는 new를 만날때마다 증가함

	}

}

class Circle2 {

	// 필드 = 변수
	// 클레스 변수
	static int numOfCircle;
	// method 영역에 올라갈 때 0으로 초기화

	// 인스턴스 변수
	double radius;
	// 객체가 생성될 때, 변수가 생성되며 0.0으로 초기화

	// 메서드 = 함수
	// 클래스 메서드
	// Class Loader에 의해 메모리에 오라감
	static void printStaticInfo() {
		// static이 붙은 애들만 쓸 수 있음

		System.out.println("생성된 원의 개수" + numOfCircle);
	}

	// 인스턴스 메서드 : 객체가 생성할 때 메모리에 올라감
	void printInfo() {// Static 안 붙은 변수만 쓸 수 있음
		// Static 안붙은 애들만 쓸 수 있음
		System.out.println("원의 반지름" + radius);
	}
}
