package ch11;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// 스택은 인덱스가 1부터 시작되고, 1이 가장 위에 존재하는 항목,
		// 1부터 지우고, 새로 추가한 항목의 인덱스가 1이 된다.
		Stack<String> stack = new Stack<>();

		stack.push("A");// 처음에 A가 쌓인다.
		// underflow
		if (!stack.empty()) {
			System.out.println(stack.pop());
			System.out.println(stack.peek());

		}
		// 컴파일러가 체크가 안되는 상황으로 오류가 나옴 -> empty 여부 조건문 넣어야 한다.

		// stack.add("B");
		// add는 그 다음에 B를 주가해서 push와 비슷한다.
		stack.push("B");
		stack.push("C");
		stack.push("D");

		System.out.println(stack.search("A") + "," + stack.search("B") + "," + stack.search("C") + stack.search("D"));
		// A,B,C,D에서 맨 늦게 쌓아진 D를 찾아서 출력한다.

		// (stack.search("A")+","+stack.search("B")+"," + stack.search("C") +
		// stack.search("D") + "," + stack.search("O") );
		// O처럼 해당 스택에 요소가 없으면 -1로 출력이된다.

	}

}
