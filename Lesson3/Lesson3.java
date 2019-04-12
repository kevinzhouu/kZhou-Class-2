public class Lesson3 {
  public static void main(String[]args){
    int [] arr = new int[10];
    /* 1,2,3,4,5,6,7,8,9,10
    zero based indexing: 1=position 0 */
    for (int i=0;i<arr.length;i++){
      arr[i]=i+1;
      //System.out.println(arr[i]);
      System.out.print(arr[i]+",");
    }
    System.out.println(); //prints empty new line
    //int [] arr = new int[]{13,4,7,5,9};
    int [][] arr2 = new int[][]{
      {13,3,5,1},
      {7,17,23,14},
      {12,-1,56,101},
      {32,3,15,2} //no comma because not expecting anything
    };
    // arr.length = number of rows
    // arr[0].length = number of columns
    System.out.println(arr2[1][3]);
    /* Java Conventions
    returnPrime() lowercase then uppercase
    variable names are lowercase; e.g int i = 1
    snakecase (use when creating a variable with multiple words);e.g. true_flag
    */
  }
}
