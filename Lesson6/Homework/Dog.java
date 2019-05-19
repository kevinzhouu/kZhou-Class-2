public class Dog extends Pet {
  public Dog (String name) {
    myName = "Dog" + name;
  }
  public String speak(){
    return "woof";
  }
  public String LoudDog(){
    return speak() + speak();
}
