package ch02;

public class Hello2 {

	// 변수 : 계속 값이 변하는 것을 저장하는 공간

	public static void main(String[] args) {
		// 프로그램 요구사항 3 + 5를 화면에 출력
		// int v1 = 3; // 변수 = 값
		// int v2 = 5;
		// long v1 = 3000000000L;
		// long v2 = 5000000000L;

		// 요구사항 = 3.15 더하기 5.4의 결과를 화면에 출력하는 프로그램 적어라
		// float v3 = 3.2f;
		// float v4 =5.4f;
		// float sum = v3 + v4;

		double v5 = 3.14;
		double v6 = 5.4;
		double sum2 = v5 + v6;
		// 정확한 연산을 하기 위해 double를 하면 된다. -> 오차를 줄임
		System.out.printf("sum = %16f", sum2);// 소숫점 16자리로 나타남
		// printf : %d, %s 등의 형식 지원자를 쓸 수 있게함 개행문자 포함X
		// println : 줄바꿈하고 출력 가능. 형식 지원자 쓰지 못함

		// System.out.println(v1 + v2);
		// 변수에 값을 할당
		// 기본형 : 8개로 실제 값 저장
		// 참조형 : 기본 제이한 메모리 주소 저장
		// 예 : 4 byte = 4기가 메모리를 다둘 수 있음

	}

}
