import java.util.Scanner;
class Employee
{
	private int MemberId;
	private String MemberName;
	private String Department;
	private double Salary;
	Scanner s;
	Employee()
	{
		s = new Scanner(System.in);
	}
	Employee(int id,String name, String dpt,double salary)
	{
		/*
		this.MemberId =id;
		this.MemberName=name;
		this.Department = dpt;
		this.Salary = salary;
		*/
	}
	void accept()
	{
		System.out.println("\nPlease enter Employee ID:");
		this.MemberId = s.nextInt();
		s.nextLine();
		System.out.println("Please enter Employee Name:");
		this.MemberName = s.nextLine();
		System.out.println("Please enter Department:");
		this.Department = s.nextLine();
		System.out.println("Please enter Salary:");
		this.Salary = Double.valueOf(s.nextLine());
		//this(id,name,department,salary);
	}
	void display()
	{
		System.out.println("\n----------------*-------------\nEmployee ID:"+MemberId);
		System.out.println("Employee Name:"+MemberName);
		System.out.println("Employee Department:"+Department);
		System.out.println("Employee Salary:"+Salary);
	}
	double getSalary()
	{
		return this.Salary;
	}

}
class Manager extends Employee
{
	private double Bonus;
	private double total;
	Manager()
	{
	}
	Manager(double bonus)
	{
		//this.Bonus =bonus;
	}
	void accept()
	{
		super.accept();
		System.out.println("Please enter Manager Bonus: ");
		this.Bonus = Double.valueOf(s.nextLine());
	}
	void display()
	{
		super.display();
		System.out.println("Employee Bonus:"+Bonus);
		System.out.println("Total Salary + Bonus:"+getSalaryBonus()+"\n----------------*-------------");

	}
	double getSalaryBonus()
	{
		total =this.Bonus+ getSalary();
		return total;
	}
}
class Employee_Manager
{
	static Scanner s;
	static Employee[] emps;
	static int counter = 0;

	static Manager getMaxSalaryBonus()
	{
		Manager max = (Manager)emps[0];

		for(int i =1;i<counter;i++)
			if(max.getSalaryBonus()< ((Manager)emps[i]).getSalaryBonus())
				max =(Manager)emps[i];

		return max;
	}

	static void display()
	{
		System.out.println("\nEmployee details having max salary+  Manager Bonus: ");
		Manager m = getMaxSalaryBonus();
		if(m!=null)
			m.display();
	}

	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		System.out.println("Please enter no of Details to add: ");
		int n = s.nextInt();
		s.nextLine();
		emps = new Employee[n];
		int i =0;
		for(i =0;i<n;i++)
		{

			Employee m = new Manager();
			m.accept();
			emps[i] = m;
		}
		counter =i;
		display();
	}
	}