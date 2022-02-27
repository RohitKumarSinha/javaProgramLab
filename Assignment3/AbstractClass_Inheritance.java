import java.util.Scanner;
abstract class Shape
{
	abstract double area(double width, double height);
	double area;
}
class Triangle extends Shape
{
	double area(double width, double height)
	{
		area = (width*height)/2;
		System.out.println("Area of Triangle: "+area);
		return area;
	}
}
class Rectangle extends Shape
{
	double area(double width, double height)
	{
		area = width *height;
		System.out.println("Area of Rectangle:"+ area);
		return area;
	}
}
class AbstractClass_Inheritance
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter width of Rectangle: ");
		double width = s.nextDouble();
		System.out.println("Enter height of Rectangle: ");
		double height = s.nextDouble();
		Rectangle rect = new Rectangle();
		rect.area(width,height);//Area of Rectangle


		System.out.println("\nEnter base/width of Triangle: ");
		double trWidth = s.nextDouble();
		System.out.println("Enter height of Triangle: ");
		double trHeight = s.nextDouble();

		Triangle tr = new Triangle();
		tr.area(trWidth,trHeight);//Area of Triangle
	}
}
