package ch11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		// 언더플로우가 안되려면 isempty 여부 넣는다.
		// if(!q.isEmpty()) {
		q.peek();
		q.poll();
		// }
		// isEmpty 없으면 에러가 나오지 않지만, q.remove, element 사용하면 오류 발생한다.
		q.offer("a");
		q.offer("b");
		q.offer("c");
		System.out.println(q);

	}

}
