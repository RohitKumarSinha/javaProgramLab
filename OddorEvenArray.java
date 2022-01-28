import java.util.Scanner; 

public class OddorEvenArray{  
	public static void main(String args[]){ 
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array: ");
		n=sc.nextInt();   
		
		int arr[]=new int[n]; 
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();  
		} 
		
		PrintEvenOrOdd(arr);
		
     }
     
      public static void PrintEvenOrOdd(int [] arr) {
      	  System.out.println("The Even Elements are");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println(" ");
        System.out.println("The Odd Elements are");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }  
}   
