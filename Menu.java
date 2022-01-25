// MENU driven program

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("::Welcome to Rohit Resturant::");
		int total = 0;
		int quan_pizza = 0;
		int quan_burger = 0;
		int quan_coffee = 0;

		while(true){
			System.out.println("To order Pizza: 400 Rs enter 1");
			System.out.println("To order Burger: 100 Rs enter 2");
			System.out.println("To order coffee: 50 Rs enter 3");
			System.out.println("To Exit, Enter value 4");
			
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();

			switch(choice){
			case 1: System.out.println("I am ordering Pizza Rs 400");
			       System.out.print("Enter the quantity of pizza \n");
			       quan_pizza = scan.nextInt();
			       total += 400 * quan_pizza;
			       
			break;
			case 2: System.out.println("I am ordering Burger Rs 100");
			       System.out.print("Enter the quantity of Burger \n");
			       quan_burger = scan.nextInt();
			       total += 100 * quan_burger;
		
			break;
			
			case 3: System.out.println("I am ordering Coffee Rs 50");
			       System.out.print("Enter the quantity of Coffee \n");
			       quan_coffee = scan.nextInt();
			       total += 50 * quan_coffee;
		
			break;
			case 4: System.out.println("Exiting the application");
			System.out.println("your order of pizza is " + quan_pizza);
			System.out.println("your order of burger is " + quan_burger);
			System.out.println("your order of coffee is " + quan_coffee);
			System.out.println("your total bill is " + total);
			System.exit(0);
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
		}
		
		

	}

}
