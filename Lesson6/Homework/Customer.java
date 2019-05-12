class Customer extends User {
  public String name;
  public String address;
  public String email;
  public String customerId;
  public Double accountBalance;
  public void register(){
    System.out.println("Type in"+name+address+email);
  }
  public void purchase(){
    System.out.println(customerId+accountBalance);
  }
}
