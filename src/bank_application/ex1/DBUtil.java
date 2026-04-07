package bank_application.ex1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
  private static final String URL = "jdbc:mysql://localhost:3306/bank_system?serverTimezone=Asia/Seoul";
  private static final String USER = "root";
  private static final String PASS = "1234";

  public static Connection getConnection() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    } catch (Exception e) {
      System.out.println("DB 연결 실패 :" + e.getMessage());
      return null;
    }
  }

}
