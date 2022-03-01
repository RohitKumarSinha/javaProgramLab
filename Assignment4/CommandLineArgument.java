import java.util.*; import java.io.*;
class NumberNotEntered extends Exception
{
NumberNotEntered(String s)
{
super(s);
}
}
class CommandLineArgument
{
static void check(String num1, String num2)throws NumberNotEntered
{
if(num1.isEmpty()|| num2.isEmpty())
throw new NumberNotEntered("\nNumber should not be null"); else
{
System.out.print("number = "+num1);
System.out.print("\nnumber = "+num2);
}
}
static void divide(int n1, int n2 )throws ArithmeticException
{
double ans = n1/n2; System.out.print("\nThe division is: "+ans);
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); String num1 = sc.nextLine();
String num2 = sc.nextLine(); int n1 = sc.nextInt();
int n2 = sc.nextInt(); try
{
check(num1,num2); System.out.println(); divide(n1,n2);
}
catch(Exception e)
{
System.out.println(e);
}
}
}