package bank_application.ex1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;


public class BankDAO {
  public void insertClient(Client client) {
    String sql = "INSERT INTO Client (custid, name, opendate) VALUES (?,?,?)";
    try (Connection conn = DBUtil.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setInt(1, client.getCustid());
      pstmt.setString(2, client.getName());
      pstmt.setString(3, client.getOpendate());
      pstmt.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public Client selectClient(int custid) {
    String sql = "SELECT * FROM Client WHERE custid = ?";
    try (Connection conn = DBUtil.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setInt(1, custid);
      ResultSet rs = pstmt.executeQuery();
      if (rs.next()) {
         return new Client(rs.getInt("custid"), rs.getString("name"),
             rs.getString("opendate"), rs.getString("closedate"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }return null;
  }
  public boolean isAccountExists(int code) {
    String sql = "SELECT code FROM Account Where code = ?";

    try (Connection conn = DBUtil.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
         pstmt.setInt(1,code);
         ResultSet rs = pstmt.executeQuery();
    }catch(SQLException e){
      e.printStackTrace();
    }
    return false;
  }

 public void insertAccount(Account account, int custid){
    String sql = "INSERT INTO Account(code, custid, password, balance, opendate,active) VALUES(?,?,?,?,?,?)";
    try(Connection conn = DBUtil.getConnection();
       PreparedStatement pstmt = conn.prepareStatement(sql)){
      pstmt.setInt(1, account.getCode());
      pstmt.setInt(2, custid);
      pstmt.setString(3, account.getPassword());
      pstmt.setInt(4, account.getBalance());
      pstmt.setString(5, account.getOpendate());
      pstmt.setBoolean(6, account.isActive());
      pstmt.executeUpdate();
    } catch(SQLException e){
      e.printStackTrace();
    }
 }

 public boolean isClerkExist(String clerkCode){
    String sql = "SELECT COUNT(*) FROM Clierk WHERE code = ?";
    try(Connection conn = DBUtil.getConnection();
    PreparedStatement pstmt = conn.prepareStatement(sql)){
      pstmt.setString(1, clerkCode);
      try(ResultSet rs = pstmt.executeQuery()){
        if(rs.next()){
          return rs.getInt(1) > 0;
        }
      }
    } catch(SQLException e) {
      e.printStackTrace();
    }return false;
 }



 public void insertTransaction(int custid, int accCode, String clerkCode, String kubun, String status){
String sql = "INSERT INTO Transaction(custid, account_code, clierk_code, kubun, trans_Date, status) " +
    "VALUES (?,?,?,?,?,?)";
try(Connection conn = DBUtil.getConnection();
PreparedStatement pstmt = conn.prepareStatement(sql)){
pstmt.setInt(1, custid);
pstmt.setInt(2, accCode);
pstmt.setString(3, clerkCode);
pstmt.setString(4, kubun);
pstmt.setString(5, LocalDate.now().toString());
pstmt.setString(6, status);
pstmt.executeUpdate();
}
catch(SQLException e){
e.printStackTrace();
}
  }


}
