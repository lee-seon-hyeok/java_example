package bank_application.ex1;

public class Client {
  private int custid;
  private String name;
  private String opendate;
  private String closedate;
  //생성자, getter, setter 자동 생성

  public Client(int custid, String name, String opendate, String closedate) {
    this.custid = custid;
    this.name = name;
    this.opendate = opendate;
    this.closedate = closedate;
  }

  public int getCustid() {
    return custid;
  }

  public void setCustid(int custid) {
    this.custid = custid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOpendate() {
    return opendate;
  }

  public void setOpendate(String opendate) {
    this.opendate = opendate;
  }

  public String getClosedate() {
    return closedate;
  }

  public void setClosedate(String closedate) {
    this.closedate = closedate;
  }
}
