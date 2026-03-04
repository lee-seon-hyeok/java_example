package ch04;

public class Singleton {
//외부에서 객체를 생성할 수 없어야 한다. ->객체에 대한 접근을 허용해줘야 한다.
//내부에서 객체를 만들어야 생성하게 한다. -> 필요한 사람에게 제공
	private static Singleton singleton = new Singleton();
	// 싱글톤 static 변수 생성 -> 자기 자신만 보임 -> 외부에 보이기 위해 자기 자신을 반환

	private Singleton() {

	}

	// 객체에 대한 접근을 허용하기 위해 내부에서 getinstance를 만들고 자기 자신을 반환한다.
	static Singleton getInstance() {
		// static이기 때문에 this를 못씀 -> static 변수를 반환해야 함
		return singleton;

		// 주소를 가져오다가 외부에서 반환
	}
}
