package ch04;

public class CircleDemo {
//Circle를 불러올 수 있음 

	public static void main(String[] args) {

		// Circle circle = new Circle();
		// circle -> 참조 변수 : circle로 주소을 지정 = Heap 영역에 가리킨 Circle() 객체 선언

		Circle circle2 = new Circle();
		System.out.println("원의 반지름은" + circle2.getRadius());

		// System.out.println("원의 넓이는 " + circle.getArea() + "입니다.");
		// Circle 데이터를(넓이, 반지름 구함)를 가져옴

		// System.out.println("원의 반지름은" + circle.getRadius() + "입니다.");
		// circle.setRadius(5.0); // set -> 값을 변경함
		// get -> 값을 가져옴

		// circle.radius = 5; // 참조 변수를 수정가능함
		// private를 하면 숨겨져 값을 바꿀 수 없고 참조도 안된다. -> 오류 발생
		// -> 값을 가져와서 변경하는 getter과 setter를 사용해야 한다.
		// getter와 setter로 안전하게 만들어야 한다.

		// circle.radius = -10; //정의에 벗어난 접근을 막기 위해 은닉 시켜 캡슐화 하는 것이다.
		// 원의 반지름은 양수만 가능함

		// System.out.println("원의 넓이는 " + circle.getArea() + "입니다.");
		// System.out.println("원의 반지름은" + circle.radius + "입니다.");
		// 캡슐화 안되서 값 변경 가능, 캡슐화로 값을 고정하려면 private 사용
	}

}
