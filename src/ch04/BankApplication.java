package ch04;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 동작이 메소드로 들어있음
		Scanner in = new Scanner(System.in);
		String menu = "";// 밖에서 변수 선언
		String template = """
					-----------------------------------------------
					1.계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료
					------------------------------------------------
					선택 >
				"""; // """위치에 따라서 들여쓰기 위치가 달라짐
		int money;
		while (true) {
			System.out.println(template);// 밖에서 선언하여 메모리 낭비 줄임
			menu = in.nextLine();
			if (menu.equals("5"))
				break; // 버튼 5번 누르면 빠져나옴
			switch (menu) {
			case "1" -> createAccount();// 함수로 리펙토링을 한다
			case "2" -> accoutInquiry();
			case "3" -> depositProcess();
			case "4" -> System.out.println("출금 처리중...");
			default -> System.out.println("메뉴 확인바랍니다."); // 기본 사항
			}
		}
		System.out.println("프로그램 종료");
	}

	static void createAccount() { // static 메서드는 static만 호출 -> 메인에서 호출하려면 static이 필요
		System.out.println("계좌 생성 처리중...");
	}

	static void accoutInquiry() {
		System.out.println("계좌 목록 조회 처리중...");
	}

	static void depositProcess() {
		System.out.println("예금 처리중...");
	}

	class Account {
		// 생성자
		// 필요한 정보들만 모델링하게 한다
		// 밖에서 써야하기 때문에 public 사용

		public Account(String accountNo, String accountOwner, int balance) {
			// super(); 부모이기 떄문에 필요없음
			this.accountNo = accountNo;
			this.accountOwner = accountOwner;
			this.balance = balance;
		}
		// ctrl + 스페이스 + shift로 generate 선택해서 생성자 자동 만든다.

		// 필드
		// accountNo은 한번 만드면 바뀌는 일이 없으므로 accountset를 지운다.
		private String accountNo;
		private String accountOwner;
		private int balance;// 잔액 제한을 넣는다.
		// 클래스의 특징인 캡슐화시켜서 private로 설정

		// generate getter and setter를 자동으로 만들 수 잇다
		// 접근자, 설정자
		// 한번 만드면 바뀌는 일이 없으므로 balanceset, accountset,accountownerset를 지운다.
		// 접근자 (모든 변수에 대해 열어 높음), 설정자(비즈니스 로직에 맞게 조직)
		public String getAccountNo() {
			return accountNo;
		}

		public String getAccountOwner() {
			return accountOwner;
		}

		public int getBalance() {
			return balance;
		}

		// 메서드(입금, 출금, 조회)
		public void deposit(int money) {
			long total = balance + money;
			// 임금 한도를 설정한다. -> 오버플로우로 음수가 나올 수 있기 때문에 (리팩토링)조정한다.
			// long으로 설정
			if (total <= 2_000_000_000) {
				// int : 최대 20억 설정
				balance = balance + money;
			}

		}

		public void withdraw(int money) {
			if (balance >= money) {
				balance = balance - money;
			}
		} // 큰 돈이 들어오면 아무 일을 안한다.
			// 잔액에 대해 설정한다.

		public int inquiry() {
			return balance;

		} // 화면에 조회하므로, 잔액 정보를 넘김 -> int로 설정

		// 리턴 타입과 매개변수를 조정한다.
	}

}
