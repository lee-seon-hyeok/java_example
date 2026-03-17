package data_structure;

public class SLinkedListDemo {

	public static void main(String[] args) {
		SLinkedList<Integer> list = new SLinkedList<>();
		// LinkedList 생성

		System.out.println(list.size());
		// 기존에는 배열에 데이터를 맨 뒤에 넣었는데, LinkedList는 앞, 뒤에 넣어도 상관하지 않는다.
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		// 먼저 10,20,30을 넣는다.
		System.out.println(list);
		System.out.println(list.size());

		System.out.println(list.get(2)); // 맨 앞에 있는 것을 가져옴

		System.out.println(list.remove() + "가 삭제되었습니다.");

		System.out.println(list);
		// LinkedList는 remove 할 시, 맨 앞에 항목을 지우는 것으로, removeFirst()와 동일한 기능이다.

		System.out.println(list);
		list.remove();

		System.out.println(list);

		System.out.println(list.isEmpty());

	}

}
