// Program to find max and min using array

import java.util.Scanner;
public class MaxAndMin
{
  public static void main(String[] args)
  {
       
       Scanner sc=new Scanner(System.in);
       int arr[]=new int[10];
       
       System.out.println("Enter elements in array");
       int min = 0;
       int max = 0;
       for(int i=0;i<=9;i++)
       {
         arr[i]=sc.nextInt();
         if(arr[i]<min)
           {
           min=arr[i];
           }
         if(arr[i]>max)
         {
           max=arr[i];
         }
       }
       System.out.println("Maximum element is "+max);
       System.out.println("Minimum element is "+min);
       
       
  }
}
