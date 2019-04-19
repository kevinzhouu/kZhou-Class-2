public class Author {
  String name;
  String email;
  char gender;
  public Author (){
    name = "Sarah";
    email = "sarah@gmail.com";
    gender = 'f';
  }
  public Author (String x, String y, char z){
    name = x;
    email = y;
    gender = z;
  }
  public String getName (){
    return name;
  }
  public String getEmail (){
    return email;
  }
  public void setEmail (String n) {
    email = n;
  }
  public char getGender () {
    return gender;
  }
  public String toString () {
    return name + " (" + gender + ") at" + email;
  }
}
