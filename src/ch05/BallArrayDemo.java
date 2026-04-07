package ch05;

public class BallArrayDemo {

	public static void main(String[] args) {
		// 공을 원소로 가진 balls 배열 선언
		Ball[] balls = new Ball[5];
		balls[0] = new Ball(5);
		balls[1] = new Ball(10);

		// 모든 변수들 꺼내서 Ball에 넣는다
		for (Ball ball : balls) {
			// ball.info -> 직접 메서드를 통해 꺼내서 호출하면 null 때문에 예외 처리 오류가 나온다.
			// 해결하기 위해 toString 사용, 모든 객체의 조상은 Object
			// object의 tostring에 getclass.getname @ ~가 있어서 tostring은 이런 형식으로 주소가 출력되었음

			System.out.println(ball);
			// 값이 아닌 주소만 출력됨
			// 오버라이딩이 된 tostring이 출력된다.
			// 객체 안에 들어있는 null 포함된 tostring 정보를 출력할 수 있다.
		}

	}

}

class Ball {
	// 변수
	int radius;

	// 생성자
	public Ball(int radius) {
		this.radius = radius;
	}

	// 메서드
	public void info() {
		System.out.println("크기가" + radius + "인 공입니다.");
	}

	@Override
	public String toString() {
		return String.format("Ball [radius = %d]", radius);
		// 그러나 object 방식을 말고, 부모가 물려받은 toString(ch05.Ball@4e50df2e)를 자신 입맛대로 변경하려고 오버라이딩
		// 한다.
		// String에 format 형식에 맞춰서 출력하게 부탁함
	}

}
