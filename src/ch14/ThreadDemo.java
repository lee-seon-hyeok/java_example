package ch14;

public class ThreadDemo {

	public static void main(String[] args) {
		// 쓰레드를 호출하는 멀티 쓰레드

		Thread t = new Thread(new MyRunnable());
		long start = System.currentTimeMillis(); // 500씩 10번 찍음
		// 스레드는 생성자 안에 task를 넣음 -> 실행할 task 생성자를 가지고 thread를 만들 수 있다.
		// 기본 생성자가 아닌 0~5까지 출력하는 생성자를 만들어 Main에서 실행시키게 한다.
		// 따라서 2개의 흐름으로 처리한다.

		t.start();// 2.5초 뒤에 쓰레드 실행 -> 2개가 동시에 각각 수행하게 한다.
		// t.run(); -> 메인 쓰레드를 직접 실행하게 명령하여 5초 걸림
		// 멀티스레딩을 하려면 start로 생명주기를 관리하게 만들어 jvm이 실행하게 만든다.
		for (int i = 0; i < 5; i++) {
			System.out.println("hello" + (i + 1));
			try {
				Thread.sleep(500); // 0.5초 실행하는 동안 InterruptedException가 발생
			} catch (InterruptedException e) {
				System.out.println("인터럽트가 발생했습니다.");
			} // 하나의 프로세스 안에 main이라는 쓰레드가 있고 jvm이 t라는 또다른 쓰레드를 만들어 실행시킨다.
				// 안에 있는 run()를 실행하여 1~5초 동안 출력하게 한다.
				// JVM이 동시에 멀티태스킹이 했기 때문에 시작과 끝에서 몇 초동안 실행되는 지 확인한다.
		}

		t.start();
		// 메인이 하는 일, T가 하는 일로 나눠짐
		/*
		 * for (int i = 0; i < 5; i++) { System.out.println("hello" + (i + 1)); try {
		 * Thread.sleep(500); } catch (InterruptedException e) {
		 * System.out.println("인터럽트가 발생했습니다."); } }//하나의 쓰레드로 처리하는데 5초가 걸린다.
		 */
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}

//Runnable로 구현한 나만의 쓰레드
class MyRunnable implements Runnable {// jvm에게 실행하는 명령

	@Override
	public void run() {
		// 실행할 코드
		// 1~5까지 숫자를 0.5에 1번씩 출력

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500); // 0.5초 실행하는 동안 InterruptedException가 발생
			} catch (InterruptedException e) {
				System.out.println("인터럽트가 발생했습니다.");
			} // checkedexception을 발생시킨다.

		}
	}

}