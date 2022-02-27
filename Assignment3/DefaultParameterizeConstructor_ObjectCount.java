import java.util.Scanner;
class Student
{
	int rollNo;
	String StudentName;
	static int objCount=0;

	//Parameterized ctr
	Student(int rno, String name)
	{
		this();
		this.rollNo =rno;
		this.StudentName=name;
	}
	//default ctr
	Student()
	{
		objCount++;
		System.out.println("Created Objects Count is: "+ objCount);
	}
	public String toString()
	{
		return ("-------------------*-------------------------\nStudent Roll No: "+rollNo+"\nStudent Name: "+StudentName);
	}
}
class DefaultParameterizeConstructor_ObjectCount
{
	public static void main(String[] args)
	{
		Student s1 = new Student(1,"Dnyaneshwar");
		Student s2 = new Student(2,"Ashish");
		Student s3 = new Student(3,"Rohit");
		System.out.println("\nAll objects values are: \n");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}