package ch18;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressDemo {

	public static void main(String[] args) {
		InetAddress addr1 = null, addr2 = null;

		String address = "www.hanbit.co.kr";

		try {
			addr1 = InetAddress.getByName(address);
			addr2 = InetAddress.getLocalHost();
			// 나의 주소
			System.out.println(Arrays.toString(InetAddress.getAllByName(address)));
			// array 배열의 도움을 받아서 여러 개 등록된 ip들을 찾을 수 있다.
			System.out.println(addr1.getHostName() + ":" + addr1.getHostAddress());
			// 호스트 이름과 호스트 주소를 가져온다.
			System.out.println(addr2.getHostAddress());
			// 뒤에 등록되어 있는 호스트 주소를 가져온다.
		} catch (UnknownHostException e) {
			System.out.println("해당 호스트 이름으로 등록된 IP 주소가 없습니다.");
		}

	}

}
