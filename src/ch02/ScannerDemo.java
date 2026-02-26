package ch02;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Scanner in = new Scanner(System.in);
		// Scanner에 입력받을 변수
		// new : Heap 영역에 입력받을 데이터
		// Sysytem에서 in이라는 변수로, 객체를 입력받을 Scanner를 Heap 영역에 만들어 주소를 할당

		// System.out.print("(정수) 숫자를 하나 입력하시오 : ");
		// int input = in.nextInt();
		// 입력할 때,Scanner에 있는 nextInt를 호출하여 입력된 결과가 int로 반환
		// 예 : 5를 입력하여 변수 i에 반환

		// System.out.printf("당신이 입력한 숫자는 %d입니다. ", input);
		// 5로 입력하면, 입력값을 반환하여 5로 출력

		// 문자열을 입력받아서 숫자로 변환 후에 출력
		// System.out.printf("(정수)숫자 입력하시오: ");
		// String input = in.nextLine();
		// 입력할 때,Scanner에 있는 nextLine을 호출하여 문자열로 입력
		// nextLine : 결과가 String(문자열 리터널)로 받아줌
		// int intInput = Integer.parseInt(input);
		// int num = niteger.parselint(input) : integer에 있는 parseInt로 문자열을 숫자로 변환
		// System.out.printf("당신이 입력한 숫자는 %d입니다. ", intInput);

		// 두 개의 점수를 입력 받아서 연산 결과를 출력한다.
		System.out.print("(정수)첫 번째 숫자를 입력하세요 :");
		int x = in.nextInt();

		System.out.print("(정수)두 번째 숫자를 입력하세요 :");
		int y = in.nextInt();

		System.out.printf("%d와 %d를 곱한 결과를 %d입니다", x, y, x * y);
	}

}
