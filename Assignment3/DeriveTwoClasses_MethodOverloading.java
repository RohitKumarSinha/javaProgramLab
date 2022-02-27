import java.util.Scanner;
abstract class Shape
{
	abstract double calc_area();
	abstract double calc_volume();
	final double PI = 3.14;
}
class Sphere extends Shape
{
	double radius;
	Sphere(double r)
	{
		this.radius = r;
	}
	double calc_area()
	{
		return (4*PI*(radius*radius));
	}
	double calc_volume()
	{
		return (((4.0/3.0)*PI)*(radius*radius*radius));
	}
}
class Cone extends Shape
{
	double radius;
	double height;
	Cone(double r,double h)
	{
		this.radius = r;
		this.height = h;
	}
	double calc_area()
	{
		double slHeight = Math.sqrt(Math.pow(height,2)+Math.pow(radius,2));
		return ((PI * radius * slHeight) + (PI * (radius*radius)));
	}
	double calc_volume()
	{
		return PI*(radius*radius)*height/3;
	}
}
class DeriveTwoClasses_MethodOverloading
{
		public static void main(String[] args)
		{
			Scanner  s = new Scanner(System.in);
			System.out.println("Please enter radius of Cone: ");
			double r = Double.valueOf(s.nextLine());
			System.out.println("Please enter height of Cone: ");
			double h = Double.valueOf(s.nextLine());
			Shape c =(Shape) new Cone(r,h);
			System.out.println("Area of Cone: "+String.format("%.2f", c.calc_area()));
			System.out.println("Volume of Cone: "+String.format("%.2f",c.calc_volume()));



			System.out.println("\n\nPlease enter radius of Sphere: ");
			double spr = Double.valueOf(s.nextLine());
			Shape sp = (Shape) new Sphere(spr);
			System.out.println("Area of Sphere: "+String.format("%.2f", sp.calc_area()));
			System.out.println("Volume of Sphere: "+String.format("%.2f", sp.calc_volume()));
		}
}