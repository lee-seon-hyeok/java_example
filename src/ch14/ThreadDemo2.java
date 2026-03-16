package ch14;

public class ThreadDemo2 {

	public static void main(String[] args) {
		// 상속을 활용한 쓰레드

		Thread t = new MyThread();
		long start = System.currentTimeMillis(); // 500씩 10번 찍음

		t.start();
		// t.run();
		// 싱글로 실행되는데, 쓰레드 여러개를 만들 때 t.start()로 만든다.
		for (int i = 0; i < 5; i++) {
			System.out.println("hello" + (i + 1));
			try {
				Thread.sleep(500); // 0.5초 실행하는 동안 InterruptedException가 발생
			} catch (InterruptedException e) {
				System.out.println("인터럽트가 발생했습니다.");
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}

class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("인터럽트가 발생했습니다.");
			}
		}
	}

}
