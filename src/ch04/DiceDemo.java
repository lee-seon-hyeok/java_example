package ch04;

public class DiceDemo {

	public static void main(String[] args) {
		Dice dice = new Dice();

		dice.roll(); // 1~6까지 값을 랜덤하게 출력
		// 인스턴스 메서드에 호출시킴

		// Math.random() -> 값을 확인 -> 결과가 더블로 출력 ->소수점 랜덤으로 출력됨
		// 0~1사이 실수값이 반환되므로 1부터 10사이 정수로 반환하게 변경해야 한다.
		// 1를 더하여 10까지 나오게 한다 -> 0 ~ 9 -> 1 ~ 10
		for (int i = 0; i < 6; i++) {
			System.out.println((int) (Math.random() * 10) + 1);
			// 단 > 이 > 상, int인 단항 연산자가 먼저 계산된다 -> 연산자 순서로 ()를 잘 해야함
		}

		// 예) 0, 1만 출력 -> 0.3이면 0, 0.7이면 1 -> 반올림 -> 2를 곱해야 함
		// 0,1,2만 출력 -> 3를 곱해야 함
		// 0~5만 출력 -> 6를 곱해야 함 -> 0~5값이 나오니까 1를 더한다 -> 1~6

	}

}

class Dice {
	void roll() {// 인스턴스 메서드 호출
		System.out.println((int) (Math.random() * 6) + 1);
	}
}