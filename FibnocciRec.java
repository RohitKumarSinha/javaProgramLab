import java.util.Scanner;
 
public class FibnocciRec {
  public static void main(String[] args) {
  
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of the term");
    int n = in.nextInt();
 
    for(int i=1; i<=n; i++){
      System.out.print(fibo(i)+"\n");
    }
  }
 
 
 public static int fibo(int n){
    if(n == 1){
      return 0;
    }
    
    else if(n == 2){
      return 1;
    } 
    
    else {
      return fibo(n-2)+fibo(n-1);
    }
  }
}
