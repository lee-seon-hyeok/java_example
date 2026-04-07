package ch08;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random random = new Random();

		for (int i = 0; i < args.length; i++) {

			System.out.println(random.nextInt());
			// 10번 랜덤값을 출력
			System.out.println(random.nextInt(11));
			// 0~10 사이의 수가 랜덤으로 출력한다.

			System.out.println(random.nextInt(1, 11));
			// 0을 제외하고 1부터 포함한 1~10 값을 랜덤으로 출력한다.

		}

	}

}
