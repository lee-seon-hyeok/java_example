package ch02;

public class ConditionoDemo {

	public static void main(String[] args) {
		// 조건문 - if, switch
		int i = 0;
		if (i == 0) { // 조건식이 true이면 {} 실행문을 실행함
			// 조건식은 비교연산자 + 조건연산자로 결합
			// 실행문
			System.out.println("hello world");
			// 실행문
			int j = 0;
			if (j == 0)
				System.out.println("hello world");
			// 블럭이 없지만, 실행문 한문장으로 작성 가능함

			int k = 0;
			if (k == 0)
				;// k값에 대한 실행문이 없이 if문이 끝 -> 빈 실행문
			System.out.println("hello world");
			// println에 있던 내용을 조건 없이 실행

			// 블록을 생략하면, 실행문이 단독으로 실행된 건지 혼란스러울 수 있고, 두 줄이상 작업할 수 있어서 블록을 써야함

		}

		// 3 < a < 5가 실행되는 조건문
		int a = 4;
		// 3<a<5로 하면 에러 나옴 <- 나눠야 함
		if (3 < a && a < 5) { // 모두 조건에 맞아야 한다.
			System.out.println("a는 3보다 크고 5보다 작습니다.");
		}

		// x가 0보다 작거나 100보다 크면 실행되는 조건문
		int x = -1;
		if (x < 0 || x > 100) { // 둘 중 하나가 true이면, 그 한개만 true 조건이 된다
			System.out.println("x가 0보다 작거나 100보다 큽니다.");
		}

		// 짝수인지 홀수인지 출력하는 조건문
		int res = 3 % 2;
		if (res == 0) {
			System.out.println("짝수입니다.");
		}
		if (res == 1) {
			System.out.println("홀수입니다.");
		}

		// if~else문
		if (res == 0) {
			System.out.println("짝수입니다.");
		} else { // 비교 연산을 한번 줄임
			System.out.println("홀수입니다.");
		}

		// 삼황(조건) 연산자
		String result = (res == 0) ? "짝수입니다" : "홀수입니다";
		System.out.println(result);
		// true이면 '짝수입니다'를 출력, false이면 '홀수입니다'를 출력한다.

	}

}
