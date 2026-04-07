package ch12;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperation {

	public static void main(String[] args) {
		Nation.nations.stream()
		.allMatch(n -> n.getPopulation() > 100.0);
		//모든 국가의 인구가 1억이 넘은지 true or false를 준다
		
		//스트림은 한번 소모되면 또 만든다.
		//스트림을 만들고 첫번째 나라를 가져온다.
		Optional <Nation> n = Nation.nations.stream()
				.findFirst();
        n.ifPresent(Util::print);
        
        //섬이라는 조건을 만족한 것 중에 아무거나 가져오라 
      /*  Optional <Nation> n1 = Nation.nations.stream()
        		.filter((Nation nation)-> nation.isIsland())
				.findAny();
        */
        Optional <Nation> n1 = Nation.nations.stream()
        		.filter(Nation::isIsland)
				.findAny();
        n.ifPresent(Util::print);
        
        
        Stream<Nation> ns = Nation.nations.stream();
        
        Optional<Nation> on = ns.max(Comparator.comparing(Nation::getPopulation));
        //comparlate에 기준점을 준다. -> 이떄 Optional 객체를 반환한다.
        
        System.out.println("\n 인구가 가장 많은 나라 : " + on.get());
        OptionalInt oi = IntStream.of(1,2,3,4,5).max();
        //intStream으로 integer는 comparable로 별도의 기준 만들 필요 없다. 
        System.out.println(oi.getAsInt());
        //int로 반환한다.
        
        
        long count= IntStream.of(1,2,3,4,5).count();
        //count를 long으로 꺼내온다.
        
        int sum= IntStream.of(1,2,3,4,5).sum();
        //sum은 int로 꺼내온다.
        
        System.out.println(count + ":"+sum);
        
	}

}
