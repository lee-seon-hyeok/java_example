package ch11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set = Set.of("사과", "바나나", "수박", "망고");
		HashSet<String> hash = new HashSet<>(set);

		hash.add("오렌지");
		System.out.println(hash);

		hash.add("오렌지");
		System.out.println(hash);
		// 중복 추가 가능하다.

		System.out.println(hash.contains("사과"));
		// "사과" 있는지 없는지 false, true로 물어본다.

		TreeSet<String> tree = new TreeSet<>(set);

		System.out.println(tree.lower("바나나"));
		System.out.println(tree.lower("바나나"));

		System.out.println(tree.lower("사과"));
		System.out.println(tree.higher("사과"));
		System.out.println(tree.higher("수박"));
		System.out.println(tree.lower("수박"));

		System.out.println(tree.first());
		System.out.println(tree.last());
		// higer : 자신보다 높은 순위에 있는 것을 tree로 반환한다.
		// lower : 자신보다 낮은 순위에 있는 것을 tree로 반환한다.
		// 해시 크기에서 크기가 큰 값, 작은 값을 기반으로 비교한다.

	}

}
