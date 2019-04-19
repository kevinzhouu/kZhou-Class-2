public class Authortester {
  public static void main(String[]args){
    Author author1 = new Author ("Josh", "josh@gmail.com",'f');
    System.out.println(author1.getName());
    System.out.println(author1.getEmail());
    author1.setEmail("josh1@gmail.com");
    System.out.println(author1.getGender());
    System.out.println(author1.toString());
    System.out.println(author1);
  }
}
