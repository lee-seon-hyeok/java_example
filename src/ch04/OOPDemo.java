package ch04;

public class OOPDemo {

	public static void main(String[] args) {
		// 상속하기 전 -> 상속 전의 코드는 반복이 있음 (변수, 반복문, 메서드, 상속)
		// 상속을 통해 반복을 없앤다.

		// 메인 메서드에 Animal 객체를 만든다. -> animal 인스턴스 만듬
		// Animal animal = new Animal();
		// animal.eat();
		// animal.move();
		// .eat, .move로 호출한다.

		Tiger tiger = new Tiger();// Tiger 객체 생성
		tiger.eat();
		tiger.move();

		Eagle eagle = new Eagle();// Eagle 객체 생성
		eagle.eat();
		eagle.move();

		Fish fish = new Fish();// Tiger 객체 생성
		fish.eat();
		fish.move();
		// tiger, eagle, fish 모두 상속받아 .eat, .move 호출 가능하다.
		// 상속을 받아서 중복을 없앴다.
	}

}// class : 객체를 만드는 상속
//객체 모델링 : 클래스로 현실 세계의 객체를 소프트웨어의 객체로 만듬, 대표적인 특징만 추린다.

/*
 * class Animal { // 동작을 정의 -> 객체 모델링을 한다.
 * 
 * void eat() {// 메서드 생성 System.out.println("동물을 석습니다"); }
 * 
 * void move() { // 메서드 System.out.println("동물을 움직입니다."); } }// 부모가 가진 특징을 모두
 * 가지고 있음 //이떄 메서드 반복으로 길어진 반복문을 줄이기 위해, 상속을 한다. -> before 상속
 */

abstract class Animal { // 미완성 클래스, 가이드라인만 제시하기 때문에 객체 선언하지 않아도 됨
	String name = "";

	void eat() {
		System.out.println(name + "동물을 석습니다");
	}

	// 자식이 오버라이딩이 되어서 추상화 한다.
	// 일반 클래스 안에 추상 메서드를 만들 경우
	abstract void move();// extract : 추상화 시킨 메서드 -> 구체적으로 구현 X
	// move 메서드에 선언만 함
	// 껍데기

	// 부모에서 수정되면, 나머지 자식 클래스에 영향 미치는 것을 알 수 있다.
	// 반복을 없애고 유지보수성과 가독성, 협업성이 높아졌다.

}

class Tiger extends Animal { // extends : 상속 -> Animal에게 상속 받음
	// 부모로부터 상속받아서, 객체를 만드면 eat, move 메서드 사용 가능하다.

	String name = "호랑이";
	// 미완성 설계도(껍데기)에 따라서 오버라이딩으로 구현시킨다.

	// Tiger의 변수 상속은 되지만, 변수는 오버라이딩의 대상이 아니다.

	@Override // 오버라이딩으로 덮어쓴다, 메서드는 오버라이딩의 대상이다.
	void move() {

		// System.out.println(super.name + "는 움직입니다.");
		// 보모 변수는 오버라이딩의 대상이 되지 않는다.
		System.out.println(this.name + "는 달립니다.");
		// this. -> 자식이 가진 변수로 덮어쓴다.
	}// 메서드를 오버라이딩을 할 때 자신만의 변수로 덮어씀
}

//fish, eagle 등등 공통된 동작 메서드을 먼저 없앤다.
class Eagle extends Animal {
	String name = "독수리";

	@Override
	void move() { // 부모가 가진 메서드를 오버라이딩 해서 변수로 덮어씀
		// System.out.println(super.name + "는 움직입니다.");
		// 덮어써서 사라짐
		System.out.println(this.name + "는 달립니다.");

	}
}

class Fish extends Animal {
	String name = "물고기";

	@Override
	void move() {
		System.out.println(this.name + "는 헤어친다.");
		// 부모 메서드를 대체하여 자식 메서드로 덮은 동적인 모습을 보여서 다르게 해석가능하다.
		// -> 다형성
	}

}
