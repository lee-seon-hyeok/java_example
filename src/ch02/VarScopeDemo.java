package ch02;

public class VarScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// var1는 메소드 블록에서만 가능, 이때 메소드 블록은 if, for 블록이 포함되어, var1은 모든 블록 사용 가능
		int var1 = 10;
		if (true) { // var2는 if 블록 안에서만 가능
			int var2 = 20;
			System.out.println("var1 : " + var1);
			System.out.println("var2 : " + var2);
			// System.out.println("var3 : " + var3);
		}

		for (int i = 0; i < 1; i++) { // var3은 for 블록 안에서만 가능
			int var3 = 30;
			System.out.println("var1 : " + var1);
			// System.out.println("var2 : " + var2);
			System.out.println("var3 : " + var3);
		}
		System.out.println("var1 : " + var1);
		// System.out.println("var2 : " + var2);
		// System.out.println("var3 : " + var3);

	}

}
