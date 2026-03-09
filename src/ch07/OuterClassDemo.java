package ch07;

public class OuterClassDemo {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InstanceMembeClass instanceClass = outerClass.new InstanceMembeClass();
		// inner class에 내부 클래스 만들고 외부 클래스에 호출해서 자식 만든다.
		// private은 메인 메소드의 outerclass에서 만들 수 없음

		OuterClass.StaticMemberClass staticClass = new OuterClass.StaticMemberClass();
		// OuterClass가 객체 만들지 않아도 Static 변수를 만들 수 잇다.
		// static 객체 만들지 않고 class 안에 있는 static 타입 맴버를 생성

	}

}

class OuterClass {
	public OuterClass() {

		PrivateMember privatemember = new PrivateMember();
		// 자기 자신이 만들 때 private 생성
		// 예약어는 변수로 못 만듬
		// 생성자를 부를 수 없고 내부적으로 만드면 부모가 만드면 자식이 만들어져 숨길 수 있다.
	}

	static class StaticMemberClass {

	}

	class InstanceMembeClass { // 인스턴스 맴버 클래스 -> private 없어서 외부에서 생성가능

	}

	private class PrivateMember {
		PrivateMember() {
			System.out.println("비밀스럽게 생성된 PrivateMember");
		}
	}

	interface InnerInterface {

	}

	void method1() { // 메소드
		class LocalClass { // 지역변수

		}
	}

	void method2() { // 메소드
		class LocalClass { // 지역변수

		}
	}
}