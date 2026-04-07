package exercise.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex6 {

	public static void main(String[] args) {
		Random random = new Random();
		// 로또에서 오름차순으로 정렬하고 6자리를 뽑는다.
		// collections에 sort 써야 하며 중복된 숫자를 안 나오게 set를 넣는다.
		// Size가 6이 나올 떄까지

		Set<Integer> lotto = new HashSet<>();

		while (lotto.size() < 6) {
			lotto.add(random.nextInt(45) + 1);
		}

		List<Integer> list = new ArrayList<>(lotto);
		Collections.sort(list);
		System.out.println("로또 번호 : " + list);

	}
}
