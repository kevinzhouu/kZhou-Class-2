import java.util.*;

class Lesson7 {
    public static int[] bubblesort(int arr[]){
    int tmp;
    int loop = arr.length-2;
    for (int j = 0;j<loop;j++){
      for(int i=0; i<arr.length-1; i++){
        if (arr[i]>arr[i+1]){
          tmp = arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=tmp;
        }
      }
    }
    return arr;
  }
  public static void main(String[]args){
    int[] arr = new int[]{3,4,5,7,8,2,1,6};
    System.out.println(Arrays.toString(bubblesort(arr)));
    System.out.println(Arrays.toString(insertion(arr)));
    System.out.println(Arrays.toString(selection(arr)));
  }
    public static int[] insertion (int arr[]){
      int tmp;
      for (int j = 1;j<arr.length;j++){
        for (int i = j;i>0;i--){
          if (arr[i]<arr[i-1]){
            tmp = arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=tmp;
          }
        }
      }
      return arr;
    }
    public static int[] selection (int arr[]){
      int tmp;
      int min;
      for (int i = 0;i<arr.length;i++){
        min = arr[i];
        for (int j = i+1;j<arr.length;j++){
          if (arr[j]<min){
            min = arr[j];
            tmp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=tmp;
          }
        }
        arr[i] = min;
      }
      return arr;
    }
}


















/*
Big O Notation

We are interested in how quickly an algorithm runs relative to the input of the problem.
Generally, we think of N as the input size (a list with N elements), but N could be the actual
input (such as when calculating the Nth term of a series, or the Nth prime.)

We do not care about an exact number of seconds. Instead, think along the lines:
"How MUCH LONGER does it take when we double N? And when we double N again?"

If the time stays the same, we say it runs in constant time.

If the time increases by a constant factor (double triple or something similar),
we say it runs in linear time. The constant (slope of the line) is not important.


We care about very large input sizes, we want to know how the algorithm behaves
as N gets "arbitrarily large."

O(n)
O(n^2)
*/



// Constant time O(1)
/*public int foo(int [] ary){
    return ary[0];
}
// Linear time O(n)
public int foo2(int [] ary){
    int total = 0;
    for( int i : ary){
      total += i;
    }
    return total;
}
// quadratic time O(n^2)
public int foo3(int [] ary){
    int total = 0;
    //outer loop runs N times.
    for( int i = 0; i < ary.length - 1; i++){
        //inner loop runs N times (on average)
        for( int j = 0 ; j < ary.length; j++){
          //Work Work Work
          total+=i+j+5;
        }
    }
    return total;
}

// quadratic time O(n^2)
public int foo4(int [] ary){
    int total = 0;
    //outer loop runs N times.
    for( int i = 0; i < ary.length - 1; i++){
        //inner loop runs N times (on average)
        for( int j = i+1 ; j < ary.length; j++){
          //Work Work Work
          total+=i+j+5;
        }
    }
    return total;
}

// (n-1) + (n-2) + ... + 1
// (n-1) * n / 2   = (n^2 - n )/ 2 <- O(n^2)

// Linear time O(n)
public int foo4(int [] ary){
    int total = 0;
    for( int i : ary){
      total += i;
    }
    for( int i : ary){
      total += i;
    }
    return total;
}


/*
These are all O(N)
2N+5
3N+200
N + 10000


Similarly:
4N^2
N^2 + 5N
2N^2 + 10N + 20
Are all considered to be just O(N^2)

*/
// O(log(n))
/*public static function1(int[]a){
    index = a.length() - 1;
    while(index > 0){
        System.out.println(a[index]);
        index = a.length/2;
    }
}

// 8 elemnts : runs 3
// 16 elements : runs run 4 times
// 32 elements : runs 5 times






public static void printAllNumbersThenAllPairSums(int[] numbers) {

  System.out.println("these are the numbers:");
  for (int number : numbers) {
      System.out.println(number);
  }

  System.out.println("and these are their sums:");
  for (int firstNumber : numbers) {
      for (int secondNumber : numbers) {
          System.out.println(firstNumber + secondNumber);
      }
  }

}



public static boolean contains(int[] haystack, int needle) {

  // does the haystack contain the needle?
  for (int n : haystack) {
      if (n == needle) {
          return true;
      }
  }

  return false;
}

public int Fibonacci(int number)
{
    if (number <= 1) return number;
    return Fibonacci(number - 2) + Fibonacci(number - 1);
}*/
