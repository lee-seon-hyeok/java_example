package ch11;

public class StackDemo2 {

	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println(result);

	}

	static int factorial(int n) {
		// 종료 조건
		/*
		 * if( n==1) { return 1; }
		 */
		// 종료 조건이 없으면 stackoverflow가 발생한다.
		//
		return n * factorial(n - 1);
		// 자기 자신을 반환
	}

}
