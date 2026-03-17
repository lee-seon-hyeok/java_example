package ch14;

public class CollaboDemo {

	public static void main(String[] args) {
		final Dish dish = new Dish();
		//final로 서로 공유하도록 상수 값을 만든다.
		new Thread(new Customer(dish)).start();
		//dish를 공유하는 소비자에 대한 쓰레드 생성
		new Thread(new Cook(dish)).start();
		//dish를 공유하는 요리사에 대한 쓰레드 생성
		
		//쓰레드 생성하여 변수 할당할 필요 없음

	}

}

class Dish {
	private boolean empty = true;
	// 처음 요리가 비어있음

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

}

class Customer implements Runnable {
	private final Dish dish;

	// final 상수여서 초기화를 시킨다.
	public Customer(Dish dish) {
		super();
		this.dish = dish;
	}

	public void eat() throws InterruptedException {

		synchronized (dish) { // 동기화 블록
			// 먹는 행위
			while(dish.isEmpty()) {//요리가 준비될때까지 기다린다.
			dish.wait();
			// 예외 생기면 떠넘긴다. 다 먹을 떄까지 기다린다.
			}
			dish.setEmpty(true);
			// 음식이 비어있을 경우, true
			System.out.println("음식을 다 먹었습니다");
			dish.notify();
			// 다 먹었으면 신호 보내야 하므로 notify를 준다

		}
	}

	@Override
	public void run() {
		// 동작 행위
		 for (int i = 0; i < 3; i++) { //3번 요리를 한다.
		try {
			eat();
			//break 포인트를 준다.
			Thread.sleep(300);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		 }

	}

}

class Cook implements Runnable {
	private final Dish dish;

	// final은 상수여서 생성자 초기화를 시킨다.
	public Cook(Dish dish) {
		super();
		this.dish = dish;
	}

	public void cook() throws InterruptedException {
		synchronized (dish) { // 동기화 블록
			// 요리를 하는 행위
			while(!dish.isEmpty()){ //다 먹을 때까지 기다린다.
			dish.wait(); // 요리하니까 기다린다.
			}
			dish.setEmpty(false);
			// 음식을 채운다.
			System.out.println("음식이 준비됬씁니다");
			dish.notify();
		}

	}

	@Override
	public void run() { // 생성자
     for (int i = 0; i < 3; i++) { //3번 요리를 한다.

		try {
			cook();
			//break 포인트를 준다.
			Thread.sleep(500);
			// 스레드를 걸어서 500초 걸린다고 시간 지연 시킨다.
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
     }

	}

}
	