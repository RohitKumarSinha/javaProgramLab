abstract class Example
{
protected static final double PI =3.14 ; abstract void dispatch();
}
class Rectangle extends Example
{
int len,bed;
Rectangle(int len, int bed)
{
this.len = len; this.bed = bed;
}
void dispatch()
{
double area = len*bed; System.out.print("\nArea of Rectangle: "+area);
}
}
class Circle extends Example
{
int radius; Circle(int radius)
{
this.radius = radius;
}
void dispatch()
{
double area = PI*radius*radius; System.out.print("\nArea of circle: "+area);
}
}
class Ellipse extends Example
{
int a,b;
Ellipse(int a , int b)
{
this.a = a; this.b = b;
}
void dispatch()
{
double area = PI*a*b; System.out.print("\nArea of circle: "+area);
}
}
class Square extends Example
{
int a; Square(int a)
{
this.a = a;
}
void dispatch()
{
double area = a*a;
System.out.print("\nArea of Square: "+area);
}
}
class Triangle extends Example
{
int len, height; Triangle(int len,int height)
{
this.len = len; this.height = height;
}
void dispatch()
{
double area = 0.5*len*height; System.out.print("\nArea of Square: "+area);
}
}
class Assign4_Q3
{
public static void main(String[] args)
{
Rectangle r =new Rectangle(5,6); r.dispatch();
Circle c = new Circle(5); c.dispatch();
Ellipse e = new Ellipse(4,5);
e.dispatch();
Square s = new Square(4); s.dispatch();
Triangle t = new Triangle(4,6); t.dispatch();
}
}