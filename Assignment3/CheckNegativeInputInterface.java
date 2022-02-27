import java.util.Scanner;
/*
Define an Interface “Integer” with a abstract method check().Write a Java program to
check whether a given number is Positive or Negative.
*/
interface _Integer
{
	abstract boolean check(int num);
}
class CheckNegativeInputInterface implements _Integer
{
	public boolean check(int number)
	{
		if(number<0)
			return false;
		else
			return true;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("\nPlease enter number:\n");
		int n = s.nextInt();

		if(new CheckNegativeInputInterface().check(n))
			System.out.println("\nEntered number is Positive: "+n);
		else
			System.out.println("\nEntered number is Negative: "+n);

	}
}