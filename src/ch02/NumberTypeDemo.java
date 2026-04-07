package ch02;

public class NumberTypeDemo {

	public static void main(String[] args) {
		// 소리가 1시간(60 * 60초) 동안 가는 거리
		int mach;
		int distance;
		mach = 340;
		// mach = (int) 340.0f //double 또는 float를 int로 명시적 형변환
		// mach = 340.0 -> 값손실로 에러가 발생 -> (int)340.0으로 명시적 형변홤
		// mach = 340d; -> double로 8byte를 int로 옮기려면 mach = (int)340d로 명시적 형변환을 한다.
		distance = 60 * 60 * mach;
		System.out.printf("소리가 1시간(60 * 60초) 동안 가는 거리는 %d입니다.", distance);
		// 반지름이 10. 0인 원의 넒이
		final double PI = 3.14; // 상수
		double radius = 10.0;
		// double radius = 10; double이 int보다 크기 때문에 int가 double로 자동 형변환

		// int radius = 10; 값은 동일하지만 내부 계산을 더함 -> 타입 변환

		double area = PI * radius * radius;
		System.out.printf("반지름이 10.0인 원의 넒이는 %f 입니다.\n", area);
		// \n : 줄바꿈 // %.2f : 소수점 2번째 자리까지만

		long l = (long) 3.14d; // double를 long으로 명시적 형변환

	}

}
