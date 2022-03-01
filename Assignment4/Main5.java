interface shape
{
public String baseclass = "shape";
public void Draw(); public void paint();
}
class circle implements shape
{
public void Draw()
{
System.out.println("Drawing the circle here");
}
public void paint()
{
System.out.println("Painting the circle");
}
}
class Main5
{
public static void main(String args[])
{
shape circleshape = new circle(); circleshape.Draw(); circleshape.paint();
}
}