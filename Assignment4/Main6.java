class Shape
{
int xpos,ypos;
public Shape(int x, int y)
{
xpos=x; ypos=y;
}
public void draw()
{
System.out.print("Draw method called of class Shape");
}
}
class Circle extends Shape
{
int r;
public Circle(int x1 , int y1 , int r1)
{
super(x1,y1); r = r1;
}
public void draw()
{
System.out.println("Draw method called of class Circle");
}
public void surface()
{
System.out.println(" The surface of the circle is "+((Math.PI)*r*r));
}
}
class Main6
{
public static void main(String[] args)
{
Shape c = new Circle(10,2,4); c.draw(); ((Circle)c).surface();
}
}