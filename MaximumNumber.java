import java.util.Scanner;
public class MaximumNumber 
{
    public static void main(String[] args) 
    {
        int a, b, c, result;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter all three numbers:");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("Largest Number among three numbers is: "+result);
    }
}
