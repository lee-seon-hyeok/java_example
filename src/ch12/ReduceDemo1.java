package ch12;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo1 {

	public static void main(String[] args) {
		// 리스트에 GDP가 20위 이내 나라의 인구 총합을 구한다.
		Stream<Nation> nations = Nation.nations.stream();
		// 필요할 때마다 스트림을 흘리고 나서 다시 만들어야 한다.
		// Optional reduce
		Optional<Nation> big = nations.reduce((n1, n2) -> n1.getPopulation() > n2.getPopulation() ? n1 : n2);
		big.ifPresent(System.out::println);
		// 초깃값(identity)이 없는 reduce → 결과가 없을 수도 있어서 Optional로 감싸서 리턴.

		nations = Nation.nations.stream();
		// 스트림 선언

		// T reduce
		double totalPopulation = nations.filter(n -> n.getGdpRank() <= 20).mapToDouble(Nation::getPopulation)
				.reduce(0.0, (d1, d2) -> d1 + d2);
		// nation에 있는 객체를 꺼내서 gegdprank가 20보다 작은 값만 반환한다.
		// population만 꺼내서 합을 구한다.
		// 초깃값이 있는 reduce → 항상 double 값 하나를 바로 리턴.
	}

}
