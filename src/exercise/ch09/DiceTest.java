package exercise.ch09;

import java.util.Random;

public class DiceTest {

	public static void main(String[] args) {
		// Dice dice = ; <<- 한번만 참조변수 할당할 때 사용

		System.out.println(new Dice().roll());

	}

}

class Dice {
	public int roll() {
		Random random = new Random();
		// nextInt(6)은 0, 1, 2, 3, 4, 5 중 하나를 반환합니다.
		// 주사위는 1~6이 필요하므로 결과에 1을 더해줍니다.
		return random.nextInt(6) + 1;
	}

	public class DiceTest {
		public static void main(String[] args) {
			System.out.println(new Dice().roll());
		}
	}
}
