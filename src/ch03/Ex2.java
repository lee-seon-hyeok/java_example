package ch03;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		// 사용자로부터 입력한 구구단 출력
		Scanner in = new Scanner(System.in);
		System.out.printf("구구단을 입력하세요 :");
		int input = in.nextInt();

		if (input < 2 || input > 9) {
			System.out.println("구구단을 출력할 수 없습니다.");

		} else {
			for (int i = 0; i < 10; i++) {
				System.out.printf("%d X %d = 2%d\n", input, i, input * i);
			}

		}
	}
}
