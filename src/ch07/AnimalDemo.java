package ch07;

public class AnimalDemo {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Animal animal = cat;
		Animal animal2 = dog;

		makeSound(dog);
		makeSound(cat);
		// 자식 타입을 부모 타입으로 형변환하여, 로그 대신에 animal2 넘김

	}

	public static void makeSound(Animal animal) {
		animal.sound();
		// 동물의 수 만큼 오버로딩 할 필요 없음

		// animal이라는 인터페이스를 가리켜서 자신에 대한 사운드를 호출할 수 있다.
		// interface가 있어서 자식이랑 부모랑 같은 메소드이기 때문에 다운 캐스팅 거의할 필요 없다.

		if (animal instanceof Dog dog) {// 인스턴스를 할당하고
			dog.산책();
			// 인터페이스를 활용한 산속
			// 인터페이스는 부모 객체로 자식 객체를 가릴 킬 수 있어 자동 형변환되어 공통된 메소드를 부를 수 잇따
		}
	}

}

//문서화 규격
interface Animal {
	/**
	 * @param : none
	 * @return :void 소리를 내는 동물의 경우에 활용하는 interace
	 */
	void sound();

}

class Dog implements Animal {
//아무것도 리턴한지 않고 파라미터 x
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	public void 산책() {
		System.out.println("산책을 간다.");// 자식을 호출하려고 할때
	}
}

class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("야웅");

	}

	public void 산택() {
		System.out.println("산책을 간다.");// 자식을 호출하려고 할때
	}

}

//수 많은 동물들을 오버라이딩 하지 않아도, 인터페이스 다향성으로 자식을 참조하여 업캐스팅이 발생한다.  