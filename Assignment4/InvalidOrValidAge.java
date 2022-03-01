import java.util.*;
class InvalidAgeException extends Exception
{
InvalidAgeException(String s)
{
super(s);
}
}
class InvalidOrValidAge
{
static int age; static Scanner sc;
static void vote(int age)throws InvalidAgeException
{
if(age<18)
{
throw new InvalidAgeException("NOT VALID AGE");
}
else
{
System.out.println("Welcome to vote");
}
}
public static void main(String[] args)
{
sc = new Scanner(System.in); System.out.println("Enter your age: "); age = sc.nextInt();
try
{
vote(age);
}
catch(Exception e)
{
System.out.println("Throwing my own exception: "+e);
}
}
}
