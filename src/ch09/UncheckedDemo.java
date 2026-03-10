package ch09;

public class UncheckedDemo {

	public static void main(String[] args) {
		// 1
		// int[] arr = {1,2,3};
		// System.out.println(arr[4]);
		// 실행하면 Array 배열에 정해놓은 범위를 벗어난다는 예외가 발생
		// main() throws ArrayIndexOutOfBoundsException 개발자가 예외처리하자고 결정하여 예외 처리를 메인에
		// 던진다.

		int n = 3;
		int m = 0;
		String s = null;
		// 2.
		try {
			System.out.println(s.length());
			// exception d가 존재해서 exception으로 이동함

			int res = n / m;
			System.out.println(res);
			// 실행하다가 에러가 발생하면 System.out.println(res); 실행 안하고 점프하여 try로 감
		} catch (ArithmeticException e) {
			// System.out.println(e.getMessage());
			System.out.println("0으로 나눌 수 없습니다.");
			// 사용자가 이해할 수 있는 언어로 출력
		} catch (Exception d) {
			System.out.println("알수 없는 오류 발생");

		} finally {
			System.out.println("프로그램 종료");
		}

		// int res = n/m;
		// 컴파일러는 n과 m이 변하는 값으로, trycatch 쓸 필요 없다고 판단
		// 컴파일러가 체크 안해서 오류가 안뜨다가 run을 하면, 에외처리가 발생함

		try {
			// int res = n/m,
			// System.out.println(res)
			unchecked();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 범어났습니다.");
		}

	}

	public static void unchecked() throws ArrayIndexOutOfBoundsException {
		int[] arr = { 1, 2, 3 };
		System.out.println(arr[4]);
		// main으로 throws 해도, 직접 처리 안하면 예외처리가 여전히 발생한다. -> try catch를 사용

		// System.out.println(arr[3]);
	}

}
