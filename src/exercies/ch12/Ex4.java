package exercies.ch12;

import java.util.List;

public class Ex4 {

	public static void main(String[] args) {

		// 1. 6개의 수도를 포함하는 List 객체 생성
		List<String> capitals = List.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");

		// 2. 스트림 생성 -> 정렬 -> 첫 번째 원소 찾기 -> 출력
		capitals.stream() // 1) 스트림 생성
				.sorted() // 2) 스트림 원소 정렬 (기본: 가나다/사전순)
				.findFirst() // 3) 첫 번째 원소 찾기
				.ifPresent(System.out::println); // 결과 출력
		// ifpresent로 꺼내서 출력
	}

}
