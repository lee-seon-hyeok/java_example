package ch04;

public class Cat {
	// 생성자
	public Cat(String name) {
		this.name = name; // 생성자에 초기값을 넣어야 함
	}

	// 가변 객체 -> 생성자를 통해 값이 변하고, set을 통해 값을 바꿈
	// 외부에서 접근해서 값이 자주 바뀜
	// 변수
	private final String name;
	// 변수를 선언했으므로 접근자, 설정자를 설정한다.

	public String getName() {
		return name;
	}

	// public void setName(String name) { //불변 객체로 set을 없앰
	// this.name = name;
//	} 
}
