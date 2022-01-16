import java.util.Scanner;
public class FahToCel
{
    public static void main(String[] args) 
    {
        double cel, fah;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        fah = s.nextDouble();
        cel = ((fah-32)*5)/9;  
        System.out.println("Temperature in Celsius:"+cel);        
    }
}
