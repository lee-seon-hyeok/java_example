package ch09;

public class GenericMethodDemo2 {

	public static void main(String[] args) {
		// a[4] 값보다 큰 티켓의 개수를 구해라
		Ticket[] a = { new Ticket(11000), new Ticket(15000), new Ticket(8000), new Ticket(20000), new Ticket(10000) };
		// 첫번째~다섯 번째 티켓이 있을 떄, 1만원보다 가격이 큰 티켓

		Line[] b = { new Line(11000), new Line(5000) };
		System.out.println(countGT(a, a[4]));
		// a의 모든 원소들 중에 a[4]보다 큰 티켓

	}

	/*
	 * // 값을 반환하는 static 메서드 static int countGT(Ticket[] arr, Ticket t) { int count
	 * = 0; // for 문으로 count 반환 for (Ticket ticket : arr) { if (ticket.compareTo(t)
	 * > 0) { // 객체끼리 비교 안된다. -> compareto로만 가능 count++; } } return count; }
	 */

	// 제네릭 메서드 -> 반드시 비교 가능한 제한을 걸어줌
	// 티켓 말고 다른 compareable 객체로 구현되는 지 확인해야 함
	static <T extends Comparable> int countGT(T[] arr, T t) {
		int count = 0;
		// for 문으로 count 반환
		for (T ticket : arr) {
			if (ticket.compareTo(t) > 0) { // 객체끼리 비교 안된다. -> compareto로만 가능
				count++;
			}
		}
		return count;
	}

}

class Ticket implements Comparable<Ticket> {
	int price;

	public Ticket(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Ticket other) {
		return this.price - other.price;
	}
}

class Line implements Comparable {

	// 필드
	int price;

	// 셍성자
	public Line(int price) {
		this.price = price;// 티켓이 만들어질 때 가격 지정
	}

	@Override
	public int compareTo(Object o) {
		if (this == o)
			return 0;
		else if (o instanceof Line ticket) {
			return this.price - ticket.price;
		}
		return -999999;
	}

}