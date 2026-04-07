package ch07;

public class CoinDemo {

	public static void main(String[] args) {
		System.out.println("Dime 은" + Coin.DIME + "센트입니다.");
		// Coin을 상속 받을 있는 것을 고른다.
		// Coin coin = new Coin();

		// static는 객체를 부르지 않고 가져다 쓸 수 있음 -> Static을 이용해서 인터페이스 상속을 부름
	}

}

interface Coin {
	public static final int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25;
	// 상수 선언 -> NEW 생성하지 않기 때문에 HEAP이 아닌 메소드 영역의 상수 Pool에 올라간다.
	// 인터페이스에 하나씩 가져움
}
