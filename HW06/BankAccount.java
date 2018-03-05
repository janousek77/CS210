public class BankAccount {

  public static void main(String[] args){
    BankAccount one = new BankAccount("First one");
    one.deposit(500);
    one.transFee(5);
    one.withdraw(100);
    System.out.println("Name: " + one.getName()
                       + ", Balance: " + one.getBalance());
    System.out.println();
    one.transFee(1000.00);
    one.withdraw(370);
    System.out.println(one.toString());
  }

  private String name;
  private double balance;
  private double transactionFee;

  public BankAccount(String name){
    this.name = name;
    balance = 0;
    transactionFee = 0.00;
  }

  public void transFee(double fee){
    this.transactionFee = fee;
  }

  public double getBalance(){
    return balance;
  }

  public String getName(){
    return name;
  }

  public void deposit(double amount){
    if (amount > 0)
      balance+=amount;
  }

  public void withdraw(double amount){
    if((amount + transactionFee) <= balance){
      balance -= (amount + transactionFee);
    } else {
      System.out.println("Insufficent funds for withdrawal");
    }
  }

  public String toString(){
    return name + ", " + balance;
  }

}
