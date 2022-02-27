import java.util.Scanner;
class AreaPI
{
	final double pi= 3.14;
}
class Circle extends AreaPI
{
	double Radius;
	double res;

	Circle(double r)
	{
		this.Radius = r;
		//super();
	}
	double getArea()
	{
		res=super.pi*(Radius*Radius);
		System.out.println("Area of Circle: "+res);
		return res;
	}
}
class Cylinder extends AreaPI
{
	double Radius;
	double height;
	double res;

	Cylinder(double r,double h)
	{
		this.Radius = r;
		this.height=h;
		//super();
	}
	double getArea()
	{
		//2prh+2pr2
		res=(2*super.pi*Radius*height)+(2*super.pi*Radius*Radius);
		System.out.println("Area of Cylinder: "+res);
		return res;
	}
}
class calculateArea_Use_Super
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("\nPlease enter Radius of Circle: ");
		double CircleRed =Double.valueOf(s.nextLine());

		Circle c = new Circle(CircleRed);
		c.getArea();
		//Cylinder
		System.out.println("\n\nPlease enter Radius of Cylinder: ");
		double CylinderRed = Double.valueOf(s.nextLine());

		System.out.println("Please enter height of Cylinder: ");
		double height =Double.valueOf(s.nextLine());
		Cylinder cy = new Cylinder(CylinderRed,height);
		cy.getArea();

	}
}