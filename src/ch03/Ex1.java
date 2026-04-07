package ch03;

public class Ex1 {

	public static void main(String[] args) {
		// 변수를 활요한 프로그램 재활용
		// System.out.println(3 * 4);
		// 3 * 4의 결과를 3번 출력

		// System.out.println(4 * 5);
		// 고객의 요구사항으로 4 * 5의 결과로 4번 출력

		// 잘 짠 프로그램은 유지 보수가 매우 높고, 재활용이 되는 유용한 프로그램이어야 함
		// 고객의 요구사항에 유연하게 대처하기 위해 변수를 활용한다.

		int x = 5, y = 6;
		int totalAmount = x * y;
		System.out.println(totalAmount);

		// 변수를 통해 속도와 전송이 빠름, 유지보수와 가독성 및 재활용 높아지고 의미 파악 가능

		// 반복문을 활용한 프로그램 재활용

		System.out.println(totalAmount);
		System.out.println(totalAmount);
		System.out.println(totalAmount);

		// 변수처럼 변하지 않은 부분이 있을 경우, 반복하기 쉬움 -> for문 사용

		for (int i = 0; i < 10; i++) { // i<=4, i<5, 0,1,2,3,45,6,7,8,9 // 초기식 조건식
			// 초기식 조건식 증감식
			System.out.println();
		}

		// 5번 출력함

		// 초기식 : 변수를 0으로 선언한 동시에 초기화 하는게 좋음, 이때 2개 이상의 변수도 선언할 수 있다.
		// 조건식 : 간단한 범위를 넣은게 나음
		// 증감식 : 간단한 증감식으로 표현한게 나음
		// 반복문을 통해, 유자보수성과 가독성이 높아짐
		/*
		 * for (;;) { System.out.println(totalAmount); }
		 * 
		 */ // 무한 반복이 생겨서 무한 루프가 발생 -> 무한 반복 빠지지 않게 해야 함

		// 반복문으로 만들기
		// System.out.println("1 helloworld");
		// System.out.println("2 helloworld");
		// System.out.println("3 helloworld");
		// System.out.println("4 helloworld");
		// System.out.println("5 helloworld");
		// 변하는 부분 : 숫자, 변하지 않은 부분 : 문자

		// for (int i = 0; i < 10; i++) { // i= 0,1,2,3,4,5,6,7,8,9,10
		// System.out.println((i + 1) + " helloworld");
		// 변하는 부분 : 변수 ->i=0,1,2,3,4,5,6,7,8,9,10

		// System.out.printf("%2d helloworld", (i + 1)); // %2d -> 2자리 수도 출력하게 함

		// 리팩토링 : 계속된 요구사항으로 계속해서 보완하여 수정함
		// }

		// 함수(매서드)를 활용한 프로그램 재활용
		// 메소드는 연속적으로 출력이 아닌, 조건이 맞을때 출력하게 한다.
		// 1부터 3까지 합을 구하는 프로그램

		// 첫번째
		// System.out.println(1+2+3);
		// 유지보수성과 재활용에 좋지 않음

		// 2번째
		int sum = 0;
		// sum = sum + 1; // 0 +1 =>1
		// sum= sum + 2; // 1 + 2 => 3
		// sum = sum + 3;// 3 + 3 => 6
		// 늘어나는 규칙이 있음 -> for문으로 가능
		for (int j = 0; j < 3; j++) {
			sum += j;
		}
		System.out.println(sum);

		// 4~6까지의 합을 구하는 프로그램
		System.out.println("4+5+6");
		sum = 0;
		// sum +=4; 0 + 4 -> 4
		// sum += 5; -> 4 + 5 -> 9
		// sum +=6; -> 9+6 = 15

		for (int j = 4; j <= 6; j++) {
			sum += j;
		}
		System.out.println(sum);

		// 7~9까지 합을 구하는 프로그램
		sum = 0;
		// sum+=7; 0 + 7 -> 7
		// sum+=8; 7 + 8 -> 15
		// sum+=9 15 + 9 -> 24
		/*
		 * for (int b = 7; b <= 9; b++) { sum += b; } System.out.println(sum);
		 */

		// 1부터 3까지의 합을 구하는 프로그램
		System.out.println(sum(1, 3));

		// 4부터 6까지의 합을 구하는 프로그램
		System.out.println(sum(4, 6));

		// 7부터 9까지 합을 구하는 프로그램
		System.out.println(sum(7, 9));

		// return;
		// void가 있으면, 메서드를 실행해서 return을 안 붙어도 컴파일러가 몰래 return을 붙어 도와줌.
		// 메서드는 무조건 return이 있어야 함.

		// 메서드 : 특정한 값을 달성하기 위한 집합
	} // END OF MAIN METHOD

	public static int sum(int i1, int i2) {
		// int : 반환 타입
		int sum = 0; // main에서 벗어나서 효력 발휘못해서 다시 선언
		// sum+=i1;
		// sum+=i1+1;
		// sum+=i2; +
		for (int b = i1; b <= i2; b++) {
			sum += b;
		}
		return sum;// sum을 함수를 반환, return을 만나야 사라짐
		// 반환 타입이 있으면 무조건 리턴 타입을 써야 한다.
		// 오버플로우 가능성이 있으면 long으로 해야 함 -> 반환하는 값에 맞게 테이블 메소드를 수정해야 함
	}

}// END OF EX1 CLASS
