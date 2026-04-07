package ch03;

public class MethodCallDemo2 {

	public static void main(String[] args) {
		int x;
		RefValue ref = new RefValue();
		// ref 객체를 만들 떄 0으로 초기화 한다.
		// 1. Ref을 주소를 저장하기 위한 4바이트 확보
		// 2. 객체 생성 -> Heap 영역에 변수 X를 만들고 0으로 초기화 됨
		// 3. 4바이트 주소에 x의 주소인 0x100으로 할당함
		// 4. x 주소에 가서 x값을 할당하면 0
		// 5. ref 주소에 100를 추가, Heap에 100 값을 추가
		// 6. ChangeReference(Ref)를 호출하여 객체를 생성하면 0으로 초기화
		// 7. ChangeReference에 ref의 주소를 Heap 영역에 넘긴다
		// 8. Heap 영역에 ref에 100을 넣어 다시 보낸다
		// 9. System.out.prinln 명령으로 ref에서 출력한다
		// 결국 객체를 생성해서 주소을 넘겨야, 주소를 읽고 Heap에서 값을 변환한다.
		// int x = 0, ref(x) : 값만 복사해서 넘기면 원래 n의 영향을 받지 않는다. (callbyvalue)

		// System.out.println(RefValue.x);

		// 호출하기 전
		System.out.println("메서드 --- 시작할 때 ref.x의 값은 " + ref.x);
		// Static이 없기 때문에 RefValue를 담울 주소을 선언하여 Heap 영역에 RefValue를 만들어 X 영역이 생겨서, X를
		// 가져오려고 함

		changeReference(ref);
		System.out.println("메서드 --- 시작할 때 ref.x의 값은 " + ref.x);
		// 호출하고 난 후

	}

	public static void changeReference(RefValue ref) {
		// call by reference ==> 읽기와 쓰기를 동시에 함
		// 주소를 넘기더니 x의 값을 넣어 바꿔져 x의 바뀐 값을 넣는다.
		System.out.println("메서드 --- 시작할 때 ref.x의 값은 " + ref.x);
		ref.x++;
		System.out.println("메서드 --- 시작할 때 ref.x의 값은 " + ref.x);

	}

}

class RefValue {
	int x;
	// static이 붙어 있다면, method의 static 영역을 통해 사용
	// 변수를 선언함
}