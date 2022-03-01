import Mathematics.Maximum; import Mathematics.Power; import java.util.*;
class Assign4_Q7
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("\nENTER THE NUMBERS TO FIND MAXIMUM: ");
double num1 = sc.nextDouble(); double num2 = sc.nextDouble();
Maximum m = new Maximum(num1,num2); System.out.println("\n"+m.max());
System.out.println("\nENTER A NUMBER TO FIND POWER: "); double num3 = sc.nextDouble();
Power p = new Power(num3); System.out.println("\n"+p.exp());
}
}