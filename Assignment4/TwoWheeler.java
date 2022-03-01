package vehicle;
public class TwoWheeler
{
int cc,price;
public TwoWheeler(int cc , int price)
{
this.cc = cc; this.price = price;
}
public void disp()
{
System.out.println("\nThis is from TwoWheeler class cc:- "+ cc+" \nprice: "+price);
}
}