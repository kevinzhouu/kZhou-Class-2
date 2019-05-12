/*An abstract class is a class that can't be instantiated
You need to instantiate one of its child classes if you want to create a new object
It can have both abstract and concrete methods
It is defined with the abstract keyword*/
//move and eat are abstract methods
abstract class Animal {
  abstract void move ();
  abstract void eat ();
  void label(){
    System.out.println("I'm an animal");
  }
}
class Bird extends Animal {
  void move (){
    System.out.println("Fly");
  }
  void eat (){
    System.out.println("Worms");
  }
}
class Fish extends Bird {
  void move (){
    System.out.println("Swim");
  }
  void eat (){
    System.out.println("Smaller fish");
  }
}
