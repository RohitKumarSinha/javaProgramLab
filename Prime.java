import java.util.Scanner;
public class Prime {

  public static void main(String[] args) {

   int firstNum;
   Scanner s = new Scanner(System.in);
   System.out.println("Enter a Number");
   firstNum = s.nextInt();
    boolean flag = false;
    for (int i = 2; i <= firstNum / 2; ++i) {
      if (firstNum % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(firstNum + " is a prime number.");
    else
      System.out.println(firstNum + " is not a prime number.");
  }
}

