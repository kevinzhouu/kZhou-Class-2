//instance-instantiation of a class
public class Student {
  int grade;
  String first;
  public Student (String f, int g){
    grade = g;
    first = f;
  }
  public int getGrade(){
    return grade;
  }
  public String toString (){
    return "Student name:" + first;
  }
}
