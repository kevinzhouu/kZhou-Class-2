/* Inheritance extends a class to its child classes, allows the child class to inherit fields and methods of the parent class, and achieves code reusability*/
class Bird {
  public String reproduction = "egg";
  public String outerCovering = "bald";
  public void flyUp(){
    System.out.println("FlyingUp");
  }
  public void flyDown(){
    System.out.println("FlyingDown");
  }
}
class Eagle extends Bird {
  public String name = "Eagle";
  public int lifespan = 15;
}
