package ch18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBDemo2 {
  public static void main(String[] args) {
    Connection con = DBDemo.makeConnection();
    String sql = "INSERT INTO `table1` (`id`, `name`, `address`) VALUES (?, ?, ?), (?, ?, ?)";

    PreparedStatement stmt = null;
    try {
      stmt = con.prepareStatement(sql);
      stmt.setInt(1, 41);
      stmt.setString(2, "홍길동");
      stmt.setString(3, "대한민국");
      stmt.setInt(4, 42);
      stmt.setString(5, "박세리");
      stmt.setString(6, "대한민국");
      int count = stmt.executeUpdate();
      if(count > 0) {
        System.out.println(count + " 건의 데이터가 입력되었습니다.");
      } else {
        System.out.println("데이터 입력에 실패했습니다.");
      }
    } catch (SQLException e) {
      System.out.println("데이터 입력에 실패했습니다.");
    }
  } // UPDATE `test`.`table1` SET `name` = '이강인', `address` = '인천시' WHERE (`id` = '4');

}