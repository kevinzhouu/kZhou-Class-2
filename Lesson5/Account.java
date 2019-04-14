public class Account {
  int accountNumber;
  double Balance;
  public Account (){
    Balance=0.0;
  }
  public Account (int x,double y){
    accountNumber=x;
    Balance=y;
  }
  public Account (int a){
    accountNumber=a;
  }
  public int getAccountNumber(){
    return accountNumber;
  }
  public double getBalance(){
    return Balance;
  }
  public void setBalance (double n){
    Balance = n;
  }
  public void debit (double m){
    if (Balance>=m){
      Balance-=m;
    }
    else {
      System.out.println("amount withdrawn exceeds the current balance!");
    }
  }
  public void credit (double p){
    Balance+=p;
  }
  public String toString(){
    return "Account number:"+accountNumber+" Balance:"+Balance;
  }
}
