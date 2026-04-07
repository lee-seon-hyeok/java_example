package ch03;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		// 사용자로부터 입력을 계속 받아 프로그램 실행한다.
		// 사용자가 -1 입력하면 프로그램 종료 -> while 문 사용
		Scanner in = new Scanner(System.in);
		// int number 0 <<- 외부에서 실행
		/*
		 * while (true) {// <- 무한 루프 System.out.println("숫자를 입력하세요. 종료하면 -1 입력 : "); int
		 * number = in.nextInt();// 내부에서 실행 -> 메모리 낭비 if (number == -1) break; // -1를
		 * 입력하면 빠져나와서 프로그램 종료 // 특정 조건에 맞지 않으면 빠져 나옴 System.out.println("계속 실행합니다."); }
		 * System.out.println("프로그램을 종료합니다!");
		 */
		/*
		 * // while 문 응용 // 구구단에 대해 여러 번 입력받아서, 입력받은 단을 출력한다. -1를 입력하면 출력을 멈춘다 int dan =
		 * 0; while (true) { System.out.println("구구단을 몇 단 출력할까요?"); dan =
		 * in.nextInt();// 변수 선언은 밖에 했으므로 할당은 안에서 함 if (dan == -1) break; if (dan < 2 ||
		 * dan > 9) { System.out.println("구구단을 출력할 수 없습니다.");
		 * 
		 * } else { for (int i = 0; i < 10; i++) { System.out.printf("%d X %d = 2%d\n",
		 * dan, i, dan * i); }
		 * 
		 * }
		 * 
		 * } System.out.println("프로그램을 종료합니다!");
		 */
		// do while 문
		int dan = 0;
		do {
			System.out.println("구구단을 몇 단 출력할까요?");
			dan = in.nextInt();
			if (dan == -1)
				break;// 종료 조건
			if (dan < 2 || dan > 9) {
				System.out.println("구구단을 출력할 수 없습니다.");

			} else {
				for (int i = 0; i < 10; i++) {
					System.out.printf("%d X %d = 2%d\n", dan, i, dan * i);
				}

			}

		} while (dan != -1); // dan이 -1이 아니면 빠져나온다.

		System.out.println("프로그램을 종료합니다!");
		/*
		 * int i = 0;
		 * 
		 * do { System.out.printf("%2d helloworld\n", (i + 1)); i++; } while (i < 10);
		 * 
		 */
	}

}
