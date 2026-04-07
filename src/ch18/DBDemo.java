package ch18;

<<<<<<< HEAD
import java.sql.*;

public class DBDemo {
  public static Connection makeConnection() {
    String url = "jdbc:mysql://db:3306/test?serverTimezone=Asia/Seoul";
    Connection con = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");

      System.out.println("1. 데이터베이스 연결중 ...");
      con = DriverManager.getConnection(url, "root", "1111");
      System.out.println("1. 데이터베이스 연결 성공");
    } catch (ClassNotFoundException e) {
      System.out.println("JDBC 드라이버를 찾지 못했습니다...");
    } catch (SQLException e) {
      System.out.println("데이터베이스 연결 실패");
      System.out.println(e.getMessage());
    }
    return con;

  }

  public static void main(String[] args) {
    Connection con = makeConnection();// MySql 드라이버 연결하고 접속한 conn 을 반환해 주는 메소드 호출
    String sql = "SELECT * FROM users";

    PreparedStatement stmt = null;
    try {
      stmt = con.prepareStatement(sql);
      //stmt.setInt(1, 1);
      //tmt.setString(2, "홍길동");
      ResultSet rs = stmt.executeQuery();

      while(rs.next()) {
        System.out.println(rs.getString("name"));
        System.out.println(rs.getString("address"));
      }
/*
      stmt.setInt(1, 2);
      stmt.setString(2, "손흥민");
      rs = stmt.executeQuery();
      while(rs.next()) {
        System.out.println(rs.getString("name"));
        System.out.println(rs.getString("address"));
      }
*/
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

  }
  }
=======
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo {
	public static Connection makeConnection() {

		String url = "jdbc:mysql://localhost/test?serverTimezone=Asia/Seoul";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("데이터베이스 연결중 ...");
			con = DriverManager.getConnection(url, "root", "1234");
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾지 못했습니다...");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			System.out.println(e.getMessage());
		}
		return con;

	}

	public static void main(String[] args) {
		Connection con = makeConnection(); // mysql 드라이버 연결하고 접속한 소켓 conn을 반환해주는 메소드 호출

		String sql = "SELECT * FROM test.table1";
		// ctrl + alt +V
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			// 이미 맺은 DB 연결(con)을 사용해 SQL을 실행할 수 있는 Statement 객체를 생성, 이 객체로 SQL 쿼리를 실행
			ResultSet rs = stmt.executeQuery(sql);
			// SELECT * FROM test.table1를 DB 서버로 보내고, 그 결과를 ResultSet rs에 담아서 클라이언트가 받게 한다.
			// resort 타입으로 받아야 한다. -> get으로 데이터를 가져와야 한다.
			while (rs.next()) {
				// System.out.println(rs.getString(2)); //2건 나올때까지 출력
				System.out.println(rs.getString(1)); // 1번 칼럼을 문자열로 출력한다.
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("address"));

				// 자바에서 이터레이터 풀듯이 푼다.
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
>>>>>>> 3e83b7ee94b8c5a5d0545742155b3cb1e0d4966a
