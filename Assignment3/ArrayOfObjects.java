import java.util.Scanner;
class Teacher
{
	double Id;
	String TName;
	String Designation;
	double Salary;
	String Subject;
}
class ArrayOfObjects
{
	static void printTeacher(Teacher[] teachers,String subject)
	{

		if(!subject.equals(""))
			System.out.println("Teachers Detail who are teaching "+subject+": \n");
		else
			System.out.println("Teachers Detail are : ");

		for(int i = 0;i<teachers.length;i++)
		{
			Teacher t = teachers[i];
			if(!subject.equals(""))
			{
				if(subject.toUpperCase().trim().equals(t.Subject.toUpperCase()))
				{
					System.out.println("Id : "+t.Id);
					System.out.println("Name : "+t.TName);
					System.out.println("Designation : "+t.Designation);
					System.out.println("Salary : "+t.Salary);
					System.out.println("Subject : "+t.Subject+"\n");
					System.out.println("-------------*-------------*---------");
				}
			}
			else
			{
				System.out.println("Id : "+t.Id);
				System.out.println("Name : "+t.TName);
				System.out.println("Designation : "+t.Designation);
				System.out.println("Salary : "+t.Salary);
				System.out.println("Subject : "+t.Subject+"\n");
				System.out.println("-------------*-------#------*---------");
			}
		}
	}



	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter no of employees:");
		int empCount =s.nextInt();
		s.nextLine();
		Teacher[] teachers = new Teacher[empCount];

		for(int i = 0;i<empCount;i++)
		{
			Teacher t = new Teacher();
			System.out.println("\n\nPlease enter teacher ID:");
			t.Id = Double.valueOf(s.nextLine());
			System.out.println("Please enter teacher Name:");
			t.TName =s.nextLine().trim();
			System.out.println("Please enter teacher Designation:");
			t.Designation= s.nextLine().trim();

			System.out.println("Please enter teacher Salary:");
			t.Salary = Double.valueOf(s.nextLine());
			System.out.println("Please enter teacher Subject:");
			t.Subject = s.nextLine().trim();
			teachers[i] = t;
		}
		printTeacher(teachers,"Java");
	}
}	