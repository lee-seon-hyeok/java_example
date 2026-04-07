package ch02;

public class TypeCastDemo {

	public static void main(String[] args) {
		// 연산에서의 자동 형변환 / <- 정수의 나눗셈(몫이라는 정수 반환)
		int v1 = 10;
		int v2 = 3;
		int resl = v1 / v2;
		System.out.println(resl);
		// 정수끼리의 나눗셈은 정수

		double res2 = 10.0 / 3.0;
		System.out.println(res2);
		// 실수의 나눗셈 -> 소수점까지 포함한 결과

		double res3 = 10.0 / 3;
		// 실주를 정수로 나눈다면 -> 연산 중에 타입이 넒은 방향으로 자동 타입 변환
		// 범위가 더 넒은 쪽으로 자동 형변환이 된다.

		// double res1 = 10/ (double) 3;
		// 10도 double로 취급함 -> 둘 중에 하나가 double 붙어도 자동 형변환이 됨 -> 10.0 / 3.0 => 3.333.......

		// double res1 = 10/3
		// 10/3 결과값인 정수연산을 double로 바꿈 => 3.0

		// double res1 = (double)(7/4);
		// double res1 = 7/4와 비슷함. 예측하지 않은 결과가 나옴.

		// double res11 = (double) 7.4;

	}

}
