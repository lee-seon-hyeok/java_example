package ch07;

import java.util.Arrays;

public class Ex3_3 {

	public static void main(String[] args) {
		Book[] books = { new Book(15000), new Book(50000), new Book(20000) };

		System.out.println("정렬 전 : " + Arrays.toString(books));
		Arrays.sort(books);
		System.out.println("정렬 후 : " + Arrays.toString(books));

	}

}

class Book implements Comparable {
	// 변수
	int price;

	// 생성자
	public Book(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Book book) {
			return this.price - book.price;
		}
		return -999999;
	}

	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}

}

/*
 * public static void main(String[] args) { // 객체끼리 비굑하려면 comparable 구현해서 비교해야
 * 한다. -> 비교점 : legnth // Compareto를 가져오면 크기를 비교할 수 있다 // 객체끼리 비교가 안되서 기준을 잡아서
 * comparable을 implement해서 comparable 안에 있는 comparable2 // 구현하여 길이를 분석한다. Line
 * line1 = new Line(3); Line line2 = new Line(5); Line line3 = null;
 * 
 * int res = line1.compareTo(line2); System.out.println(res); if (res ==
 * -999999) { System.out.println("선과 비교할 수 없는 객체입니다."); } else if (res > 0) {
 * System.out.println("line1 이 더 깁니다."); } else if (res == 0) {
 * System.out.println("두 선의 길이가 같습니다."); } else {
 * System.out.println("line2 이 더 깁니다."); } }
 * 
 * }
 * 
 * class Line implements Comparable { int length;
 * 
 * @Override public int compareTo(Object o) { if (o instanceof Line line) {
 * return this.length - line.length; //비교한 애 정렬 -> 오름차 } return -999999; // 상속을
 * 매개변수로 조상을 받으면, 조상 위주로 자동 형변환 한다. // 다운캐스팅하여 length끼리 비교햐야 하는데, 부모로부터 상속받은 것은
 * 그대로 싸야 한다. }
 * 
 * public Line(int length) { this.length = length; }
 * 
 * }
 */