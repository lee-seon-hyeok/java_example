package ch07;

public class ControllbleDemo2 {

	public static void main(String[] args) {
		// 인터페이스 배열 선언
		Controllable[] controllables = { new TV(), new Computer(), new Notebook() };
		// 부모 타입으로 자동 형변환 -> 업캐스팅하여 한 바구니에 닮음

		for (Controllable controllable : controllables) {
			controllable.turnon();
			controllable.turnoff();
			controllable.repair();
			// 부모한테 모든 것을 이용해서 구현
		}
		Controllable.reset1();
		// 인터페이스에서도 static이 메소드 영역으로 가져와서 객체 영역에 들어올 필요 x

	}

}
