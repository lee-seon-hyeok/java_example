package exercies.ch12;

import java.util.List;
import java.util.stream.Stream;

public class Ex1 {

	public static void main(String[] args) {

		List<Integer> scores = List.of(45, 76, 38, 27, 50);
		Stream<Integer> si = scores.stream();
		si.map(n -> n + 10).forEach(System.out::println);
		// 같은 타입 변환이므로 map을 사용한다/

	}

}
