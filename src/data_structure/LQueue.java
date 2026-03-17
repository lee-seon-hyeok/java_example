package data_structure;

public class LQueue<E> {

	// 필드
	private Node<E> front;
	private int size;
	private Node<E> rear;

	// 생성자
	public LQueue() {
		front = rear = null;
		size = 0;

	}

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

		// 생성자
		public Node(E item, Node<E> next) {
			super();
			this.item = item;
			this.next = next;

		}

	}

	E peek() {

		return front.item;// head의 item을 반환한다.
	}

	void offer(E item) { // rear에 새로운 노드 추가
		Node<E> newNode = new Node<>(item, null);
//	        newNode.item = item;
//	        newNode.next = tail;
		if (size == 0) { // head == tail && head == null
			front = newNode;
		} else {
			rear.next = newNode;
		}
		rear = newNode;
		size++;
	}

	E poll() { // removeFirst()를 호출
		Node<E> removedNode = front; // 노드를 지우기 전에, head에 지워질 노드 E 타입을 백업한다.
		front = front.next; // null 값을 head로 할당시키면서 Head는 removeNide와의 연결이 끊긴다.
		removedNode.next = null; // 백업받은 removedNode는 null로 다음 노드의 연결을 끊는다.
		if (size == 1) {
			front = rear = null;
			// head는 null 상태 }
		}

		size--; // size가 0으로 줄어듬
		return removedNode.item; // 노드가 가지고 있던 item을 반환한다.
	}// linkedlist는 맨 앞에서만 지우므로, removefirst가 필요없다.

	@Override
	public String toString() {
		String list = "[";
		for (Node<E> n = front; n != null; n = n.next) {
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
