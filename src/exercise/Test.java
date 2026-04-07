package exercise;

public class Test {

	public static void main(String[] args) {

		// Animal a = new Animal(); // 미완성이 이어서 불가능
		Animal d = new Dog(); // 다형성으로 가능
		d.sound();

	}

}

// 1. 설계-> 추상 클래스
abstract class Animal {
	abstract void sound(); // 미완성 메서드 (가이드라인)
}

// 2. 자식 클래스
class Dog extends Animal {
	void sound() {
		System.out.println("멍멍"); // "멍멍" 출력
	}
}
