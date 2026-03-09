package exercise;

import java.util.HashSet;
import java.util.Objects;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Member> set = new HashSet<>();

		// "user123"이라는 아이디로 객체를 생성해 Set에 저장
		set.add(new Member("user123"));

		// 논리적으로 동일한 "user123"을 찾기 위해 새로운 객체 생성
		Member searchMember = new Member("user123");

		// 두 객체의 equals 결과는? -> equals를 재정의했으므로 true가 나옴
		System.out.println("equals() 비교 결과: " + new Member("user123").equals(searchMember));

		// Set에서 이 객체를 찾을 수 있을까? -> hashcode()를 정의하여 true 나옴
		System.out.println("Set에 존재하는가?: " + set.contains(searchMember));
	}

}

class Member {
	String a;
	String b;

	String id;

	public Member(String id) {
		this.id = id;
	}

	// equals()만 재정의 (id가 같으면 true 반환)
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member other = (Member) obj;
			return this.id.equals(other.id);
		}
		return false;
	}

	@Override
	public int hashCode() {
		// 2. 결과값은 항상 정수(int)로 돌려준다.

		return Objects.hash(a, b);
		// 3. a와 b라는 재료를 섞어서 고유한 번호를 만든다
	}

	/*
	 * @Override public int hashCode() { return Objects.hash(id); // id 값이 같으면 항상 같은
	 * 해시코드 반환 }
	 */
}
