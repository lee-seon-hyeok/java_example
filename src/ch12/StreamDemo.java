package ch12;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	// 컬렉션으로 처리
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); // 비어있는 리스트 동적 배열
		// 다향성의 성질이 있음

		for (int i = 0; i < 10; i++) {
			list.add(i);
			// list에 10번만큼 반복하여 돌리면서 Array에 데이터 넣는다.
		}

		List<Integer> ge5list = new ArrayList<Integer>();
		// 비어있는 리스트로, 5보다 큰 데이터만 넣는다.
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) >= 5) {
				ge5list.add(list.get(i));
				// 5보다 크거나 같으면 새로운 리스트에 담는다.
			}

		}
		// list에 사이즈만큼 돌리면서 5보다 큰 값만 별도의 for문에 저장한다.

		List<Integer> evenlist = new ArrayList<Integer>();
		// 5보다 큰거나 같은 데이터가 있는 집합에서 짝수만 가져오는 list
		for (int i = 0; i < ge5list.size(); i++) {
			if (ge5list.get(i) >= 5) {
				evenlist.add(list.get(i));
				// 짝수만 evenlist에 넣는다.
			}
		}
		System.out.println(evenlist);
		// 컬렉션을 하면 절차가 복잡함

		// 스트림
		// 1. 스트림 생성
		// 2.순간 연산으로 2개의 필터로 조건을 설정한다.
		// 3. 최종연산을 하여 출력한다.

		// list.stream().filter(i->i>=5).filter(i->i%2==0).forEach(i->
		// System.out.println(i));
		// 중간에 () 필터에 람다가 넣어 내부 반복문을 돌린다. -> list를 돌려서 꺼내서 중간 연산을 하여 오른쪽으로 넘긴다.
		// 중간 연산에 predicate 등등이 들어있지만, 필터에서 맞는 조건으로 설정한다. -> predicate, cosumer
		list.stream().filter(i -> i >= 5).filter(i -> i % 2 == 0).forEach(System.out::println);
		// 메소드 참조로 바뀔수 있다. 안에 로직이 있으면 바꾸지 못한다.
		// 스트림 덕분에 메모리를 사용하지 않았다.

	}
}
