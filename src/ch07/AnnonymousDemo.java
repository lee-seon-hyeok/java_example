package ch07;

public class AnnonymousDemo {

	public static void main(String[] args) {
		Parent parent = new Parent() {
			// 자식의 이름 중요 x -> 부모 이름 타입으로 씀
			@Override
			void method1() {
				System.out.println("한번 만들어서 불리는 이름 없는 클래스");
				// 익명 클래스 실행하니까 자식의 메서드가 수행
			}
		};

		parent.method1();
		// 실행무이어서 세미클롴넣기
		ParentInterface pi = new ParentInterface() {
			@Override
			public void method2() {
				System.out.println("부모 인터페이스로 구현한 자식 클래스 ");
				// 자식과 중첩일때 사용
			}
		};
		pi.method2();
	}

}

class Parent {
	void method1() {
	}
}

/*
 * class OnlyOnce extends Parent {
 * 
 * }
 */

interface ParentInterface {
	void method2();
}

/*
 * class Once implements ParentInterface{
 * 
 * @Override public void method2() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * }
 */