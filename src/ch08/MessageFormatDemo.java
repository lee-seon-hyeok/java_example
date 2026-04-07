package ch08;

import java.text.MessageFormat;

public class MessageFormatDemo {

	public static void main(String[] args) {
		String msg = MessageFormat.format("{0}/{1}={2}", 10, 2, 5);
		System.out.println(msg);
		// 앞에 string,뒤에 변수를 넣는다
		// 지정된 위치에 객체를 포함한 가변 개수 인자값을 넣는다.

		msg = MessageFormat.format("{0}/{1}={2}, {0}, {0}", new Object[] { "2", "1", "2" });
		// 가변 개수 인자이기 때문에 배열로 넣어서 쓸 수 있다, 문자열도 넣을 수 있다.
	}

}
