public class Student {
  String name;
  String address;
  int numCourses = 0;
  String[] courses  = new String[30];
  int[] grades = new int[30];
  public Student () {
    numCourses = 0;
    name = "Kevin";
    address = "3 Park Lane";
  }
  public Student (String a, String b) {
    name = a;
    address = b;
  }
  public String getName () {
    return name;
  }
  public String getAddress () {
    return address;
  }
  public void setAddress (String x){
    address = x;
  }
  public String toString (){
    return name + " (" + address + ")";
  }
  public void addCourseGrade (String m, int n){
    courses[numCourses] = m;
    grades[numCourses] = n;
    numCourses++;
  }
  public void printGrades () {
    for (int i = 0;i<30;i++){
      System.out.println(name + " " + courses[i] + ":" + grades[i]);
    }
  }
  public Double getAverageGrade (){
    Double sum = 0.0;
    for (int i = 0;i<numCourses+1;i++){
      sum+=grades[i];
    }
    return sum/(numCourses);
  }
}
