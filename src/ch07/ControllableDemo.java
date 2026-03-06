package ch07;

public class ControllableDemo {

	public static void main(String[] args) {
//		예를 들어, 전자제품에  포함되어야 하는 제어부의 요구 조건
//		모든 전자제품에는 전원을 온·오프하는 기능이 있으며, 수리 및 공장 초기화를 할 수 있다.
//		전자제품 객체는 turnOn( ) 메서드, turnOff( ) 메서드로만 전원을 조절할 수 있어야 한다.
//		수리 및 공장 초기화 기능을 미리 구현해 놓아서 필요할 때 사용할 수 있어야 한다.
//		수리 기능은 자식 클래스에서 오버라이딩할 수도 있다.
		TV tv = new TV();
		tv.turnon();
		tv.turnoff();
		tv.repair();

		tv.remoteOn();
		tv.remoteOff();

		// reset은 객체로 상속 대상이어서 안보임
		// controllable로 보면 reset1이 보이므로 static을 사용한다.
		// private로는 못봄

		Controllable.reset1();
		// 상속 받은 객체는 공유가 가능하므로 초기화가 가능하다

		Notebook nb = new Notebook();
		nb.turnon();
		nb.turnoff();
		nb.repair();
		nb.inMyBag();
	}

}

interface Controllable {
	// on/off 기능
	void turnon();

	void turnoff();

	// 수리 기능
	default void repair() {

	}

	// 공장 초기화 -> 오버라이딩 못함
	// 구현 메소드 : default, private, static
	// 이때 private, static은 오버라이딩이 안된다.
	/*
	 * private void reset() { //숨기면 가져다 쓸 수 없음 }
	 */
	static void reset1() {
		// 숨겨도 가져다 쓸 수 있음
		// 필요할 때 쓸 수 있으므로, static로 선택함.
	}

}

//상속받아서 리모트 컨트롤를 가능하다면(interface는 '를' 사용)
interface RemoteControllable extends Controllable {

	void remoteOn();

	void remoteOff();

	// 5개의 표준 기준을 가진다.
	// static는 상속 제외
}

class TV implements Controllable, RemoteControllable {
	// 다종 상속 구현하게 함
	@Override
	public void turnon() {
		System.out.println("TV 키다");

	}

	@Override
	public void turnoff() {
		System.out.println("TV 끄다");

	}
	// 규격에 맞게 만들어야 함으로, abstract 맞게 해야 함

	@Override
	public void repair() {

		System.out.println("TV 를 수리한다.");
	}

	@Override
	public void remoteOn() {
		System.out.println("TV를 리모콘으로 켜다.");

	}

	@Override
	public void remoteOff() {
		System.out.println("TV를 리모콘으로 끄다.");

	}
	// 수리는 오버리이딩 할 수 있다

}

class Computer implements Controllable {

	@Override
	public void turnon() {
		System.out.println("컴퓨터 키다");

	}

	@Override
	public void turnoff() {
		System.out.println("컴퓨터 끄다");

	}

}
//컴퓨터를 상속받을 노트북

//portable 구현

interface Portable {
	void inMyBag(); // 선언만 함
	// 다중 상속이 안되서 기능이 가장 큰 거을 상속받고 가장 작은 것은 인터페이스를 받는다.
}

class Notebook extends Computer implements Portable {
	@Override
	public void inMyBag() {
		System.out.println("노트북 키다 ");
	}
}
