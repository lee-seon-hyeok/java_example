package ch09;

public class CheckedDemo {

	public static void main(String[] args) {
		// 1.main() throws ~ { : 던져서 메인에게 호출하여 처리하라고 지시

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// 예외가 발생시 문자 출력
			// e.printStackTrace();
			System.out.println("체크드 익셉션이 발생했다.");
		}
		// 2.try catch : 폭탄이 발생하면 예외를 직접 처리한다.

	}
	// InterruptedException이 나와서 예외처리 알려준다.
	// InterruptedException : 인터럽트가 발생한다.

}
