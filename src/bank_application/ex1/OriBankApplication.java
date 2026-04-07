package bank_application.ex1;

import java.time.LocalDate;
import java.util.*;

public class OriBankApplication {

  public static void main(String[] args) {
    Map<String, Clierk> clerkMap = new HashMap<>();
    Clierk bankClerk = new Clierk("1", "이신한");
    clerkMap.put("1", bankClerk);

    Map<String, Account> accountMap = new HashMap<>();
    Map<Account, List<Transaction>> transactionMap = new HashMap<>();
    Map<String, Client> clientMap = new HashMap<>();
    Client client = null;
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    String randomAccNo = "";
    String clientNo = "";
    String clientName = "";
    String passwd1 = "";
    String passwd2 = "";
    long balance = 0L;
    Account account = null;
    Transaction transaction = null;

    while (true) {
      String biz1 = """
          ---------------------------------------------------------------
          1: 계좌개설, 2: 목록, 3: 입금, 4: 출금, 5: 조회, 6: 계좌해지, 0: 종료
          ---------------------------------------------------------------
          """;
      System.out.print(biz1);
      System.out.print("업무 구분 코드 > ");
      String menu = in.nextLine();
      BankDAO dao = new BankDAO();
      if (menu.equals("1")) { // 계좌개설
        System.out.println("계좌 개설중 ");
        // ==> 프로그램이 길어지면 메서드로 리팩토링 하면 됨.
        // 신규 고객인 경우와 기존 고객의 경우 처리 달라짐

        // 처리 --> 계좌 개설 / Client, Account
//			while (true) {
//				randomAccNo = String.valueOf(random.nextInt(99999) + 1);
//				// 계좌번호는 랜덤하게 생성
//
//			}

//			while (true) {
//				System.out.print("계좌개설시 입금하실 금액을 입력하세요 > ");
//				if() {
//					break;
//				}
//			}

//			account = new Account(BankCode.신한, randomAccNo, client, balance);
//			accountMap.put(randomAccNo, account);
//			while (true) { // 비밀번호 입력을 정상적으로 했을 때 빠져나오게 하기, 오류 있으면 다시 입력받기
//				System.out.print("사용하실 비밀번호를 숫자 4자리로 입력해주세요 > ");
//
//
//			}
        // 처리 --> 계좌 개설 완료 / Transaction , Account


        // 1. 고객 정보 입력 (신규/기존 구분 로직)
        System.out.print("고객 번호(custid) 입력 > ");
        int custid = Integer.parseInt(in.nextLine());

        // DB에서 고객 조회
        client = dao.selectClient(custid);

        if (client == null) { // DB에 고객이 없으면 신규 생성
          System.out.print("신규 고객입니다. 고객명을 입력하세요 > ");
          clientName = in.nextLine();
          client = new Client(custid, clientName, LocalDate.now().toString(), null);

          dao.insertClient(client); // DB에 신규 고객 저장
          System.out.println("신규 고객 등록 완료.");
        } else {
          System.out.println(client.getName() + "님, 환영합니다.");
        }

        // 2. 중복되지 않는 계좌번호 생성 (DB 조회 방식)
        int accCode;
        while (true) {
          accCode = random.nextInt(99999) + 1;
          if (!dao.isAccountExists(accCode)) { // DB에 해당 계좌번호가 있는지 확인
            break;
          }
        }
        System.out.println("배정된 계좌번호: " + accCode);

        // 3. 비밀번호 설정
        while (true) {
          System.out.print("사용하실 비밀번호 4자리 입력 > ");
          passwd1 = in.nextLine();
          if (passwd1.length() == 4 && passwd1.matches("\\d+")) break;
          System.out.println("오류: 숫자로 된 4자리 비밀번호를 입력하세요.");
        }

        // 4. 초기 입금액
        int initialBalance = 0;
        while (true) {
          System.out.print("초기 입금 금액 입력 > ");
          initialBalance = Integer.parseInt(in.nextLine());
          if (initialBalance >= 0) break;
        }

        // 5. Account 객체 생성 및 DB 저장
        // 주의: Account 클래스에 setCode(int)와 setOpendate(String) 메서드가 있어야 합니다.
        account = new Account(client);
        account.setCode(accCode); // Account 클래스 필드에 맞게 세팅 필요
        account.setPassword(passwd1);
        account.deposit(initialBalance);
        account.setActive(true);
        account.setOpendate(LocalDate.now().toString());

        dao.insertAccount(account, custid); // DB에 계좌 정보 저장

        // 6. 거래 내역 기록 (Transaction 생략 - 테이블 구조에 맞춰 추가 가능)
        if (dao.isClerkExist("1")) {
          // 직원이 있을 때만 실행! (이제 외래키 에러 안 남)
          dao.insertTransaction(custid, accCode, "1", Kubun.open.name(), "정상");
          System.out.println("거래 내역이 성공적으로 기록되었습니다.");
        } else {
          // 직원이 없다면 에러를 내는 대신 안내 메시지를 출력합니다.
          System.out.println("경고: 담당 직원(1번)이 DB에 등록되어 있지 않아 거래 내역을 기록하지 못했습니다.");
          System.out.println("먼저 SQL에서 직원을 등록해 주세요!");
        }

        System.out.println("성공: " + client.getName() + "님의 계좌[" + accCode + "]가 개설되었습니다.");

      } else if (menu.equals("2")) {
        System.out.println("목록 처리 중 ");
      } else if (menu.equals("3")) {
        System.out.println("입금 처리 중 ");
      } else if (menu.equals("4")) {
        System.out.println("출금 처리 중 ");
      } else if (menu.equals("5")) {
        System.out.println("조회 처리 중 ");
      } else if (menu.equals("6")) {
        System.out.println("해지 처리 중 ");
      } else if (menu.equals("0")) {
        System.out.println("은행 업무를 종료합니다.");
        break;
      } // end of menu select
    } // end of method (main)
  } // end of class
}