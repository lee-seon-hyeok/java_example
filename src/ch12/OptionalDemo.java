package ch12;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String s = "hello";
		Optional<String> opt = Optional.ofNullable(s);
		System.out.println(opt);
		// Optional 형태 opt 생성
		// ofNullable로 hello를 Optional opt로 감갔다. -> Opstional[hello]

		if (opt.isPresent())
			// 값이 있으면 값을 껍데기에서 꺼내서 출력한다.
			System.out.println(opt.get());

		String s1 = null;
		Optional<String> opt1 = Optional.ofNullable(s1);
		System.out.println(opt1);
		// 값이 없으므로 empty로 나온다.
		// System.out.println(opt1.get());
		// empty 상태에서 get으로 가져오면 error 나온다.

		if (opt1.isEmpty())
			System.out.println("널 값을 포함하고 있다.");
		// 널 포인트를 피할 수 있게 if문을 사용한다.

	}

}
