package ch09;

public class TryCatchDemo2 {

	public static void main(String[] args) {

		Reso r = new Reso();
		// RSSO 파일에 리소스 생성자 만듬

		Reso r1 = new Reso();
		try (r) {
			r.open();
			r1.open();
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
			// try~resource에 의해 자동 호출되어 Close가 됨
		} // 리소스를 try()에 넣으면 자원을 다 받아줌
	} // 자원 여러 개를 열어도 자동으로 다 닫아줌

}

class Reso implements AutoCloseable {
	void open() {
		System.out.println("자원을 엽니다.");
	}

	@Override
	public void close() throws Exception {
		System.out.println("자원을 닫습니다.");

	}

}
