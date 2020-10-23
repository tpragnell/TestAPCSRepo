import java.util.Arrays;
import java.lang.Math;

public class Demo{
  public static void printLoop(int n){
    for(int i = 1; i <= n; i++){
      for(int j = 0; j <= n-i; j++){
         System.out.print(i); //prints out rectangular shaped numbers (like the example above)
      }
      System.out.println();
    }
  }

  public static String arrToString(int[] arr){
    int len = arr.length;
      if(len == 0)
        return "{}";
      String s = "{";
      for(int i = 0; i<len-1; i++){
        s = s + arr[i] + ", ";
      }
      s = s + arr[len-1] + "}";
      return s;
  }

  public static String arrayDeepToString(int[][] arr){
    int len = arr.length;
    if(len == 0)
      return "{}";
    String s = "{";
    for(int i=0; i<len-1; i++){
      s = s + arrToString(arr[i]) + ", ";
    }
    s = s + arrToString(arr[len-1]) + "}";
    return s;
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue){
    int[][] array = new int[rows][cols];
    int range = maxValue + 1;
    for(int i=0; i<rows; i++){
      for(int k=0; k<cols; k++){
        int s = (int) (Math.random() * range);
        array[i][k] = s;
      }
    }
    return array;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
    int rangeCols = cols + 1;
    int[][] array = new int[rows][];
    int range = maxValue + 1;
    for(int i=0; i<rows; i++){
      int randCols = (int) (Math.random() * rangeCols);
      int[] a = new int[randCols];
      for(int k=0; k<randCols; k++){
        int s = (int) (Math.random() * range);
        a[k] = s;
      }
      array[i] = a;
    }
    return array;

  }

  public static void main(String[] args) {
    // Test printLoop
    // int n = 5;
    // if(args.length != 0)
    //   n = Integer.parseInt(args[0]);
    // printLoop(n);

    // Test arrayDeepToString
    // int[][] array ;
    // array = new int[][]{{1,2,3,4,5},{6,7,8,9,0}};
    // System.out.println(arrayDeepToString(array));

    //Test create2DArray
    System.out.println(arrayDeepToString(create2DArray(5,4,4)));
    System.out.println(arrayDeepToString(create2DArray(6,2,3)));

    //Test create2DArrayRandomized
    System.out.println(arrayDeepToString(create2DArrayRandomized(6,4,4)));
    System.out.println(arrayDeepToString(create2DArrayRandomized(4,10,100)));
  }
}
