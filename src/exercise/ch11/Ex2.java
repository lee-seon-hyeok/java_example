package exercise.ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();

		set.add(new Person("김열공", 20));
		set.add(new Person("최고봉", 35));
		set.add(new Person("우등생", 56));
		set.add(new Person("나자바", 16));
		set.add(new Person("나자바", 35));
		set.add(new Person("나자바", 30));

		Iterator<Person> list = set.iterator();
		while (list.hasNext()) {
			System.out.println(list.next());
		}

	}

}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 같은 객체 참조인지 확인
			return true;
		else if (obj instanceof Person person) {
			// obj가 person 타입이라면 hashcode 값을 비교한다.
			return this.hashCode() == person.hashCode();
		}
		return false;
	}

	@Override
	public String toString() {
		return "person[" + name + " : " + age + "]";
	}
}
