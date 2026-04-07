package bank_application.ex1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Account {
  private int code;
  private Client client;
  private String password;
  private String opendate;
  private String closedate;
  private boolean active;
  private int balance;
  // 상수 선언- 0 , 1_000_000
  final int MIN_BALANCE = 0;
  final int MAX_BALANCE = 1_000_000;

  public Account(Client client) {
    this.client = client;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }
  public Client getClient() {
    return client;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    // rule
    this.password = password;
  }

  public String getOpendate() {
    return opendate;
  }
  public void setOpendate(String opendate){
    this.opendate = opendate;
  }

  public String getClosedate() {
    return closedate;
  }

  public void setClosedate(String closedate) {
    this.closedate = closedate;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public int getBalance() {
    return balance;
  }

  // 메서드
  // 입금 기능 추가
  public void deposit(int money) {
    balance += money;
  }
  // 출금 기능 추가
  public void withdraw(int money) {
    // 잔고보다 더 많이 인출할 수 없음
    if(balance < money) {
      System.out.println("잔액 부족");
    } else {
      balance -= money;
      System.out.println("출금이 성공되었습니다.");
    }
  }

  public int inquiry() {
    return balance;
  }

  public void cancelAccount() {
    this.closedate = LocalDate.now().format(DateTimeFormatter.ofPattern("YYYY-MM-DD"));
  }

  public void setActive() {
    this.active = !this.active;
  }
  // 계좌 정보 출력
  @Override
  public String toString() {
    return code + "\t" +
        client.getName() + "\t" +
        balance ;
  }
}
