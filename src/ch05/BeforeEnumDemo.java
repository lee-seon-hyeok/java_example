package ch05;

public class BeforeEnumDemo {

	public static void main(String[] args) {

		final int MALE = 0;
		final int FEMALE = 1;
		final int EAST = 0;
		final int WEST = 1; // 상수 선언

		Person person = new Person();
		person.age = 20;
		person.gender = Gender.MALE;
		// 생성자 생성하고 열거형 상수를 할당

		System.out.println(Direction.EAST);
		person.gender = Gender.MALE;
		// 같은 타입끼리 비교한다
		if (person.gender == Gender.MALE) {
			System.out.println("남성입니다.");
		} else {
			System.out.println("여성입니다.");
		}
		System.out.println(Gender.MALE.compareTo(Gender.FEMALE));

	}

}

class Person {
	// 변수
	int age;
	Gender gender; // 0 : 남성, 1 : 여성 -> 열거형 타입으로 선언

}

enum Gender {
	// 만약 숫자로 출려해야 한다며,
	MALE("남성"), FEMALE("여성");

	// object으로 상속받은 tostring을 오버라이딩을 하야 출력하게
	// 생성자를 불러서 상수 라는 객체를 사용하는 것과 같음
	// NEW 없이 상수 POOL에 값을 넣는다.
	// 필드
	String s;

	// 생성자
	Gender(String s) {
		this.s = s;
	}

	// 메서드
	@Override
	public String toString() {
		return s;
	}// 객체 생성자처럼 짬

	// 클래스와 비슷함

	// 상수로 몪음 -> int 타입이 아닌 gender 타입으로 변경
	// 메소드 영역의 상수 pool에 가서 주소값을 얻는다. 상수값의 주소를 불러와 쓸 수 있어서 바로 쓸 수 있다.
	// 메소드 영역에 있는 pool는 객체를 안 만든다.
	// 별다른 선언안하면 0과 1로 저장, 값 비교는 의미없다 comaprto로는 가능
}

enum Direction {
	EAST, WEST, SOUTH, NOTRH

}
//열거 타입 : 서로 관련된 데이터들만 가리키도록 하나로 정의함