package ch02;

public class SwitchDemo2 {

	public static void main(String[] args) {
		String res = howMany(1);
		System.out.println(res);
	}

	public static String howMany(int n) {
		if (n == 1)// 모든 경우의 수를 적지 않으면 안됨 -> 리턴값인 null도 넣는다.
			return "1개";
		else if (n == 2)
			return "2개";
		else
			return null;
	}

}
