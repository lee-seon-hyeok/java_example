package ch09;

import java.util.ArrayList;

public class GenericInheritDemo {

	public static void main(String[] args) {
		ArrayList<Beverage> list1 = new ArrayList<>();
		// Beverage만 담음

		list1.add(new Beer());
		list1.add(new Boricha());
		// beer와 boricha 추가

		ArrayList<Beer> list2 = new ArrayList<>();
		list2.add(new Beer());

		inherit(list1); // 자기 자신을 호출하는 inherit 함수를 담음
		// inherit(list2); //오류가 나와서 list2는 list1와 상속 관계가 아닌다.

		inherit2(new Beverage());
		inherit2(new Beer());

	}

	static void inherit(ArrayList<Beverage> list) {
		// 상속 받으면 inherit2에 있는 자식 list1과 list2를 담음
	}

	static void inherit2(Beverage b) {
		// 자동 형변환 되어서 담을 수 있음
	}

}
