package ch02;

public class OperateDemo {

	public static void main(String[] args) {
		// 오버플로우 발생을 막기 위해 피 연산자 중 하나를 타입 변환
		int i = 1_000_000;
		int j = 2_000_000;

		// int result = i *j;

		long result = i * (long) j;
		// 변수들 중에 한 개를 long으로 바꿔서 자동 형변환하여 결과를 long으로 바꿔서 오버플로우 막는다.

		System.out.println(result);
		// 오버플로우 발생 > 자기보다 범위가 커서 - 숫자로 넘어감

		// 무한대와 NaN 예제

		// int res = 5/0;
		// 틀리거나 문제 생기면 컴파일러
		// 에러실행한 바이드코드를 실행하다가 발생한 에러 -> Exception (예외 발생)

		double res = 5 / 0.0;
		System.out.println(res + 100); // Infinity로 결과 나옴
		System.out.println(Double.isFinite(res));
		// Double. isFinite() : infinity 여부를 확인 -> true면 계산하지 못하게 한다.

		if (Double.isFinite(res)) {
			System.out.println("무한대값을 반환했습니다.");
			// 무한대면 무한대라고 출력
		} else {
			System.out.println(res + 100);
			// 무한대가 아니면 계싼
		}

		// NaN

		double res2 = 5 % 0.0;
		// 모듈러 연산으로 정수가 아닌 실수인 0.0으로 나누면 NaN가 나온다.
		// NaN은 계산이 안됨

		if (Double.isNaN(res2)) {
			// res가 NaN인지 여부를 확인
			System.out.println("숫자가 아닙니다.");
		} else {
			System.out.println(res2 + 100);
		}
	}

	// Static이 있어서 객체를 따로 정의하지 않고 클래스를 메소드 영역에서 올려서 갖고 온다.
	// new로 정의하여 객체를 heap 영역으로 간다 -> static 아님

}
