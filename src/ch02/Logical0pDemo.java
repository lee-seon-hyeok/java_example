package ch02;

public class Logical0pDemo {

	public static void main(String[] args) {
		// 논리연산
		boolean a = true;
		boolean b = true;
		boolean a1 = false;
		boolean b1 = false;

		System.out.println(a && b); // and로 사용 -> true
		System.out.println(a && b1); // false
		System.out.println(a || b1); // or로 사용 -> true
		System.out.println(!a); // a가 아니다 -> false
		System.out.println(a ^ b); // a와 b가 달라야 한다 -> false
		System.out.println();

		// 쇼트서킷
		// by zero 예제 ==> 쇼트 서킷
		int i = 0;
		if (i == 0) {
			System.out.println("0으로 나울 수 없습니다");

		} else {
			System.out.println(5 / i);
		}

		if (5 / i > 0) { // 먼저 나누기 하다가 exception(예외)이 나옴
			// 0이 아닐 경우에만 실행되게 쇼트서킷 만듬
			System.out.println("나눈 값이 0보다 큽니다.");
		}

		if ((i != 0) && (5 / i > 0)) {
			// 앞의 선행조건이 true이면, 5/i > 0 연산을 계산하여 i가 0이 아닐때만 불필요한 연산을 함
			// 앞의 조건이 false이면 불필요한 연산이 안해서 exception 안 나옴
			System.out.println("5를 0으로 나눈 값이 0보다 큽니다.");
		}

		// 조건 연산/삼황 연산으로 계산
		int j = (i != 0) ? 5 / i : 0;
		// i가 0이 아니면, 5/i 계산, i가 0이면 0으로 결과가 나온다.
		System.out.println(j);

		// 연산자 우선순위
		int x = 3, y = 3, z = 3;
		int res = x * y / z % 2;
		// x * y, z%2를 먼저하고 /를 계싼
		System.out.println("res =" + res);
	}

}
