import java.util.Scanner;
abstract class Staff
{
	String MemeberName;
	String Address;
	String EmpType;
	Staff(String name,String address,String type)
	{
		MemeberName =name;
		Address =address;
		EmpType =type;
	}
}
class FullTimeStaff extends Staff
{
	String Departmet;
	Double Salary;

	FullTimeStaff(String name,String address, String departmet,double salary,String type)
	{
		super(name,address,type);
		this.Departmet=departmet;
		this.Salary=salary;
	}
	void display()
	{
		System.out.println("\nEmployee Name: "+super.MemeberName);
		System.out.println("Employee Address: "+super.Address);
		System.out.println("Departmet: "+Departmet);
		System.out.println("Salary: "+Salary+"\n");

	}
}
class PartTimeStaff extends Staff
{
	double numberOfHrs;
	double ratePerHour;

	PartTimeStaff(String name,String address,double rateHrs,double NoHrs,String type)
	{
		super(name,address,type);
		this.numberOfHrs=NoHrs;
		this.ratePerHour=rateHrs;
	}
	void display()
	{
		System.out.println("\nEmployee Name: "+super.MemeberName);
		System.out.println("Employee Address: "+super.Address);
		System.out.println("Number Of Hrs: "+numberOfHrs);
		System.out.println("Rate per Hrs (Rs.): "+ratePerHour+"\n");
	}
}
class TypeOfEmployee
{
	final static String FullTime="FULLTIME";
	final static String PartTime="PARTTIME";
}
class AbstractClass_Dynamic_ObjectCreation
{
	static Staff[] employees;
	static int counter=0;
	static Scanner s;

	static void DisplayOptions()
	{
		System.out.println("\n1: Add New Full Time Employee.");
		System.out.println("2: Add New Part Time Employee.");
		System.out.println("3: Display Employees.");
		System.out.println("4: Exit.");

	}
	static void ReadStaffDetails(String type)
	{
		if(counter>=employees.length)
		{
			System.out.println("Max details reached...! ");
			return;
		}
		System.out.println("\nPlease enter Employee Name: ");
		String name = s.nextLine();
		System.out.println("Please enter Employee Address: ");
		String addr = s.nextLine();
		if(type.equals(TypeOfEmployee.PartTime))
		{
			System.out.println("Please enter Number Of Hrs: ");
			double hrs = Double.valueOf(s.nextLine());
			System.out.println("Please enter Rate per Hrs: ");
			double rate = Double.valueOf(s.nextLine());
			//FullTimeStaff(String name,String address, String departmet,double salary,TypeOfEmployee type)
			Staff f = new PartTimeStaff(name,addr,rate,hrs,type);
			employees[counter] =f;
		}
		else
		{
			System.out.println("Please enter Departmet: ");
			String dept = s.nextLine();
			System.out.println("Please enter Salary: ");
			double salary  =Double.valueOf(s.nextLine());
			//FullTimeStaff(String name,String address, String departmet,double salary,TypeOfEmployee type)
			Staff p = new FullTimeStaff(name,addr,dept,salary,type);
			employees[counter] =p;
		}
		counter++;
	}
	static void DisplayStaff()
	{
		System.out.println("------------------------------\nFull Time staff details:\n------------------------------");
		for(int i=0;i<counter;i++)
			if(employees[i].EmpType.equals(TypeOfEmployee.FullTime))
				((FullTimeStaff)employees[i]).display();

		System.out.println("------------------------------\nPart Time staff details:\n------------------------------");
		for(int i=0;i<counter;i++)
			if(employees[i].EmpType.equals(TypeOfEmployee.PartTime))
				((PartTimeStaff)employees[i]).display();
	}
	public static void main(String[] args)
	{
		 s = new Scanner(System.in);
		System.out.println("Please enter No Employees:");
		int no = s.nextInt();
		s.nextLine();
		employees = new Staff[no];

		boolean isExit = false;
		while(!isExit)
		{
			DisplayOptions();
			System.out.println("\nPlease enter code:");
			int choice = s.nextInt();
			s.nextLine();
			switch(choice)
			{
					case 1:
							ReadStaffDetails(TypeOfEmployee.FullTime);
						break;
					case 2:
							ReadStaffDetails(TypeOfEmployee.PartTime);
						break;
					case 3:
							DisplayStaff();
						break;
					case 4:
						isExit =true;
						break;
					default:
						System.out.println("\nPlease enter valid Code...!");
						break;
			}
		}
	}
	}