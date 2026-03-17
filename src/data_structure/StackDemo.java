package data_structure;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println(stack.peek());
		while (!stack.isEmpty()) { // 스택이 비어있지 않다면
			System.out.println(stack.pop() + "제거되었습니다.");// pop 사용
		}

		/*
		 * AStack<Integer> astack = new AStack(); //제너릭으로 만들어야 함 stack.push(10);
		 * stack.push(20); stack.push(30);
		 * 
		 * System.out.println(stack.peek()); while(!stack.isEmpty()) { //스택이 비어있지 않다면
		 * System.out.println(stack.pop() + "제거되었습니다.");//pop 사용 }
		 */
		System.out.println("List로 구현한 stack의 동작");

		LStack<Integer> astack = new LStack(); // 제너릭으로 만들어야 함
		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println(stack.peek());
		while (!stack.isEmpty()) { // 스택이 비어있지 않다면
			System.out.println(stack.pop() + "제거되었습니다.");// pop 사용
		}

	}

}
