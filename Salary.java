import java.util.Scanner;
class Salary
{
	public static void main(String arg[])	
	{
	    double s,da, hra, tada, it, totalSalary;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter salary");
	    s=sc.nextDouble();
	    
	     da = 50*(s/100);
	     hra = 18*(s/100);
	     tada = 5*(s/100);
	     it = 10*(s/100);
	     totalSalary = s + da + hra + tada + it ;
	     System.out.println("Net Salary is = "+ totalSalary);
       }
}

