package data_structure;

public class ArrList<E> {
	// 부품으로 사용하기 위해 제너릭 타입으로 사용
	private E[] arr; // E[] 배열 선언
	// 이때 E 타입으로 new가 안되므로, 형변환하여 형변환 해야한다.
	private int size; // 배열 안에 담긴 항목의 숫자

	public ArrList() {
		arr = (E[]) (new Object[2]); // arr.length = 2--> capactiy로 용량
		// E를 원소로 가진 배열로 형변환한다.
		// E 타입은 원래 배열이 생성이 안되서 형변환 시켜야 한다.
		size = 0;
	}

	// isEmpty, size, add, remove, tostring 메서드 사용
	public boolean isEmpty() {
		return size == 0;
		// true이면 사이즈 반환, false이면 0을 반환
	}

	public int size() {
		return size;
		// arr.length은 capacity으로 이미 Arrlist에 있으므로, return 값에 작성하면 안된다.
	}

	public E get(int index) {
		return arr[index];
		// index 번째에 있는 항목을 꺼낸다.
	}

	public boolean add(E e) {
		// true, false 값으로 받아오므로 boolean 사용
		if (arr.length == size) {
			resize(arr.length * 2);
			// 배열의 사이즈를 2배 증가시킨다.

		}
		arr[size] = e; // 맨 마지막에 추가한다. -> 데이터 맨 마지막이 현재 0이므로 매개변수로 전달 받은 값을 넣는다-> E[]를 매개변수로 한다.
		size++; // 배열에 담긴 데이터의 수, 즉 배열의 크기를 하나 증가한다.
		return true;
	}

	public E remove(int index) { // 지원진 항목을 반환함 -> E로 변경한다.
		// 매개변수는 ArrListDemo에 있는 인덱스 번지에 있는 것을 받아서 지운다.
		if (isEmpty()) {
			throw new IndexOutOfBoundsException();
		}

		E removed = arr[index]; // index 위치에 있는 객체 항목을 지우기 전에 저장한다.

		arr[index] = null;// index 위치에 있는 객체 항목을 지운다. 참조타입이므로 아무것도 없으면 null 값을 할당한다.

		size--; // 배열의 크기를 하나 감소한다.
		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); //
		 * capactiy 확인용도 테스트 코드 -> 삭제 되는 과정으로 배열에 null로 메모리 낭비됨 }
		 */
		if (size > 0 && size <= arr.length / 4) { // null로 메모리 낭비를 줄인다.
			resize(arr.length / 2);
			// 위 세 줄의 내용을 실행할 함수가 만들어져있다면 해당 함수 호출을 통해 배열의 사이즈를 1/2 로 줄인다.
		}
		return removed;
	} // 공간 복잡도까지 고려하여 자바가 줄여줌 = arrayList
//내부적으로 반복된 코드들을 private로 묶는다.

	private void resize(int length) { // 배열의 크기를 2배로 늘리다가, 줄일 수 있음
		E[] t = (E[]) (new Object[length]);// 배열의 크기를 length의 반만큼 감소시킨다.
		// 사이즈를 2배 증가시키거나 줄이는 t를 생성한다. -> 이때 E[] 타입이므로 형변환한다.
		for (int i = 0; i < size; i++) {
			t[i] = arr[i];// arr의 있는 값을 t로 옮긴다.
		} // 기존배열의 값을 새로 만든 배열로 옮긴다.

		arr = t;// 기존배열을 없애고 새로 만든 배열을 arr에 참조한다.

	} // 기존배열의 값을 새로 만든 배열로 옮긴다.

	@Override
	public String toString() { // tostring이기 때문에 반환값은 string
		String list = "";
		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				list += arr[i];
			} else {
				list += arr[i] + ",";
			}
		}
		return "ArrList : [" + list + "]";
	}
}
