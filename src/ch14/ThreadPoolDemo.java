package ch14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		// 람다로 ruunable로 구현
		Thread t = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + 1);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("인터럽트가 발생했습니다.");
				}
			}

		});

		long start = System.currentTimeMillis();
		ExecutorService service = Executors.newFixedThreadPool(10);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		// 쓰고 반납하는 방식으로 사용 -> 2.5초 뒤에 다 끝나게 동시 돌아갈 수 있다.
		// 동시 처리할 수 있는 쓰레드의 시간 -> 3초
		// 이때 쓰레드는 동시에 작업한 수는 제한 X, 무한정은 X
		t.start();
		// t.run();

		for (int i = 0; i < 5; i++) {
			System.out.println("hello" + (i + 1));
			try {
				Thread.sleep(500); // 0.5초 실행하는 동안 InterruptedException가 발생
			} catch (InterruptedException e) {
				System.out.println("인터럽트가 발생했습니다.");
			}
		}

		t.start();
		// 메인이 하는 일, T가 하는 일로 나눠짐

		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
