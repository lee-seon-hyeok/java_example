package ch12;

import java.util.Comparator;

public class SortedDemo {

	public static void main(String[] args) {
		System.out.println("국가 이름 순서 :");
		Nation.nations.stream()
		//스트림 안에 있는 객체들끼리 비교 가능해야 한다.
		//1. 기초 2. 스트림 3. Nation이 Comparable로 구현되어야 한다.
		//Comparator 람다식, Comparator.comparing(비교기준) -> 오름차순
		//Comparator.comparing(비교기준).reversed() -> 내림차순
		.sorted(Comparator.comparing(Nation::getName))
		//국가의 이름을 받아와서 오름차순 기준으로 비교한다.			
		.forEach(Util::printWithParenthesis);
		
		System.out.println("\n 국가 이름 순서 (역순):");
		Nation.nations.stream()
		              .sorted(Comparator.comparing(Nation::getName).reversed())
		              .forEach(Util::printWithParenthesis);
		
		
		System.out.println("\n국가 GDP 순서 :");
		Nation.nations.stream()
        .sorted(Comparator.comparing(Nation::getGdpRank))
        .forEach(Util::printWithParenthesis);
		
		//메서드 사용하지 않고 작성하면 오류 나고, 메서드 참조에는 왜 오류가 나지 않을까?
		//Nation.nations.stream()
        //.sorted(n -> Comparator.comparing(n.getGdpRank())).forEach(Util::printWithParenthesis);
		//comparing은 모든 오브젝트(객체 타입)에 부모가 올 수 있다. -> object
		//n은 object을 뜻하게 됬는데, object에는 getname을 정의할 가능성이 커서,타입을 추론한다.
		//Object이 생략되었다고 추론했지만,Object에 getname이 없다고 에러가 나오게 된다.
		//따라서 명확하게 타입을 줘야 한다.
		
/*		
		Nation.nations.stream()
        .sorted(Comparator.comparing(
        (Nation n) -> n.getGpdRank()).reversed())
		.forEach(Util::printWithParenthesis);
*/		
		
		System.out.println("\n국가 인구 순서 인구가 많은 나라부터 출력");
		Nation.nations.stream()
        .sorted(Comparator.comparing(Nation::getPopulation).reversed())
        .forEach(Util::printWithParenthesis);
	
	}

}
