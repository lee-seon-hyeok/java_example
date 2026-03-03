package ch04;

public class MathDemo {

	public static void main(String[] args) {
		System.out.println(Math.PI); // method 영역으로 옮겨서 new로 객체 만들 필요가 없음
		// static 변수를 즉시 사용 가능함

		System.out.println(Math.abs(-10));
		// math를 통해 static 함수 abs를 불러서 사용

		// 클래스 객체 생성하지 않고 사용이 가능하며 모든 클래스 객체는 공통된 변수를 공유한다.
	}

}
