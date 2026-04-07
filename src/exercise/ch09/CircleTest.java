package exercise.ch09;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(3);
		if (c1.equals(c2))
			System.out.println("c1과 c2는 같다.");
		else
			System.out.println("c1과 c2는 다르다.");
	}

}

class Circle {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {
		// 1. 자기 자신과 비교하는지 확인
		if (this == obj)
			return true;

		// 2. 비교 대상이 Circle 객체인지 확인
		if (obj instanceof Circle other) {
			// 3. 반지름(radius) 값이 같은지 비교
			return this.radius == other.radius;
		}
		return false;
	}
}
