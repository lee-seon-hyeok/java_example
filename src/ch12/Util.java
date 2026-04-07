package ch12;

public class Util {

	public static <T> void print(T t) {
		System.out.print(t + " ");
	} // 옆으로 공백이 나오게 한다.

	public static <T> void printWithParenthesis(T t) {
		System.out.print("(" + t + ") ");
	} // 가로로 감싸서 옆으로 나오게 한다.

}
