package ch04;

public class Ball {
	Ball ball = new Ball();// 객체 만든다
	private double radius = 10.0;
	final double PI = 3.14;
//공의 반지름를 출력하라 

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		if (r > 0) { // set에서 이상한 값 막아줌
			radius = r;
		}
	}
//공의 반지름을 반으로 줄이고 공의 부피를 출력해야 한다. 

	double getvolume() {
		return PI * radius * radius * radius * (double) 4 / 3;

	}
//공의 부피를 알아내서 출력한다.
//공의 부피 = 반지름 3제곱 x 4분의 3 x 파이
}
