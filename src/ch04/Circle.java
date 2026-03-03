package ch04;

//ch04에 있지만, public이어서 ch001 같은 다른 패키지에서도 가져올 수 있음
public class Circle {

	// double radius = 10.0; //다른 클래스에 참조, 설정 가능함
	private double radius = 10.0; // private로 캡슐화 되어 은닉화함
	final double PI = 3.14;
	// 필드

	// private으로 은닉할 경우, 수정 및 참조 설정 하려면 getter와 setter가 필요함
	// 반드시는 아님
	public double getRadius() {
		return radius;// 내가 원하는 radius 값을 반환시켜서 설정 가능함
	}

	public void setRadius(double r) { // r이라는 변수 받음
		if (r > 0) {// set에 조건문 넣어서 도중 바뀌는 것을 막아한다.
			radius = r; // 조건을 맞으면 인자로 넘겨받은 r를 변경시키게 함
		}
	}

	double getArea() { // getArea()메서드 반환
		return PI * radius * radius;
		// 넓이를 구하는 공식

	}
// 매서드
}
