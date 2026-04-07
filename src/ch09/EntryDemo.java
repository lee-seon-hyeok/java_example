package ch09;

public class EntryDemo {

	public static void main(String[] args) {
		Entry<String, Integer> e = new Entry<>("김선달", 20);
		// 제네릭은 객체만 넣는데, 이름과 age의 타입을 넣음
		// string, integer만 담는다
		String name = e.getKey();
		int age = e.getValue();
		// 값을 꺼내온다.
		System.out.println(name + ":" + age);

		Entry<String, String> e1 = new Entry<>("김선달", "20");

		Entry<Integer, Integer> e2 = new Entry<>(20, 20);

		Entry e3 = new Entry("a", "b");
		// 아무 오브젝트를 담을 수 있음 Raw 타입
	}

}

class Entry<K, V> {
	// 같은 매개변수를 못씀 -> 다른 재네릭 타입을 써야 함
	private K key;
	private V value;

	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
		// 인스턴스 변수에 할당

	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
	// get 2개 만든다.
}
