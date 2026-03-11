package ch10;

public class LambdaDemo {

	public static void main(String[] args) {
		// 람다 => 익명 클래스를 가지고 만든 익명객체(메서드)

		Object o = new Object() {
			int max(int a, int b) {
				// 부모가 가이드라인을 제시하면, 구현시킨다.
				return a > b ? a : b;
			}
		}; // heap에 있는 객체를 method에 누군가 할당시키게 한다 -> 객체 o

		// o.max(10,20);
		// Object에는 max를 가리킨 주소가 없어서 에러

		// 인터페이스로 직접 자식를 가지지 못하므로, 부모의 몸을 빌린다.
		FuncInterface f = new FuncInterface() {
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};

		System.out.println(f.max(10, 20));
		System.out.println(f.max(10, 5));
		// 이떄 람다식으로 줄일 수 잇다.
		// (a,b) -> a > b ? a : b;

		FuncInterface f1 = (a, b) -> a > b ? a : b;
		// 람다로 만들어서 f1을 통해 max를 부른다.
		System.out.println(f1.max(10, 20));
		System.out.println(f1.max(10, 5));
	}

}

//함수형 인터페이스 : : 추상메서드 한개만 같음
//이 함수 인터페이스를 줄인 것이 람다
//애너테이션 : 컴파일러에게 주는 정보
@FunctionalInterface
//functionalInterface : 함수형 인터페이스 정보를 줌 
interface FuncInterface {
	int max(int a, int b);
}