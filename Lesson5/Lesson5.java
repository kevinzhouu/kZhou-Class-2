public class Example{
  public static void main(String[]args){
    Circle C1 = new circle();
    String str = new String();
    Circle C2 = new circle (3.0);
    Circle C3 = new circle (1.0,"Blue");
  }
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
    }
    public String setColor (String y) {
      color = y;
    }
  }
}
