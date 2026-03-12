package ch12;

import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		Stream.of("a1","12","b2","c1","c2","c3")
		 .filter(s-> s.startsWith("c"))
         //중간 연산을 스트림에 담거나 바로 연산 가능하다.
		 //c로 시작한 거만 본다.
		 .skip(1)
		 //몇개를 건너뛸지
		 //c로 시작한 첫번째를 스킵한다 -> c2, c3만 남는다.
		 .forEach(System.out::println);
	}

}
