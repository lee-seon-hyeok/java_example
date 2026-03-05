package ch06;

public class InheritDemo3 {

	public static void main(String[] args) {
		ColoredBox b = new ColoredBox();
		// 부모가 먼저 호출되고, 그 다음 자식이 호출된다

	}

}

class Box {
	public Box() {// 기본생정자가 첫 행에 부모 생성자를 호출한다
		System.out.println("부모 생성자가 호출되었습니다.");
	}

	public Box(String s) {
		System.out.println("부모 생성자가 호출되었습니다.");
	}

}

class ColoredBox extends Box { // 기본 생성자가 자동을 만든다.
	// super() -> 기본 생성자를 찾음
//	public ColoredBox(String color) { //매개변수가 있는 생성자 
//	System.out.println(color + "자식 생성자가 생성되었습니다.");
}
