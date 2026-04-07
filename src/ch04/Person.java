package ch04;

public class Person {
//public은 하나만, public은 생성자, 필드, 메서드 가져옴
	// 생성자

	// 필드(캡슐화 있는 경우, 접근자와 생성자를 생성)
	private String name;// private로 캡슐화로 은닉
	private int age; // 인스턴스 변수
	private String nationality;

	public String getName() {
		// 외부 공개하는 요소 - public
		// get로 데이터 가져옴 -> 문자열은 값이 없으면 기본이 null
		// -> 숫자는 값이 없으면 기본이 0

		return name;
	}

	public int getAge() {
		return age;
	}

	public String getNationality() {
		return nationality;
	}

	// 설정자로 값을 바꾼다 -> set
	/*
	 * public void setName(String name) { this.name = name; // 매개변수로 전달받은 변수를 할당받음 }
	 */

	public Person setName(String name) { // 나 자신을 반환
		this.name = name;
		return this; // heap 영역에 반환할 나 자신
		// 매개변수로 전달받은 변수를 할당받음
	}

	/*
	 * public void setAge(int age) { // 사용된 변수 = 매계변수 this.age = age; }
	 * 
	 * public void setNationality(String nationality) { this.nationality =
	 * nationality; }
	 */
	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public Person setNationality(String nationality) {
		this.nationality = nationality;
		return this;
	}

	// 메서드
	void sayHello() {
		System.out.print("안녕, 나는" + nationality + "사람이고," + name + "이며" + age + "살이야");
	}
}
