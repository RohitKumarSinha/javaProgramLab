import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("::Welcome to Rohit Resturant::");
		int total = 0;

		while(true){
			System.out.println("To order Pizza: 400 Rs enter 1");
			System.out.println("To order Burger: 100 Rs enter 2");
			System.out.println("To order coffee: 50 Rs enter 3");
			System.out.println("To Exit, Enter value 4");
			
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();

			switch(choice){
			case 1: System.out.println("I am ordering Pizza Rs 400");
			       int quan_pizza;
			       System.out.print("Enter the quantity of pizza \n");
			       quan_pizza = scan.nextInt();
			       total += 400 * quan_pizza;
			       System.out.print("Do yow want anything else if not then press 4\n");
			       choice = scan.nextInt();
			       
			break;
			case 2: System.out.println("I am ordering Burger Rs 100");
			       int quan_burger;
			       System.out.print("Enter the quantity of Burger \n");
			       quan_burger = scan.nextInt();
			       total += 100 * quan_burger;
			       System.out.print("Do yow want anything else if not then press 4\n");
			       choice = scan.nextInt();
		
			break;
			
			case 3: System.out.println("I am ordering Coffee Rs 50");
			       int quan_coffee;
			       System.out.print("Enter the quantity of Coffee \n");
			       quan_coffee = scan.nextInt();
			       total += 50 * quan_coffee;
			       System.out.print("Do yow want anything else if not then press 4\n");
			       choice = scan.nextInt();
		
			break;
			case 4: System.out.println("Exiting the application");
			System.exit(0);
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
		}
		
		System.out.println("your total bill is " + total);

	}

}
