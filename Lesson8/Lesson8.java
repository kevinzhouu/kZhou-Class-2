public class Lesson8{
  public static int fibonacci(int n){
    if (n == 1||n==2){
    return 1;
    }
  return fibonacci(n-1) + fibonacci(n-2);
  }
  public static void main (String[]args){
    System.out.println(fibonacci(8));
    System.out.println(palindrome("abca"));
    System.out.println(palindrome2("abca"));
  }
  public static boolean palindrome(String x){
    for (int i = 0;i<=x.length()/2 - 1;i++){
      if (x.charAt(i) != x.charAt(x.length()-1-i)){
        return false;
      }
    }
    return true;
  }
  public static boolean palindrome2 (String x){
    if (x.length() == 1){
        return true;
      }
    else if (x.length() == 2){
      if (x.charAt(0)!=x.charAt(1)){
        return false;
      }
      else{
        return true;
      }
    }
    else {
      if (x.charAt(0)!=x.charAt(x.length()-1)){
        return false;
      }
      else{
        return palindrome2(x.substring(1,x.length()-1));
      }
    }
  }
}
