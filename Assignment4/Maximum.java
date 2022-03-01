package Mathematics;
public class Maximum
{
double a,b;
public Maximum(double a , double b)
{
this.a = a; this.b = b;
}
public double max()
{
if(a>b) return a; else return b;
}
}