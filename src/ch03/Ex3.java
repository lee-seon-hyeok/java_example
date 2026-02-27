package ch03;

public class Ex3 {

	public static void main(String[] args) {
		// 중첩 반복문
		System.out.println("1 , 2, 3");
		System.out.println("2 , 3, 4");
		System.out.println("3 , 4, 5");
		/*
		 * for (int i = 0; i <= 3; i++) { System.out.printf(" %d  %d  %d\n", i, i + 1, i
		 * + 2);
		 * 
		 * }
		 */

		/*
		 * for (int i = 1; i <= 10; i++) { System.out.printf(" 2%d  2%d  2%d\n", i, i +
		 * 1, i + 2, i + 3, i + 4, i + 5, i + 6, i + 7, i + 8, i +9);
		 * 
		 * }
		 */
		// 10줄 출력 -> 단순히 하면 코딩이 너무 길어져 불편함 -> 중첩 반복문 사용

		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.printf(" 2%d", i + j);
				// 10번 출력
			}

			System.out.println();
			// 다음 라인으로 이동
		}

		// while 문으로 변경
		int i = 0;
		while (i < 10) {
			System.out.printf(" 2%d helloworld\n", (i + 1));
			i++;
		}

	}

}
