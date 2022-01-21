import java.util.Scanner;
public class Volume
{      
   public static void main(String args[]) 
    {   
	 Scanner s= new Scanner(System.in);
         System.out.println("Enter the side of cube:");
         double side = s.nextDouble();
         
         double  cube = Volume(side); 
         System.out.println("Volume Of Cube is:" +cube);
         
         System.out.println("Enter the length, breadth, height of cubiod:");
         double length = s.nextDouble();
         double breadth = s.nextDouble();
         double height = s.nextDouble();
         
         double  cubiod = Volume(length, breadth, height); 
         System.out.println("Volume Of Cube is:" +cubiod);
         
         System.out.println("Enter the radius, height of the cylinder:");
         double radius = s.nextDouble();
         double heigh = s.nextDouble();
         
         double  cylinder = Volume(radius, heigh); 
         System.out.println("Volume Of cylinder is:" +cylinder);
         
         
    }

public static double Volume(double length, double width, double height) 
 {   
        double  a = length * width * height;
        return a;
 } 
    

public static double Volume(double radius, double heigh) 
 {      
        final double PI = 3.14;
        double  a =  PI * radius * radius * heigh;
        return a;
 } 

    
public static double Volume(double side) 
 {   
        double  a = side*side*side;
        return a;
 }

 
}
