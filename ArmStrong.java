import java.util.Scanner;
public class ArmStrong {
   public static void main(String args[]) {
      int num;
      int check, rem, sum = 0;
      System.out.println("Enter the number :");
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();
      check = num;
      while(check != 0) {
         rem = check % 10;
         sum = sum + (rem * rem * rem);
         check = check / 10;
      }
      if(sum == num)
         System.out.println("It is an armstrong number.");
      else
         System.out.println("It is not an armstrong number.");
   }
}
