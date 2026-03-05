package ch06;

public class Ball extends Circle { // 자식

	@Override
	public void findArea() {
		super.findArea();// 원래 형태는 숨겨져서, 부모꺼만 들어냄
		System.out.println();

		// 범위를 넒히는 거 가능하지만 반대로 범위를 좁히는 거 불가능 하다
	}
//부모로 부터 물려받은 것을 고쳐 씀 -> 메서드 오버라이딩
//부모로 부터 물려받은 매서드을 자식에게 맞게 수정한다.

}

class Circle { // 부모
	int radius;

	private void secret() {
		System.out.println("비밀입니다.");
	}

	// 오버라이딩은 덮어씌우는 거지, 이름을 변경하지 못함
	final void finalMethod() {
		// 오버라이딩 불가
	}

	private void SecretMethod() {
		// 오버라이딩 불가
	}

	public void findRedius() {
		System.out.println("반지름은" + radius + "입니다");
	}

	public void findArea() {
		System.out.println("넒이는" + (3.14 * radius * radius) + "입니다");
	}

}
