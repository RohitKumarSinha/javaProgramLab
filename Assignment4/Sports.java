interface Tossable
{
abstract void toss();
}
abstract class Ball implements Tossable
{
String brandname; Ball()
{
}
Ball(String brandname)
{
this.brandname = brandname;
}
public String getbrandname()
{
return brandname;
}
public abstract void toss(); abstract void bounce();
}
class Rock implements Tossable
{
public void toss()
{
System.out.println("Rock was Tossed");
}
}
class Baseball extends Ball
{
String brandname; Baseball(String brandname)
{
super(brandname);
}
public void toss()
{
System.out.println("Ball was Tossed");
}
public void bounce()
{
System.out.println("Ball was Bounced");
}
}
class Football extends Ball
{
String brandname; Football(String brandname)
{
super(brandname);
}
public void toss()
{
System.out.println("FootBall was Tossed");
}
public void bounce()
{
System.out.println("FootBall was Bounced");
}
}
class Sports
{
public static void main(String args[])
{
Football f = new Football("Nike"); Baseball b = new Baseball("Kukaburra"); Rock r = new Rock();
f.bounce();
f.toss();
r.toss(); System.out.println(b.getbrandname()); System.out.println(f.getbrandname());
}
}