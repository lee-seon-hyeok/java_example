package ch04;

public class ATMDemo {

	public static void main(String[] args) {
		ATM atm = new ATM();
		// 생성자 호출 -> heap 영역에 올라감

		System.out.println(atm.location);
		System.out.println(atm.managedBy);
		// 지역 변수는 기본값이 없으면 반드시 null로 초기화
	}

}
