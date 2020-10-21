public class Demo{
  public static void printLoop(int n){
    for(int i = 1; i <= n; i++){
      for(int j = 0; j <= n-i; j++){
         System.out.print(i); //prints out rectangular shaped numbers (like the example above)
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n = 5;
    if(args.length != 0)
      n = Integer.parseInt(args[0]);
    printLoop(n);
  }
}
