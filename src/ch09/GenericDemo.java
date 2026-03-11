package ch09;

public class GenericDemo {

	public static void main(String[] args) {
		Cup<Beer> cup = new Cup<>();
		// CUP에게 상속받은 것만 담길 수 있다.

		// 생략 가능 : Cup<Beverage> cup = new Cup<Beverage>();

		// Cup<Beverage> cup3 = new Cup<>();
		cup.setBeverage(new Beer());
		// 제너릴을 사용해서 Beer로 형변환 할 필요 없음
		Beer beverage = cup.getBeverage();
		// 제네릭이 없다면 타입이 안 맞아 오류 나오므로 beverage가 아닌, object으로 설정
		// object으로 설정했기에 bear로 형변환 해야함
		// 부모 타입에 담긴 객체를 자식 타입으로 되돌림 -> 형변환
		beverage.drink();

		Cup<Boricha> cup2 = new Cup<>();
		// Cup에 보리차를 담아야 한다고 객체 선언

		// 실행하면 오류가 나옴 -> 보리차인데, 술로 형변환하려고 해서 캐스터 타입이 안 맞음
		cup2.setBeverage(new Boricha());
		// cup에 보리차를 넣으려 하면, 타입이 달라서 컴파일러 오류가 미리 발생한다. -> 착한 오류

		Boricha beverage2 = cup2.getBeverage();
		// Boricha boricha = (Boricha) beverage;
		// 보리차로 타입변환
		beverage2.drink();

		genericMethod(100);
	}

	public static <T> void genericMethod(T data) {
		System.out.println(data);
	}

}

class Cup<T> {
	// private Object beverage;
	// Obejct 타입으로 선언해서 모든 것을 담을 수 있다.

	// private으로 getter setter 필요

	private T beverage;

	public T getBeverage() {
		return beverage;
	}

	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
	// 제너릭로 바꾸려면 Object 자리를 T로 변경함

	public <T> void any(T any) {

	}

}

class Beverage {
	void drink() {
		System.out.println("음료수를 마신다.");
	}
}

class Boricha extends Beverage {

	@Override
	void drink() {
		System.out.println("보리차를 마신다.");
	}
}

class Beer extends Beverage {

	@Override
	void drink() {
		// TODO Auto-generated method stub
		System.out.println("맥주를 마신다.");
	}

}
//제네릭은 결정되지 않은 타입을 매개변수로 처리하면 객체를 생성할 때 구체적인 타입으로 대체시킴
