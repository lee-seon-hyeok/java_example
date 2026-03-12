package ch12;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		int[] ia = { 2, 3, 5, 7, 11, 13 };

		// intstream 만들기
		IntStream is = Arrays.stream(ia);
		// Intstream을 반환한 배열
		System.out.println(is.summaryStatistics());
		// is.st는 summaryStatics()를 지원한다.
		System.out.println(is.average() + "," + is.sum());
		// 숫자 스트림의 intstream은 summarystatic, average, sum()를 지원한다.
		Stream<Integer> is1 = Stream.of(2, 3, 5, 7, 11, 13);
		// 객체 스트림의 integer 스트림은 stream of를 통해 값들을 넣어야 한다.
		// 객체 스트림의 integer 스트림은 summarystatic, average, sum()를 지원하지 않는다.
		IntStream is2 = IntStream.of(2, 3, 4, 5, 7, 11, 13);
		// 숫자 스트림의 intstream은 intstreamof를 통해 그 타입에 맞게 지정해줘야 한다.

		String[] sa = { "The", "Pen", "is", "mighter", "than", "the", "sword" };
		Stream<String> ss = Arrays.stream(sa);
		// 스트림은 전부다 담을 수 있어서 어떤 것을 담을지 알려야 한다.
		// System.out.println(ss.average() + ss.sum());
		// 객체 스트림은 넘버스트림을 지원하지 않는다.

		IntStream is3 = IntStream.iterate(100, i -> i * 2);
		// iterate로도 가능, 결과값을 intstream에 반환한다.

		IntStream is4 = new Random().ints(0, 100);
		// 0~100개의 랜덤값을 반환

		// Stream<Double> ds = Stream.generate(()->Math.random());
		Stream<Double> ds = Stream.generate(Math::random);
		// 0~100개의 랜덤값을 꺼내서 반환
		// 메소드 참조로 줄일 수 있다.

		IntStream is5 = IntStream.rangeClosed(1, 10);
		// range : end 미포함, rangedclosed: end 포함한다.
	}

}
