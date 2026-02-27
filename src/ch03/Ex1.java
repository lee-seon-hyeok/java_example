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

		for (;;) {
			System.out.println(totalAmount);
		}

		// 무한 반복이 생겨서 무한 루프가 발생 -> 무한 반복 빠지지 않게 해야 함

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
	}
	// 함수(매서드)를 활용한 프로그램 재활용
	// 메소드는 연속적으로 출력이 아닌, 조건이 맞을때 출력하게 한다.
	// System.out.println(3 * 4);
	// System.out.println(4 * 5);

}
