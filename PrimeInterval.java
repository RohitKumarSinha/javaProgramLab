import java.util.Scanner;
public class PrimeInterval {
	public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
	System.out.println("Enter first number:");
	int first_num =scan.nextInt();
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter second number:");
	int second_num = sc.nextInt();

        while (first_num < second_num) {
            if(checkPrimeNumber(first_num))
                System.out.print(first_num + "\n");

            first_num = first_num + 1;
        }
    }

    public static boolean checkPrimeNumber(int num) {
        boolean flag = true;
        for(int i = 2; i <= num/2; ++i) {
            if(num % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}


