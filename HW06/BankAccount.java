/*
    Chris Janousek
	 CS210 Assignment HW05 chapter 8 #11
    2/7/2018
*/

public class BankAccount {

  public static void main(String[] args){
    BankAccount one = new BankAccount("First one");
    one.deposit(500);
    one.withdraw(100);
    one.transactionFee(5);
    System.out.println("ID: " + one.getID()
                       + ", Balance: " + one.getBalance()
                       + ", Transactions: " + one.getTransactions());
    System.out.println();
    one.withdraw(370);
    one.transactionFee(5);
    System.out.println("ID: " + one.getID()
                       + ", Balance: " + one.getBalance()
                       + ", Transactions: " + one.getTransactions());
  }

  private String id;
  private double balance;
  private int transactions;

  // Answer
  public boolean transactionFee(double fee) {
      double amount = (fee * transactions * (transactions + 1)) / 2;
      if(balance > amount) {
          balance -= amount;
          return true;
      } else {
      balance = 0;
      return false;
    }
  }

  public BankAccount(String id){
    this.id = id;
    balance = 0;
    transactions = 0;
  }

  public double getBalance(){
    return balance;
  }

  public String getID(){
    return id;
  }

  public int getTransactions(){
    return transactions;
  }

  public void deposit(double amount){
    if(amount <= 500)
      balance+=amount;
      transactions++;
  }

  public void withdraw(double amount){
    if(amount <= balance)
      balance -= amount;
      transactions++;
  }
}
