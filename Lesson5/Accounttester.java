public class Accounttester {
  public static void main(String[]args){
    Account account1 = new Account (3424,72.0);
    System.out.println(account1.getAccountNumber());
    System.out.println(account1.getBalance());
    account1.setBalance(72.9);
    account1.debit(4.0);
        System.out.println(account1.getBalance());
    account1.credit(11.2);
        System.out.println(account1.getBalance());
    System.out.println(account1.getBalance());
    System.out.println(account1);
  }
}
