package ch06;

public class UpcatingDemo {

	public static void main(String[] args) {

		Circle1 circle = new Circle1();
		Triange triangle = new Triange();

		// Circle1[] circles = new Circle1[3]; //배열 만듬
		// circles[0] = new Circle1();

		// Triange [] triangles = new Triange[3];
		// triangles[0] = new Triange(); //0번에 삼각형 담음

		Shape[] shapes = new Shape[3];
		shapes[0] = new Shape();
		shapes[1] = new Circle1();
		shapes[2] = new Triange();

		// upcasting : 부모 타입을 선언하여 상속관계 있을 떄 부모로 자동 형변환 가능하다.

		for (Shape shape : shapes) {
			shape.area();
			// 오버라이딩이 동적이기 때문에, 어떤 결과 나올 지 모름

		}
		// drawShape(circles[0]); //0번에 저장되었는 매개변수 circle을 넘겨서 원을 그림
		// drawShape(triangle[0]);//매개변수

		drawShape(circle); // 0번에 저장되었는 매개변수 circle을 넘겨서 원을 그림
		drawShape(triangle);// 매개변수
	}
	/*
	 * static void drawShape(Circle1 circle) { System.out.println("원을 그립니다."); }
	 * static void drawShape(Triange triangle) { System.out.println("삼각형을 그립니다."); }
	 */
	// 메서드 오버로딩으로 해결함
	// 이떄 사각형, 오각형, 육각형 등등으로 여러 각형을 만들라는 요청이 나옴
	// 업캐스팅으로 문제를 해결한다.

	static void drawShape(Shape shape) {
		System.out.println("도형을 그립니다.");
		// 원과 삼각형이 shape로 형변환하여 하나로 해결한다.
		if (shape instanceof Circle1 c) {
			// 자식으로 되돌리려고 형변환한다.
			c.setRadius(5);
			c.draw();
		} else if (shape instanceof Triange)
		// 삼각형으로 형변환 하면
		{
			Triange t = (Triange) shape;
			t.setBase(5);
			t.setHeight(10);
			// 반드시 앞에 자식 타입 작성
		}

		// get과 set이 shape에서 안 보인다. -> 부모 리모콘로는, 자식의 기능이 안보임
		// 부모한테 받은 공통적으로 갖고 있는 기능은 보이지만, 자식의 기능이 안보임
		// 형변환을 해야 한다.
		// instanceof Circle1 : Circle1으로 작성된 인스턴스인지 물어보고, true면 형변환하여 set으로 반지름을 설정한다.

		// 원의 경우에는 반지름 설정한 후, 원을 그린다.
		// 만약 삼각형일 경우, 밑변과 높이를 설정한 후 삼각형을 그린다.
	}

}

class Shape {
	// 메서드
	public void draw() {
	}

	public void area() {
		System.out.println("도형은 넓이는");
	}
	// 오버라이딩하여 부모 area를 가리고 자식 area가 나타나게 한다.
	// 동적 바이딩이라고 부른다.
}

class Circle1 extends Shape {

	// 필드
	private int radius;
	// 접근자, 설정자, toString
	// 메서드-오버라이드

	@Override
	// 이때 오버라이드를 똑같이 public 등등으로 해야 함
	public void area() {
		System.out.println("원의 넓이");
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}

class Triange extends Shape {
	// 필드
	private int base;
	private int height;

	// 메서드 - 오버라이딩
	@Override
	public void area() {
		System.out.println("사각형의 넓이");
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
