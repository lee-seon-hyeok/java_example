package ch04;

public class BallDemo {

	public static void main(String[] args) {
		Ball ball = new Ball();
		System.out.println(ball.getRadius());
		// 공의 반지름

		System.out.println(ball.getvolume());
		// 공의 부피

		// 공의 반지름을 반으로 줄이고 공의 반지름과 부피 출력
		ball.setRadius(ball.getRadius() / 2);
		System.out.println(ball.getRadius());
		System.out.println(ball.getvolume());
	}

}
