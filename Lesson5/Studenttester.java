public class Studenttester {
  public static void main(String[]args){
    Student student1 = new Student ("Bob","8 Park Street");
    System.out.println(student1.getName());
    System.out.println(student1.getAddress());
    student1.setAddress("9 Park Avenue");
    System.out.println(student1.toString());
    student1.addCourseGrade("Math",99);
    student1.printGrades();
    System.out.println(student1.getAverageGrade());
  }
}
