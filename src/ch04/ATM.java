package ch04;

public class ATM {
	// 생상자
	public ATM() {
		// 지역 변수에 기본값이 없으면 반드시 null로 초기화
		location = "오리역";
		managedBy = "연구원";
		// 생성자는 인스턴스 변수의 값을 원하는 값으로 초기화시킬 수 있다.

	} // 기본 생성자 : 아무것도 없는 상태 = DEFAULT 생성자
		// 자동으로 컴파일러가 코드 생성함

	public void identifies() {
		System.out.println(location);
	} // 객체 지향이여서 순차적으로 실행되지 않는다. -> 동적 언어의 특징

	public String location; // heap에서 ""로 초기화하며 객체 생성
	public String managedBy;// ""로 초기화

	public void transections() {

	}
}
//uml : 다양한 클래스 연결로 만듬
