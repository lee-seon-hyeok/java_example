package ch04;

public class PersonDemo {

	public static void main(String[] args) {
		// 생성자 생성
		Person person = new Person();
		System.out.println(person.getName() + ":" + person.getAge());
		// 접근자 함수를 통해 출력
		/*
		 * person.setName("민국"); person.sayHello(); person.setNationality("대한민국");
		 */
		person.setNationality("대한민국").setName("민국").setAge(20).sayHello();
		// 나 자신을 반환하면 연속호출 가능
	}

}
