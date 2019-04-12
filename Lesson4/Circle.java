public class Circle {
  double radius;
  String color;
  public Circle (){
    radius = 1.0;
    color = "red";
  }
  public Circle (double x) {
    radius = x; color = "red";
  }
  public Circle (double x, String y) {
    radius = x; color = y;
  }
  public double getRadius () {
    return radius;
  }
  public String getColor () {
    return color;
  }
  public double getArea () {
    return radius*radius*3.14;
  }
  public double getCircumfrence () {
    return 2*radius*3.14;
  }
  public String toString (String x){
     return ("Circle[radius=%f][color=%s]");
  }
  public double setRadius (double x) {
    radius = x;
    return radius;
  }
  public String setColor (String y) {
    color = y;
    return color;
  }
}
