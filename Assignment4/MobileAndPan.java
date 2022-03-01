import java.util.*; import java.io.*;
class InvalidDataException extends Exception
{
InvalidDataException(String s)
{
super(s);
}
}
class MobileAndPan
{
static void checkPan(String pan)throws InvalidDataException
{
if (pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
{
System.out.println("It is a valid PAN number");
}
else
{
throw new InvalidDataException("ENTER A VALID PANNUMBER");
}
}
static void checkNum(String num)throws InvalidDataException
{
if(num.toString().matches("(0/91)?[7-9][0-9]{9}")) System.out.println("Phone number is valid");
else
throw new InvalidDataException("ENTER A VALID MobileNumber");
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); System.out.println("Enter a 10 digit mobile num"); String num = sc.nextLine(); System.out.println("Enter a pan num");
String pan = sc.nextLine(); try
{
checkPan(pan); checkNum(num);
}
catch(Exception e)
{
System.out.println(e);
}
}
}