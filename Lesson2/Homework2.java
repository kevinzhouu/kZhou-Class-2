public class Homework2 {
  public static void main(String[]args){
    int grade = 74;
    if (grade>=61){
      System.out.println("D");
    }
    else if (grade>=71){
      System.out.println("C");
    }
    else if (grade>=81){
      System.out.println("B");
    }
    else if (grade>=91){
      System.out.println("A");
    }
    else {
      System.out.println("F");
    }
      PrintMultiples(60);
      PrintIntegerLineCommands(1,2,3);
      PrintChangeBase(7);
      PrintFindMedian(1,3,6,4,5);
  }
  public static void PrintMultiples (int a){
    boolean multiple3;
    boolean multiple4;
    for (int x = 1;x<=a;x++){
      if (x/3 * 3 == x){
        multiple3=true;
      }
      else {
        multiple3=false;
      }
      if (x/4 * 4 == x){
        multiple4=true;
      }
      else {
        multiple4=false;
      }
      if (multiple3==true){
        if (multiple4==false){
        System.out.println(x);
        }
      }
      if (multiple4==true){
        if (multiple3==false){
        System.out.println(x);
        }
      }
    }
  }
  public static void PrintIntegerLineCommands(int a,int b,int c){
    boolean distinct1=false;
    boolean distinct2=false;
    boolean distinct3=false;
    if (a==b){
      distinct1=true;
    }
    else if (b==c){
      distinct2=true;
    }
    else if (a==c){
      distinct3=true;
    }
    if (distinct1 == true){
      if (distinct2==true){
        if (distinct3==true){
          System.out.println(1);
        }
      }
    }
    if (distinct1 == false){
      if (distinct2==false){
        if (distinct3==true){
          System.out.println(2);
        }
      }
    }
    if (distinct1 == false){
      if (distinct2==false){
        if (distinct3==false){
          System.out.println(3);
        }
      }
    }
  }
  public static void PrintChangeBase(int y){
    int [] arr = new int[5];
    int i = 0;
    while (y>0){
      arr[i]=y%2;
      i++;
      y=y/2;
    }
    for(int j=0;j<5;j++){
    System.out.println(arr[j]);
    }
  }
  public static void PrintFindMedian(int k,int l,int m,int n,int o){
    int [] arr = new int[5];
    arr[0]=k;
    arr[1]=l;
    arr[2]=m;
    arr[3]=n;
    arr[4]=o;
    int minimum1 = 1000;
    int minindex1 = 0;
    for(int i=0;i<5;i++){
      if (arr[i]<minimum1){
        minimum1 = arr[i];
        minindex1 = i;
      }
    }
    int minimum2 = 1000;
    int minindex2 = 0;
    for(int i=0;i<5;i++){
      if (i!=minindex1){
        if (arr[i]<minimum2){
          minimum2 = arr[i];
          minindex2 = i;
        }
      }
    }
    int minimum3 = 1000;
    int minindex3 = 0;
    for(int i=0;i<5;i++){
      if (i!=minindex1){
        if (i!=minindex2){
          if (arr[i]<minimum3){
            minimum3 = arr[i];
            minindex3 = i;
          }
        }
      }
    }
    System.out.println(arr[minindex3]);
  }
}
