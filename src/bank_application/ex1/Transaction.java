package bank_application.ex1;

public class Transaction {

  private Client client;
  private Account account;
  private Clierk clierk;
  private Kubun kubun;
  private String trans_Date;
  private Status status;

  public Transaction(Client client, Account account, Clierk clierk) {
    this.client = client;
    this.account = account;
    this.clierk = clierk;
  }
}
