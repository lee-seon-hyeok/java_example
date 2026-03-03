package ch03;

import java.util.Scanner;

public class BankAccountEx {

	public static void main(String[] args) {
		// 요구사항 : 예금 출금 조회 종료 제공한 코드를 작성하라
		// 기술 요구사항 while 문, Scanner의 nextline()메서드 이용

		Scanner in = new Scanner(System.in);
		String menu = ""; // 비어있는 값으로 초기화
		int money = 0;

		while (true) {
			System.out.println("-------------------------");
			System.out.println("1.예금");
			System.out.println("-------------------------");
			menu = in.nextLine();
			// 문저열은 equals로 사용하여 값이 같은 지 여부를 따진다.
			if (menu.equals("1")) {
				System.out.println("입금처리");
			} else if (menu.equals("2")) {
				System.out.println("출금처리");
			} else if (menu.equals("3")) {
				System.out.println("조회처리");
			} else if (menu.equals("4")) {
				break;
			} else {
				System.out.println("메뉴 번호 확인 후 다시 입력");
			} // 특정 조건 만족하면 빠져 나옴

		}
		System.out.println("프로그램 종료");

	}

}
