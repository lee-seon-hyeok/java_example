package exercise.ch09;

import java.util.Objects;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("111111", "홍길동");
		Person p2 = new Person("111111", "손흥민");
		Person p3 = new Person("123456", "손흥민");
		if (p1.equals(p2))
			System.out.println("같은 사람이다.");
		else
			System.out.println("다른 사람이다.");

		if (p2.equals(p3))
			System.out.println("같은 사람이다.");
		else
			System.out.println("다른 사람이다.");
	}
}

class Person {
	private String id; // 주민번호
	private String name; // 이름

	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}

	// 참고: equals를 재정의할 때는 hashCode도 함께 재정의하는 것이 원칙입니다.
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
		// 모든 필드 연산자가 해시코드로 비교에 참여시키겍 함
		// 동일할 경우 equals로 이동
	}

	@Override
	public boolean equals(Object obj) {
		// 1. 동일한 주소값인지 확인
		if (this == obj)
			return true;

		// 2. obj가 Person 타입인지 확인
		if (obj instanceof Person other) {
			// 3. 주민번호와 이름이 모두 일치하는지 비교
			return this.id.equals(other.id) && this.name.equals(other.name);
		}
		return false;
	}

}
