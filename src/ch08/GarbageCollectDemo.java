package ch08;

public class GarbageCollectDemo {

	public static void main(String[] args) {
		Garbage g = new Garbage(0);
		System.gc(); // 가비지 실행 요청, 끝나서 가비지 컬렉터 수행x
		System.out.println("");
		System.out.println("");
		System.out.println("");

	}
}

class Garbage {
	// 필드
	public int no;

	// 생성자 : 객체를 만들 때 자동 호출, 변수를 초기화 역활
	// (return X)

	public Garbage(int no) {
		this.no = no; // 인스턴스 변수 초기화
		System.out.printf("Garbage(%d) 생성됨 \n", no);
		// 매개변수의 no를 받아드림 (int no)
	}

	protected void finalize()// 소멸자 -> 가비지 컬렉터 호출 시 사용
	// 객체가 수멸될 떄 호출됨
	{// 상속 받은 객체에서 사용 가능
		System.out.printf("Garbage(%d) 수거됨 \n", no);
		// this. no를 받아드림

	}
}
