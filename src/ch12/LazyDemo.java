package ch12;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LazyDemo {

	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1,  5);
		
		//is.filter(i->i%2==0).map(i->i*i).forEach(i->System.out.println(i));
		//filter (),():intstream을 받아서 intstream을 다시 반환한다. -> 연쇄 호출 가능하다.
		//is.filter를 반환 -> map 반환 -> forEach 반환
		//1. 스트림을 반든다.
		//2. 중간 연산 
		//    1. 짝수만 걸러낸다.
		//    2. 제공한 값을 반환한다.
	   //3. 최종 연산 : 내용을 출력한다.
		
		
		//람다식이 2줄이면, return 값이 있으면 return 넣어야 한다.
		is.filter(i-> {
			System.out.println("fikter :" + i);
			return i%2==0;
			}) //조건이 아니면 건너뛴다.
		.map(i-> { //조건에 성립하면 map을 거친다.
			System.out.println("map :" +i);
			return i*i; //foreach로 찍는다.
			})
		.forEach(i ->System.out.println("foreach : " + i));
		//메서드 참조 안된다.
		//최종 연산 제거하면 중간 연산에서 계싼이 안된다. -> 중간 연산이 최종연산을 만났을 때 계산이 된다.
		
		
		IntStream is3 = IntStream.iterate(100, i-> i*2);
		IntStream is4 = new Random().ints(0,100);
		//무한 루프
		Stream<Double> ds = Stream.generate(Math::random);
		//중간 연산자가 무한 루프 제어 가능해서 멈출 수 있다.
		ds.limit(10).forEach(System.out::println);	
	
	}
	
	
}

