package exercies.ch12;

import java.util.stream.Stream;

public class Ex2 {
	public static void main(String[] args) {
		Stream.of("a1", "a2", "a3")
		.map(s -> s.substring(1))
		.mapToInt(Integer::parseInt) 
		.max()
		.ifPresent(System.out::println);
		//1.ispresant -> getasint 사용해야 한다.
		//2.ifpresent -> get 절차를 생략할 수 있다.
		//3
	}
}
