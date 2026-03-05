package ch06;

public class InheritDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eagle eagle = new Eagle();
		eagle.eat();// 공통된 메서드
		eagle.fly(); // 자식에게 있는 메서드
		Tiger tiger = new Tiger();
		tiger.run(); // 자식에게 있는 메섣,

	}

}

class Animal {
	// 공통된 필드
	String eye;
	String mouth;

	// 공통된 메서드
	void eat() {
		System.out.println("먹다");
	}

	void sleep() {
		System.out.println("잠잔다");
	}
}

class Eagle extends Animal { // extends 상속 받음
	// 자식에게만 있는 필드
	String wing;

	// 자식에게만 있는 메서드
	void fly() {
		System.out.println("날아간다");
	}
	// 자신 곳에서만 수정하면 된다.
	// 부모한테 받은 것이 맘에 안 드면 오버라이딩을 함
}

class Tiger extends Animal {
	// 자식에게만 있는 필드
	String legs;

	// 자식에게만 있는 메서드
	void run() {
		System.out.println("달린다");
	}

}
