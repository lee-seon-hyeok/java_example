package ch11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("사과", 3, "바나나", 5, "딸기", 1);
		// key를 몇개를 저장할 지 Map을 지정한다. 이때 key-value 형태로 쌍으로 넣어야 한다.
		// key 값으로 get을 해서 map에서 value를 반환한다.
		System.out.println(map.get("사과"));
		// map에서 사과를 가져온다.
		// 이때 map은 불변 객체여서 set은 안된다.
		System.out.println(map.size());
		System.out.println(map.containsKey("망고"));
		// 망고가 있는 지, true와 false 물어본다.

		HashMap<String, Integer> hash = new HashMap<>(map);
		// HashMap에 Map을 추가한다.

		hash.put("망고", 10);
		// 항목이 없을 경우 : 키에 새로운 항목을 추가한다.
		// 키의 값인 망고에 10을 넣는다
		System.out.println(hash);
		// 해시코드 캆을 출력한다.

		hash.put("망고", 4);
		// 항목이 있는 경우 : 키에 새로운 항목으로 수정한다.
		System.out.println(hash);
		// put이 value만 바꿔치게 한다.

		hash.remove("망고");
		// 키가 망고인 항목을 지운다.

		hash.forEach((k, v) -> System.out.println(k + "i" + v));
		// 안에 았는 것을 다 가져온다 BiConsumer이기 때문에 매개변수 2개를 가져온다.
		// myfunction으로 구현 가능하다.

		Set<String> keySet = hash.keySet();
		// 키을 반환한다.
		System.out.println(keySet);

		Collection<Integer> values = hash.values();
		values.forEach(System.out::println);
		// Collection을 이용해서 값만 받아와서 출력한다.

		Set<Map.Entry<String, Integer>> entrySet = hash.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();// 키 가져오기
			Integer value = entry.getValue(); // 값을 가져오기
		}

		System.out.println(entrySet);
		// entrySet을 이용한다.
	}

}
