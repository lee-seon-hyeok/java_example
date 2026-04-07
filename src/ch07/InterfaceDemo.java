package ch07;

public class InterfaceDemo {

	public static void main(String[] args) {
		MyClass m = new MyClass();
		// 생성자가 생략해서 규격에 맞춰 사용가능

		m.sayHello();
		m.sayHi();

		// YourClass y = new YourClass();
		// yourclass를 만족시키기 위해 표준을 바꾼다.

	}

}
