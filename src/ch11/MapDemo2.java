package ch11;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<Fruit, Integer> map = new HashMap<>();
		// HashMap를 만든다.

		map.put(new Fruit("사과"), 5);
		map.put(new Fruit("사과"), 3);

		Fruit f1 = new Fruit("사과");
		Fruit f2 = new Fruit("망고");
		System.out.println(f1.equals(f2));
		map.put(null, 3);
		// 동등성 비교에서 같은 이름을 물어보면 true가 나옴
		// set 컬렉션으로 비교할 경우, hascode를 사용해야만 한다.

		System.out.println(map.size());
		System.out.println(map);

	}

}

class Fruit {
	String name;

	// 생성자
	public Fruit(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	// hashcode가 없으면 중복을 판단하지 못한다.

	// 관련 메서드(hashCode, equals, toString를 구현)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		else if (obj instanceof Fruit fruit) {
			if (this.hashCode() == fruit.hashCode())
				return true;
		}
		return false;
		// 연산에 참여하든, 안하든 hashcode 넣어서 중복이 있는지 확인할 수 있다.
	}

	@Override
	public String toString() {
		return "Fruit[" + name + "]";
	}
}
