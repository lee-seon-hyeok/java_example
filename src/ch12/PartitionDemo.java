package ch12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionDemo {

	public static void main(String[] args) {
		Stream<Nation> nations = Nation.nations.stream().limit(4);

		Map<Boolean, List<Nation>> p = nations.collect(Collectors.partitioningBy(n -> n.getType() == Nation.Type.LAND));
		// 안에 있는 getType을 꺼내서 island가 true, false인지를 묻고 true와 false 같은 2개의 그룹으로 그룹화해준다.
		// (ISLAND에 포함된 나라)
		System.out.println(p);
		// true와 false 그룹을 각각 출력한다.

	     nations = Nation.nations.stream().limit(4);
		// 스트림을 다신 만든다.
		Map<Boolean, Long> p1 = nations
				.collect(Collectors.partitioningBy(n -> n.getType() == Nation.Type.LAND, 
				Collectors.counting()));
		// true인 값만 꺼낸다.

	}

}
