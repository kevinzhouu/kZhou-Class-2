/*String-object
int-primitive type
char-primitive type
boolean-primitive type*/

public class Example {
  public static void main(String[]args){
    String str = new String();
    Student student1 = new Student("Josh",80);
    //student1 is instance of student
    System.out.println(student1.getGrade());
    System.out.println(student1);
  }
}
