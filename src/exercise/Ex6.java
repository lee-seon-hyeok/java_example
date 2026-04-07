package exercise;

public class Ex6 {

	public static void main(String[] args) {
		Car c = new Car("파랑", 200, 1000, 5);
		// 부모 vechicle 만들어지고 나서, Car가 만들어짐
		// heap 영역에서 상속받은 자식이 부모를 바라보고, 부모에는 데이터가 들어가 있음
		c.show();

		Car c1 = new Car("빨강", 180, 900, 4);
		c.show(); // heap영역에 v가 먼저 만들고 나서 c를 만들고
		// heap 영역에서 또 v2를 만들고 c2로 또 만들어져서 서로 다른 영역에 찍힘

		System.out.println();
		Vehicle v = c;
		// 부모 v를 자식이 바라봄
		System.out.println(v.color); // method 영역의 v가 c를 바라봄
		// System.out.println(v.displacement); //자식한테 있는 displacment, gears은 안보임
		// System.out.println(v.gears);
		// 이때 부모는 자식을 가르키지 않아서 부모로는 자식 객체에 있는 데이터들을 참조할 수 없지만,
		// 자식은 자신과 부모 속성을 볼 수 있다.
		v.show();
	}

}

class Vehicle {
	// 필드
	String color;
	int speed;

	// 메서드
	void show() {
		System.out.println("자동차의 색" + color + ",자동차 속도" + speed);
	}

	// 생성자
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

}

class Car extends Vehicle {
	// 필드
	int displacement;
	int gears;

	// 메서드
	// @Override -> 오버라이딩이 숨겨짐
	void show() {
		System.out.println("자동차 배기량" + displacement + ",자동차 기어" + gears);

	}
	// 부모의 show를 가린다.
	// v로 부모가 접근하지 못한 필드를 자식이 show로 부모꺼와 자식꺼 가져다 쓸 수 있고
	// 확인이 가능하다.

	// 생성자
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;

		// Car를 만들 때, 부모도 같이 만들어진다.
		// Car은 부모 객체에 있던 데이터를 가져다 쓴다
	}

}
