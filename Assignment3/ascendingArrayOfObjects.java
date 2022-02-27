import java.util.Scanner;

class Doctor
{
	double Dno;
	String Dname,  Qualification,  Specialization;

	Doctor(double did, String dname,String qua, String Spec)
	{
		this.Dno = did;
		this.Dname = dname;
		this.Qualification = qua;
		this.Specialization = Spec;
	}
}

class ascendingArrayOfObjects
{

	static void printAscendingArray(Doctor[] docs)
	{
			for(int i = 0;i<docs.length;i++)
			{
				for(int j = i;j<docs.length;j++)
				{
					if(docs[i].Dname.toUpperCase().trim().compareTo(docs[j].Dname.toUpperCase().trim()) > 0)
					{
							Doctor tempDoc = docs[i];
							docs[i] =	docs[j];
							docs[j] = tempDoc;
					}
				}
			}
			System.out.println("\n\nDoctors detail in Ascending order:\n");
			for(int i = 0;i<docs.length;i++)
			{
					System.out.println("--------------*------#"+(i+1)+"#---------*------------\n");
					Doctor d = docs[i];
					System.out.println("Doctor Id: "+(int)d.Dno);
					System.out.println("Doctor Name: "+d.Dname);
					System.out.println("Doctor Qualification: "+d.Qualification);
					System.out.println("Doctor Specialization: "+d.Specialization+"\n");
			}
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter no of Doctors:");
		int docCount = s.nextInt();
		s.nextLine();

		Doctor[] doctors = new Doctor[docCount];

		for(int i = 0;i<docCount;i++)
		{
			System.out.println("\nPlease enter details: "+(i+1)+"\n");
			System.out.println("Please enter Doctor ID:");
			double id =Double.valueOf(s.nextLine());
			System.out.println("Please enter Doctor Name:");
			String name =s.nextLine();
			System.out.println("Please enter Doctor Qualification:");
			String qua =s.nextLine();
			System.out.println("Please enter Doctor Specialization:");
			String sp =s.nextLine();
			Doctor d = new Doctor(id,name,qua,sp);
			doctors[i]=d;
		}
		printAscendingArray(doctors);
	}
}