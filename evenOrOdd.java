import java.util.Scanner;
class evenOrOdd
{
  public static void main(String args[])
  {
    
    int firstNum;
    System.out.println("Enter an Integer number:");

    Scanner input = new Scanner(System.in);
    firstNum = input.nextInt();


    if ( firstNum % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }
}
