import java.util.Scanner;
class Member
{
	String Name;
	int Age;
	String Mobile;
	String Address;
	double Salary;
	Member(String n, int a, String m, String add, double sal)
	{
		this.Name =n;
		this.Age =a ;
		this.Mobile =m;
		this.Address = add;
		this.Salary = sal;
	}
}
class Employee extends Member
{
	String Specialization;
	Employee(String spe,String n, int a, String m, String add, double sal)
	{
		super(n,a,m,add,sal);
		this.Specialization = spe;
	}
	void printSalary()
	{
		System.out.println("\nEmployee Name: "+super.Name);
		System.out.println("Age: "+super.Age);
		System.out.println("Mobile: "+super.Mobile);
		System.out.println("Address: "+super.Address);
		System.out.println("Salary: "+super.Salary);
		System.out.println("Specialization: "+Specialization);
	}
}
class Manager extends Member
{
	String Department;
	Manager(String dept,String n, int a, String m, String add, double sal)
	{
		super(n,a,m,add,sal);
		this.Department = dept;
	}
	void printSalary()
	{
		System.out.println("\nManager Name: "+super.Name);
		System.out.println("Age: "+super.Age);
		System.out.println("Mobile: "+super.Mobile);
		System.out.println("Address: "+super.Address);
		System.out.println("Salary: "+super.Salary);
		System.out.println("Department: "+Department);
	}
}
class Employee_Manager_Member
{
	static Member[] members;
	static int counter;
	static Scanner s;
	static void readEmployee()
	{
		System.out.print("\nPlease enter Employee Name:");
		String n = s.nextLine();
		System.out.print("Please enter Age:");
		int age = s.nextInt();
		s.nextLine();
		System.out.print("Please enter Mobile:");
		String m = s.nextLine();
		System.out.print("Please enter Address:");
		String add = s.nextLine();
		System.out.print("Please enter Salary:");
		double Sal = s.nextDouble();
		s.nextLine();
		System.out.print("Please enter Specialization:");
		String sp = s.nextLine();

		Member emp = new Employee(sp,n,age,m,add,Sal);
		members[counter] = emp;
	}

	static void readManager()
	{
		System.out.print("\nPlease enter Manager Name:");
		String n = s.nextLine();
		System.out.print("Please enter Age:");
		int age = s.nextInt();
		s.nextLine();
		System.out.print("Please enter Mobile:");
		String m = s.nextLine();
		System.out.print("Please enter Address:");
		String add = s.nextLine();
		System.out.print("Please enter Salary:");
		double Sal = s.nextDouble();
		s.nextLine();
		System.out.print("Please enter Department:");
		String dpt = s.nextLine();

		Member man = new Manager(dpt,n,age,m,add,Sal);
		members[counter] = man;
	}
	static void display()
	{
		System.out.println("\n--------------------****----------------Employees Detail:");
		for(int i=0;i<counter;i++)
			if(members[i]  instanceof Employee)
				((Employee)members[i]).printSalary();

		System.out.println("\n--------------------****----------------Managers Detail:");
		for(int i=0;i<counter;i++)
			if(members[i]  instanceof Manager)
				((Manager)members[i]).printSalary();

	}
	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		System.out.print("Please enter number of Details to Accept:");
		int n = s.nextInt();
		members = new Member[n];
		boolean isExit = false;
		while(!isExit && counter<n)
		{
			System.out.println("\n1: Add Employee.");
			System.out.println("2: Add Manager.");
			System.out.println("3: Display.");
			System.out.println("4: Exit.\n");
			System.out.println("Please enter Choice Code:");
			int c = s.nextInt();
			s.nextLine();
			switch(c)
			{
					case 1:
						readEmployee();
						break;
					case 2:
						readManager();
						break;
					case 3:
						display();
						break;
					case 4:
							isExit =true;
						break;
					default:
						System.out.println("Please enter Valid Choice Code..!");
						break;
			}
			counter++;
		}
	}
}