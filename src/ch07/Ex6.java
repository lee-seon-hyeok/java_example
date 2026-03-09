package ch07;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Hunman {
	void eat();
	// print() 메서드 추가
	// 이미 다른 프로젝트 사용하고 있는 기존 클래스 영향 받지 않도록 인터페으에 새로추가하라
}

class Worker implements Human {
	@Override
	public void eat() {
		System.out.println("빵을 먹습니다.");
	}
}
