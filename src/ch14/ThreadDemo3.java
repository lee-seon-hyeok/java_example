package ch14;

public class ThreadDemo3 {

	public static void main(String[] args) {
		// 람다를 이용한 ruunable로 구현

		Thread t = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				// 쓰레드 이름을 출력 (지정 안 하면 Thread-0, Thread-1 순으로 명명됨)
				System.out.println(Thread.currentThread().getName() + "->" + (i + 1));
				// 메인 이외에 나머지 쓰레드는 이름을 이정하지 않는 한, 순차적으로 붙는다. , 메인에는 쓰레드가 1,2,3,으로 붙는다.
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("인터럽트가 발생했습니다.");
				}

			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "->" + (i + 1));
				// 메인에서 출력된 hello1과 쓰레드에서
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("인터럽트가 발생했습니다.");
				}

			}
		});

		long start = System.currentTimeMillis();
		/*
		 * * [주의!] t.run()을 하면 멀티태스킹이 아니다. 메인 쓰레드가 직접 Runnable의 내용을 실행하므로, t가 다 끝날 때까지
		 * 메인은 대기한다. 반드시 jvm에 .start()로 실행을 맡겨야 별도의 호출 스택(Call Stack)이 생성된다.
		 */

		// t.start();
		// t.run();
		// t2.start(); //jvm에 관리하는 또다른 쓰레드

		// t.run();
		// t2.run();
		// 메인이 직접 runnable 실행 -> 전부다 메인 쓰레드에 올림 -> 반드시 jvm에 start로 맡겨야 함
		// 메인 쓰레드에서 직접할 일
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread() + "->" + "hello" + (i + 1));
			try {
				Thread.sleep(500); // 0.5초 실행하는 동안 InterruptedException가 발생
			} catch (InterruptedException e) {
				System.out.println("인터럽트가 발생했습니다.");
			}
		}

		t.start();
		// 메일이 다 끝나며 호출이 된다.

		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
