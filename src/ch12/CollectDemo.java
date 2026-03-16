package ch12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
	public static void main(String[] args) {
     Stream<Nation> nations = Nation.nations.stream();
     //map + limit
     //Collector<T, ?, List<T>> : 모든 요소를 순서대로 List로 수집
      List<String> nationNames = nations.map(n->n.getName())
     .limit(3)
     .collect(Collectors.toList());
     //3개를 통해 Collector의 List로 순서가 있는 리스트를 만든다.
      
      System.out.println(nationNames);
      
      //Collector<T, ?, Map<K,V>> : 키-값 쌍으로 변환해서 Map으로 수집
      //filter를 하여 true인 섬나라만 뽑게 한다, 이름과 인구수로 키-값 형태를 만든다.  
      /*nation.filter(Nation::isIsland)
      .collect(Collectors.toMap(Nation n) -> n.getName()));*/
      //반드시 추론하는 타입을 넣음 -> 메서드 참조로 변경  
      Map<String, Double> nationdIsland = nations.filter(Nation::isIsland)
      .collect(Collectors.toMap(Nation::getName, Nation::getPopulation));
      
	
	}
	
	}

