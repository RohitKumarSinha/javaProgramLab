import java.util.Scanner;
interface Shape
{
	final double PI =3.14;
	abstract double area();
}
class Sphere implements Shape
{
	double Radius;
	double res;
	Sphere(double r)
	{
		this.Radius = r;
	}
	public double area()
	{
		res=(4*PI)*(Radius*Radius);
		System.out.println("Area of Sphere: "+res);
		return res;
	}
}

class Circle implements Shape
{
	double Radius;
	double res;
	Circle(double r)
	{
		this.Radius = r;
	}
	public double area()
	{
		res=PI*(Radius*Radius);
		System.out.println("Area of Circle: "+res);
		return res;
	}
}
class CalculateArea_Interface_Final
{
	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		System.out.println("Q5. Define an Interface Shape with abstract method area()."
		+"Write a java program to calculate area of Circle and Sphere.(use final keyword)");
		System.out.println("\nPlease enter Radius of Circle: ");
		double CircleRed =Double.valueOf(s.nextLine());
		Circle c = new Circle(CircleRed);
		c.area();

		//Sphere
		System.out.println("\n\nPlease enter Radius of Sphere: ");
		double CylinderRed = Double.valueOf(s.nextLine());
		Sphere sp = new Sphere(CylinderRed);
		sp.area();
	}
}