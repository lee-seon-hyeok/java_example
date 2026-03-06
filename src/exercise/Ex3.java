package exercise;

public class Ex3 {

	public static void main(String[] args) {
		Person[] persons = new Person[3]; // 여러개 담아서 복수로 작성
		persons[0] = new Person(22, "길동이");
		persons[1] = new Student(23, "황진이", "100");

		persons[0].show();
		persons[1].show();

		for (Person person : persons) {
			person.show();
		}

	}
}

class Person {
	// 필드 - 이름, 나이
	private int age;
	private String name;

	// 메서드 - 접근자와 생성자, show()
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("사람[이름:" + name + ", 나이 :" + age);
	}

	// 생성자 - 모든 필드 초기화시킴
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

class Student extends Person {
	// 필드 - 학번 -> 윽닉해야 한다.
	private String studentNo;

	// 메서드 - 접근자와 생성자, show()
	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	@Override
	public void show() {
		System.out.println("사람[이름:" + super.getName() + ", 나이 :" + super.getAge() + ",학번 : " + studentNo + "]");
	}

	// 생성자 - 모든 필드 초기화시킴 -> foreign 부모 생성자 탄생
	public Student(int age, String name, String studentNo) {
		super(age, name); // 부모 클래스로 이동
		this.studentNo = studentNo;
	}

}

class ForeignStudent extends Student {
	// 필드 - 국적
	private String nationality;

	// 메서드 - 접근자와 생성자, show()
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	// 생성자 - 모든 필드 초기화시킴 -> student 자식 클래스를 탄생시킴
	public ForeignStudent(int age, String name, String studentNo, String nationality) {
		// 부모 클래스에 매개변수가 있는 생성자만 존재할 경우, 자식 클래스는 반드시 super를 통해 부모의 생성자를 명시적으로 호출해야만 오류가
		// 발생하지 않는다.

		super(age, name, studentNo); // 부모 클래스로 호출하게 함
		this.nationality = nationality;
	}

}
