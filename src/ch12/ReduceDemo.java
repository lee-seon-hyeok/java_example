package ch12;

import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(3, 4, 5, 1, 2);
		// Option reduce
		Optional<Integer> sum1 = numbers.stream().reduce((i1, i2) -> Integer.sum(i1, i2));
		// i의 원소를 순서대로 흘리면서 조합하여 1개의 값으로 축약한다. 그다음 get으로 가져온다,
		System.out.println(sum1.get());
		// Optional<Integer> sum1 = numbers.stream().reduce(Integer::sum);
		// 줄여서 static 메서드 참조로 바꿀 수 있다.

		// T reduce
		int sum2 = numbers.stream().reduce(0, (i1, i2) -> i1 + i2);
		// 초기값을 꺼내서 합친다. = Optional reduce와 비슷함
		System.out.println(sum2);
	}

}
