package ch08;

import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		// get 인스턴스로 생성해서 Calendar를 가져옴

		System.out.println(c.AM);
		// Calender의 값을 갖고 있는 인덱스의 값이다.
		System.out.println(c.DAY_OF_MONTH);
		System.out.println(c.YEAR);
		System.out.println(c.MONTH);

		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.HOUR));

		// 상수값이 들어있으므로 상수값을 이용해서, 상수의 정보를 가져온다.
		// 현재 기준

	}

}
