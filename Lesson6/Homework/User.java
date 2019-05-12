class User {
  public String userid;
  public String password;
  public Date registerDate;
  public void Login(){
    System.out.println("Type in"+userid+password+registerDate);
  }
}
class Order extends Customer {
  public String orderId;
  public Date date;
  public String customerName;
  public String customerId;
  public void placeOrder(){
    System.out.println(orderId+date+customerName+customerId);
  }
}
