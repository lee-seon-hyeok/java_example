package ch07;

public interface MyInterface {
//인터페이스는 상수와 abstract 메서드와 구성이 된다

	// 상수
	// public :누구나 사용 가능
	// static : new처럼 생성자 만들어서 객체를 가져다 쓸 필요 없어서 붙인다.
	// 상수이기 때문에 final를 사용하는데 변수의 이름은 대문자를 쓴다
	// public static final int MAX = 10;
	int MAX = 10;
	int Min = 1; // public static final이 생략 되었다.

	// abstract 매서드
	// public abstract
	void sayHello();

	void sayHi();
	// public abstract 생략 가능

	// 인터페이스에서 표준을 바꾸는 경우
	default void talk() {
	};
	// 새로운 규격이 생겨서 표준 변경 -> 새로운 class 생성

	default void sing() {
	}; // 표준 변경 v2
	// {}구현부를 포함되게 코딩한다. -> 필요한 내용만 오버라이딩 해줌

}

//implements : 인터페이스 상속 받은 후에 인터페이스를 구현한다.
class MyClass implements MyInterface {
	// 자바가 DB에게 꼭 구현하라고 규격을 주는 것처럼 MYINTERFACE를 쓰려면 규격대로 써야한다.

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public void sayHi() {
		System.out.println("Hi");

	}
	// 새 class 생산된 후, 기존의 class는 새로운 표준이 바꿔지면서 에러가 발생한다.
	// 안 바꾸는 게 원칙이지만, 나중에 추가될 수 있어서 default 메소드 사용한다.

}

class YourClass implements MyInterface {

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sayHi() {
		System.out.println("hi");

	}

	@Override
	public void talk() {
		System.out.println("hello");

	}
	// 표준에 맞게 생산한다.
	// 새로운 표준으로 생산된 class는 문제 없지만, 기존 class는 문제가 발생한다.

}
