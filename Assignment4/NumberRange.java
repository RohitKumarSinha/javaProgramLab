import java.util.*;
class NumberOutOfRange extends Exception
{
NumberOutOfRange(String s)
{
super(s);
System.out.print("NUMBER OUT OF RANGE");
}
}
class NumberRange
{
static void check(int num) throws NumberOutOfRange
{
int add=0;
if (num>100)
throw new NumberOutOfRange("Number should be less than 100"); else
{
for(int i = 0 ; i<2;i++)
{
int digit,temp; digit = num%10; add += digit; num = num/10;
}
System.out.print("Sum is"+add);
}
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); int num = sc.nextInt();
try
{
check(num);
}
catch(Exception e)
{
System.out.println(e);
}
}
}