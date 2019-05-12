public class Authortester {
  public static void main(String[]args){
    Author author1 = new Author ("Josh", "josh@gmail.com",'m');
    System.out.println(author1.getName());
    System.out.println(author1.getEmail());
    author1.setEmail("josh1@gmail.com");
    System.out.println(author1.getGender());
    System.out.println(author1.toString());
    System.out.println(author1);
    /*Author a2 = new Author ();
    a2.setAge(21);
    author1.compareAge(a2);
    a2.compareAge(a1);*/
  }
}
