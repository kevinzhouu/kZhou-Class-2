public class Homework {
  public static void main(String[]args){
    for(int x=50;x<=100;x+=2){
        System.out.println(x);
    }
    int s = 48;
    while (s<=98){
      s+=2;
      System.out.println(s);
    }
    int b = 0;
    for (int a=1;a<=10;a++){
      b += a;
    }
    System.out.println(b);
    int y = 0;
    int c = 0;
    while (c<=9){
      c++;
      y += c;
    }
    System.out.println(y);
    int n1 = 1;
    System.out.println(n1);
    int n2 = 1;
    System.out.println(n2);
    int n3;
    for(int w=3;w<=10;w++){
      n3 = n1 + n2;
      System.out.println(n3);
      n1 = n2;
      n2 = n3;
    }
    int m = 1;
    System.out.println(m);
    int p = 1;
    System.out.println(p);
    int k;
    int w = 2;
    while (w<=9){
      w++;
      k = m + p;
      System.out.println(k);
      m = p;
      p = k;
    }
  }
}
