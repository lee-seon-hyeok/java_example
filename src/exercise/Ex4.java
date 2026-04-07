package exercise;

public class Ex4 {

	public static void main(String[] args) {
		// 메서드는 자식이 오버라이딩 가능, 필드는 자식이 오버라이딩 불가능
		Parent p = new Child();
		System.out.println(p.name);
		// p : 영조
		// child 갖고 있는 값은 오버라이딩 대상이 아니어서 부모가 갖고 있는 값이 출력된다.
		p.print();

	}

}

class Parent {
	// 필드
	String name = "영조";

	// 메서드
	void print() {
		System.out.println(name + "입니다.");
		// 부모의 메서드를 가리고 자식의 메서드를 나타내느데,
	}

}

class Child extends Parent {
	// 필드
	String name = "사도세자";
	// 이 값이 오버라이딩이 되지 않는다.

	// 메서드
	@Override
	void print() {
		System.out.println(name + "입니다.");
	}
}
