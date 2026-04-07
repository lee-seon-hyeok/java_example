package ch05;

public class MainCallDemo {

	public static void main(String[] args) {
		String[] abc = { "A", "B", "C" };
		MainArgsDemo.main(null);
		// JVM의 main이 아닌, args에 있는 main을 호출해본다.
		// main은 static이기 때문에 static에서 호출 가능함.

		MainArgsDemo.main(abc);
		// abc 배열에 있는 데이터를 인자로서 args에 넘긴다.
	}

}
