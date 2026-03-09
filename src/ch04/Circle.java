package ch04;

//ch04에 있지만, public이어서 ch001 같은 다른 패키지에서도 가져올 수 있음
public class Circle implements Comparable {
	// 추가 요구사항 : 반지름이 10으로 생성되도록 생성자 추가하라
	// 추가 요구사항2 : 생성하고 싶은 반지름을 매개변수로 전달하면 그 값을 이용하여 반지름을 생성하라
	// 생성자 - 컴파일러가 자동으로 기본 생성자 만듬

	// 명시적 생성자가 없으면 컴파일러가 자동으로 기본 생성자를 만든다.
	// 매개변수 생성자만 있고 기본 생성자 호출하면 에러가 나옴 -> 기본 생성자를 프로그래머가 명시적으로 넣어야 함
	public Circle() {
		radius = 10.0; // 생성자가 초기화 해줌
		// 추가 요구사항2로는 기본 생성자로 만들 수 없음 -> 추가로 생성자 만듬

	}

	public Circle(double radius) { // 시그니처가 다른 같은 이름의 생성자 만들 수 있음 -> 생성자 오버로딩
		if (radius > 0) {
			this.radius = radius;// 시그니처가 다른 같은 이름 생정자로 만든다 <- 오버로딩
		} else {
			this.radius = 10.0;
		}
	}

	// double radius = 10.0; //다른 클래스에 참조, 설정 가능함
	private double radius = 10.0; // private로 캡슐화 되어 은닉화함, 인스턴스 변수
	final double PI = 3.14;
	// 필드

	// private으로 은닉할 경우, 수정 및 참조 설정 하려면 getter와 setter가 필요함
	// 반드시는 아님
	public double getRadius() {
		return radius;// 내가 원하는 radius 값을 반환시켜서 설정 가능함
	}

	public void setRadius(double radious) { // r이라는 변수 받음
		// doublr r = 지역 변수, aoroqustn
		if (radius > 0) {// set에 조건문 넣어서 도중 바뀌는 것을 막아한다.
			this.radius = radius; // 조건을 맞으면 인자로 넘겨받은 r를 변경시키게 함
			// this 없으면 지역변수, 있으면 미리 인스턴스 변수로 지정
		}
	}

//매서드
	double getArea() { // getArea()메서드 반환
		return PI * radius * radius;
		// 넓이를 구하는 공식

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
