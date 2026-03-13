package ch11;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerformanceDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		LinkedList<Integer> li = new LinkedList<>();

		// ArrayList에 10만번 데이터 추가
		// 1) 맨 뒤에 항목 추가
		// 2) 맨 앞에 항목 추가
		long start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			al.add(i); // 맨 뒤에 추가할 경우
			al.add(0, i);// 맨앞에 추가할 경우
		}

		long end = System.nanoTime();
		for (int i = 0; i < 100000; i++) {

			al.remove(0);// 맨앞에 삭제
		}
		System.out.println("ArrayList로 처리한 시간 :" + (end - start));

		// arraylist는 맨 앞에 넣을 경우, 오래 걸린다.
		// arraylist는 맨 앞에서 삭제할 경우 오래 걸린다.

		System.out.println("LinkedList로 처리한 시간 :" + (start - end));

		// LinkedList에 10만번 데이터를 추가
		start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			// al.add(i);
			li.addFirst(i);// 맨앞에 추가할 경우

		}

		end = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			// al.add(i);
			li.remove(0);// 맨앞에 제거할 경우

		}
		// single은 head를 가리켜서 다음을 가리킨다.
		// 자바는 dobulielinked list로 사용하기 때문에 double이어서 head +tail 때문에
		// 메모리는 많이 차지하지만, 맨 뒤에 데이터 추가 시, single보다 빠르다
		// 따라서 맨 앞에 데이터를 넣을 경우, LinkedList가 더 효율적이다.
		// 맨 뒤에서 데이터를 삭제해도, LinkedList가 더 효율적이다.

		// queue는 맨 앞과 뒤를 삭제할 경우, LinkedList가 더 효율적이다.
	}

}
