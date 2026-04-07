package ch07;

public class AbstractDemo {

	public static void main(String[] args) {

		Circle circle = new Circle();

		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle();
		// shape는 미완성 객체여서 Circle로 만들어야 한다.

		drawShape(circle);

	}

	static void drawShape(Shape shape) {
		System.out.println("도형을 그립니다.");
		// 원과 삼각형이 shape로 형변환하여 하나로 해결한다.

		if (shape instanceof Circle) {
			Circle c = (Circle) shape;
			// 자식으로 되돌리려고 형변환한다.
			c.setRadius(5);
			c.draw();
		}

	}

}

abstract class Shape {// 추상 클래스 -> 미완성으로 객체 못 만든다
	// 추상 메서드
	abstract void draw();

	public void area() {
		System.out.println("도형은 넓이는");
	}

}

class Circle extends Shape { // shape를 상속받은 circle
	// 추상 클래스인 Shape에서 추상 메서드인 draw와 area 상속받았으므로 추상 클래스로 정의해야 함

	// 필드
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("원의 넓이");
	}

	@Override
	void draw() {
		System.out.println("원을 그린다.");

	}

}

class Rectangle extends Shape {
	// 상속받은 shape에 대해 Rectangle에서 반드시 구현(데이터를 채워라)
	@Override
	void draw() {
		System.out.println("사각형을 그립니다.");
		// 자식한테 가서 오버라이딩을 하여 구현하게 가이드라인을 제시한다.

	}

}
