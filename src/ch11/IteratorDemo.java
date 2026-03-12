package ch11;

import java.util.ArrayList;
import java.util.Collection;

public class IteratorDemo {

	public static void main(String[] args) {
		// 객체 의존하지 않고 인터페이스에 의존
		// 컬렉션 <- list <- 구현체인 Arraylist / LinkedList
		// 구현에 의존하거나 LinkedList로 짜면 어떻게 되는가?

		// Solid의 원칙 중에 DIP를 어긴 경우
		// ArrayList<Integer> list =new ArrayList(); -> 10,20,30으로 출력
		// LinkedList로 바꿀 경우 -> 30, 20 ,10으러 출력-> DIP를 지키지 않았다.
		// LinkedList<Integer> list =new LinkedList<>();
		// list.add(10);
		// list.add(20);
		// list.add(30);

		// list.addFirst(10);
		// list.addFirst(20);
		// list.addFirst(30);
		// ArryList로 하면, 원칙적으로 addFirst가 없어서 앞에 추가를 못한다.
		// 가장 낮으면서 구체적인 객체인 ArrayList에 의존했더니, 더 높은 계층이 LinkedList의 addFirst가 없음
		// System.out.println(list);

		// Solid의 원칙 중에 DIP를 지킨 경우
		// Collection<String> list = new LinkedList<>();
		// 결합도 낮추도록 최상위 계층의 컬렉션인 list를 바라본다
		// 이때 더 느슨하게 짜기 위해 ArrayList로 바꾼다.
		Collection<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c"); // a,b,c로 나오며 맨 뒤에서 데이터를 넣음
		// collection의 자손으로 ArrayList, LinkedList에도 있는 공통 메서드가 존재하여 DIP 지킨다.
		// 따라서 (인터페이스)를 부모로 의존해야 한다.
	}

}
