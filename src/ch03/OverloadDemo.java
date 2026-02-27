package ch03;

import java.util.Scanner;

public class OverloadDemo {
	/*
	 * public static void main(String[] args) { int i1 = 3, i2 = 7, i3 = 10; double
	 * d1 = 7.0, d2 = 3.0; System.out.printf("max(%d, %d) = %d\n", i1, i2, max(i1,
	 * i2)); System.out.printf("max(%.1f, %.1f) = %.1f\n", d1, d2, max(d1, d2));
	 * System.out.printf("max(%d, %d, %d) = %d\n", i1, i2, i3, max(i1, i2, i3)); }
	 * 
	 * public static int max(int n1, int n2) { int result = n1 > n2 ? n1 : n2;
	 * return result;
	 * 
	 * }
	 * 
	 * public static double max(double n1, double n2) { double result = n1 > n2 ? n1
	 * : n2; return result;
	 * 
	 * }
	 * 
	 * public static int max(int n1, int n2, int n3) { return max(max(n1, n2), n3);
	 * 
	 * }
	 */
	public static void main(String[] args) {
		int num = 0;
		int stack = 0;
		int sum = 0;
		Scanner money = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료");
			System.out.println("-------------------------------------");
			System.out.print("선택 : ");
			String a = input.nextLine();
			num = Integer.parseInt(a);
			switch (num) {
			case 1:
				System.out.print("예금액 > ");
				String b = money.nextLine();
				stack = Integer.parseInt(b);
				sum += stack;
				break;
			case 2:
				System.out.print("출금액 > ");
				String b2 = money.nextLine();
				stack = Integer.parseInt(b2);
				sum -= stack;
				break;
			case 3:
				System.out.printf("잔고 조회: %d\n", sum);
				break;

			case 4:
				System.out.println("프로그램을 종료합니다!");
				return;

			}

		}
	}
}
