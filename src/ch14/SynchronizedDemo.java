package ch14;

import java.util.Random;

public class SynchronizedDemo {

	public static void main(String[] args) {
		SharedCar car = new SharedCar();
		Thread t1 = new CarThread("A", car, "서울");
		Thread t2 = new CarThread("B", car, "울산");
		Thread t3 = new CarThread("C", car, "대전");
		t1.start();
		t2.start();
		t3.start(); // t1,t2,t3 시작
	}

}

class SharedCar {
	public synchronized void drive(String driver, String where) {
		System.out.println(driver + "가 자동차에 탔습니다.");
		Random r = new Random();
		for (int i = 0; i < r.nextInt(1, 4); i++) {
			// 1~3이 랜덤으로 나오게 함
			System.out.println(driver + "가 자동차에 운전합니다.");

		}
		System.out.println(driver + "가" + where + "에 도착했습니다.");
		// 1.이떄 데이터들이 동시에 접근하는 동시성 문제를 해결하기 위해 동기화 블록 이용한다.
		// 메서드에 synchronized로 lock을 걸다가 실행하고 난 뒤에 unlock를 한다.
	}
}

class CarThread extends Thread {
	private String driver;
	private SharedCar car;
	private String where;

	public CarThread(String driver, SharedCar car, String where) {
		super();
		this.driver = driver;
		this.car = car;
		this.where = where;
	}
	// Carthread를 SharedCar가 공유하게 만든다.

	@Override
	public void run() {
		// thread를 실행할 run 메서드 오버라이딩이 필요하다.
		car.drive(driver, where);
	}

}