package exercise;

interface CTyperUsb {
	void connect();
	// 규격 (인터페이스) : 모든 C타입 기기의 공통점
}

//2. 구현체: 삼성 휴대폰
class SamsungPhone implements CTyperUsb {
	@Override
	public void connect() {// 1. 휴대폰 충전에 사용
		System.out.println("휴대폰: 초고속 충전 시작!");
	}
}

//3. 구현체: 무선 이어폰
class GalaxyBuds implements CTyperUsb {
	@Override
	public void connect() {// 2. 무선 이어폰 충전에 사용
		System.out.println("이어폰: 케이스 충전 시작!");
	}
}

public class Charge {
	// 하나의 케이블(변수)로 여러 기기를 다룰 수 있음
	public static void main(String[] args) {
		CTyperUsb cable;

		cable = new SamsungPhone(); // 휴대폰에 충전

		cable.connect(); // 무선 이어폰에 충전

		cable = new GalaxyBuds();
		cable.connect();

		interface UsbTypeA {
			void connectA();
		}

		// 1. extends: Type-A 규격에 Type-C 기능을 추가(확장)
		interface HybridUsb extends UsbTypeA {
			void connectC();

			// 2. default: 기존 변환기에 '자가진단' 기능을 하위 호환성 깨지 않고 추가
			default void selfCheck() {
				System.out.println("연결 상태 양호");
			}
		}

		// 3. implements: USB 규격에 맞게 변환 (규격 실현)
		class UsbAdapter implements HybridUsb {
			public void connectA() {
				System.out.println("Type-A 연결 완료");
			}

			public void connectC() {
				System.out.println("Type-C 연결 완료");
			}
		}

	}
}
