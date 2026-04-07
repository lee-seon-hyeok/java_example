package data_structure;

public class LStack<E> {// 리스트를 부품으로 사용함
//LinkedList와 매우 유사한 스택
	// 필드
	private Node<E> top;
	private int size;

	// 생성자
	public LStack() {
		top = null;
		size = 0;
		// head는 Null로 가리켜야 한다.
	}// SinkedList의 초기화 모습

	public int size() {
		return size;// 0을 반환한다.
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private class Node<E> {
		// private node를 중첩 클래스로 사용
		E item;
		Node<E> next;
		// 다음 node로 가리킨 값을 넣어야 한다. Node의 item에 값을 넣고, Link에는 다음 Node를 가리키는 Next에 넣야 한다.

		// 생성자
		public Node(E item, Node<E> next) {
			super();
			this.item = item;
			this.next = next;
		}

	}

	E peek() { // get과 유사한다.
		// peek은 항상 맨 위에 있는 것을 가져와서 매개변수나 조건문 필요 없음
		return top.item;
	}

	Node<E> getNode(int index) {
		// get node를 들고와서 item에 반환한다.
		Node<E> find = top;

		for (int i = 0; i < index; i++) {
			// 인덱스만큼 이동: 루프를 돌며 다음 노드로 건너띈다.
			find = find.next;
			// 현재 노드의 '다음(next)' 정보를 참조해 이동

		}
		return find;
		// index 번째 노드 객체를 반환
	}

	void push(E item) {
		// 1단계 : 새로운 노드를 생성한 후 node의 값을 설정한다음
		// 새로 생성된 노드가 맨 앞으로 가도록 한다.
		// < === 1) 여기를 구현한다.
		Node<E> newNode = new Node<>(item, top);

		// 2단계 : 현재 데이터가 없는 경우, 즉 빈 리스트인 경우
		// head 와 tail 모두 newNode 가 되도록 처리한다.
		// 리스트에 데이터가 있을 경우에는 head 만 새로 추가된 노드로 변경해준다.
		// < === 2) 여기를 구현한다.
		/*
		 * if (size == 0) { tail = newNode; }
		 */
		top = newNode; // head로 변환

		// 3단계
		// 데이터가 하나 추가되었기 때문에 리스트의 사이즈를 하나 증가시킨다.
		// < === 3) 여기를 구현한다.
		size++;
	}

	E pop() { // removeFirst()와 비슷하게 동작한다.
		Node<E> removedNode = top; // 노드를 지우기 전에, head에 지워질 노드 E 타입을 백업한다.
		top = top.next; // null 값을 head로 할당시키면서 Head는 removeNide와의 연결이 끊긴다.
		removedNode.next = null;
		// 백업받은 removedNode는 null로 다음 노드의 연결을 끊는다.
		/*
		 * if (size == 1) { head = tail = null; // head는 null 상태 }
		 * 
		 * }
		 */size--; // size가 0으로 줄어듬
		return removedNode.item; // 노드가 가지고 있던 item을 반환한다.

	}

	@Override
	public String toString() {
		String list = "[";
		for (Node<E> n = top; n != null; n = n.next) {
			if (n.next != null) {
				list += n.item + ",";
			} else {
				list += n.item;
			}
		}
		;
		return "SLinkedList" + list + "]";
	}

}
