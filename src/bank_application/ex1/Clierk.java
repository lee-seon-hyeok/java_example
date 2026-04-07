package bank_application.ex1;

import java.util.ArrayList;

public class Clierk {

  private String  code;
  private String name;

  // 생성자
  public Clierk(String code, String name) {
    this.code = code;
    this.name = name;
  }
  // getter

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  static ArrayList<String> clerks = new ArrayList<>();

}

