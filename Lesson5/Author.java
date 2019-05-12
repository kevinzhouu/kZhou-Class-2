public class Author {
  String name;
  String email;
  char gender;
  boolean age;
  public Author (){
    name = "Sara";
    email = "sara@gmail.com";
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
  public void setEmail (String email) {
    this.email = email;
  }
  public char getGender () {
    return gender;
  }
  public String toString () {
    return name + " (" + gender + ") at" + email;
  }
  /*public void setAge (boolean age) {
    this.age = age;
  }
  public boolean compareAge(Author a2){
    if (this.age>=a2.age){

    }
    else {

    }
  }*/
}
