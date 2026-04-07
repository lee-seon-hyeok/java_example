package ch11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		String[] fruits = { "포도", "사과", "망고", "바나나" };
		List<String> list = Arrays.asList(fruits);

		Collections.sort(list);
		// 오름차순

		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		// Comparations.reverseOrder()로 List가 뒤집어서 내립차순으로 진행한다.

		Collections.reverse(list);
		// 다시 뒤집는다.

	}

}
