public class Lesson2{
  public static void main(String[]args){
    // printsum()
    /* int grade = 82; //always declare what type of variable it is
    if (grade>=65){
      System.out.println("pass");
    }
    else { //if (grade<=65)
      System.out.println("fail");
    }
    String light = new String("green");
    int speed = 60;
    if (light.equals("green")){
      speed = 60;
    }
    else if (light.equals("yellow")){
     speed = 30;
    }
    else {
      speed = 0;
    }
    System.out.println(speed);
    int x= 5;
    if (x==5){ //one equal sign means assignment and two equal signs means comparing, not assignment
      System.out.println("x is 5");
      }
    else {
      System.out.println("x is not 5");
    }
    printSum(15);*/
    System.out.println(args[0]);
    System.out.println(args[1]);
    printSum(5,10);
  }

  /*public static void printSum(int x){
    int total = 0;
    for (int i = 0;i<=x;i++){
      total += i;
    }
    System.out.println(total);
  } */
  public static void printSum(int a, int b){
    int total2 = 0;
    for (int x = a;x<=b;x++){
      total2 += x;
    }
    System.out.println(total2);
  }
  // int [] arr = new int[10]
  //                   size of array
}
