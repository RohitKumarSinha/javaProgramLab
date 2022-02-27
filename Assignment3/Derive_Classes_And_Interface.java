import java.util.Scanner;
interface Shapes
{
	public double area();
}
class Rectangle implements Shapes
{
	double height;
	double width;
	Rectangle()
	{
	}
	Rectangle(double h,double w)
	{
		this.height=h;
		this.width=w;
	}
	public double area()
	{
		return height*width;
	}
}
class Square extends Rectangle implements Shapes
{
	double side;
	public double area()
	{
		return side *side;
	}
	Square(double s)
	{
		this.side =s;
	}
}
class Circle implements Shapes
{
	double radius;
	final double PI = 3.14159;
	Circle(double r)
	{
		this.radius =r;
	}
	public double area()
	{
		return PI*(radius*radius);
	}
}
class Derive_Classes_And_Interface
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter Square Side Lenght: " );
		double side = s.nextDouble();
		Square sq = new Square(side);
		System.out.println("\nArea of Circle Is: "+sq.area()+"\n");

		System.out.println("-------------*---------\nPlease enter Rectangle height: " );
		double h = s.nextDouble();
		System.out.println("Please enter Rectangle Width: " );
		double w = s.nextDouble();
		Rectangle rec = new Rectangle(h,w);
		System.out.println("\nArea of Rectangle Is: "+rec.area()+"\n");

		System.out.println("-------------*---------\nPlease enter Radius of Circle: " );
		double r = s.nextDouble();
		Circle c = new Circle(r);
		System.out.println("\nArea of Circle Is: "+c.area());

	}
}