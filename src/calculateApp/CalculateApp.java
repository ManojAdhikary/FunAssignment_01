package calculateApp;

import java.util.Scanner;

public class CalculateApp {
	
	int fno;
	int sno;
	Scanner sc = new Scanner(System.in);

	void add() {
		System.out.println("Enter the first number: ");
		fno=sc.nextInt();
		System.out.println("Enter the second number: ");
		sno=sc.nextInt();
		int result=fno+sno;
    	System.out.println("Adding two numbers: "+ result);	
	}
	void sub() {
		System.out.println("Enter the first number: ");
		fno=sc.nextInt();
		System.out.println("Enter the second number: ");
		sno=sc.nextInt();
		int result=fno-+sno;
    	System.out.println("Substraction of two numbers: "+ result);	
	}
	void mul() {
		System.out.println("Enter the first number: ");
		fno=sc.nextInt();
		System.out.println("Enter the second number: ");
		sno=sc.nextInt();
		int result=fno*sno;
    	System.out.println("Multiplication of  two numbers: "+ result);	
	}
	public static void main(String[] args) {
		
		CalculateApp ca = new CalculateApp();
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("********************************");
			
			System.out.println("             1. Add          ");
			System.out.println("             2. Sub          ");
			System.out.println("             3. Mul          ");
			System.out.println("             4. Exit         ");
			System.out.println("********************************");
			
			System.out.println(" Enter the choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				ca.add();
				break;
			case 2:
				ca.sub();
			case 3:
				ca.mul();
				break;
			case 4:
				System.out.println("Thanks for Using App!");
				System.exit(0);
				default:
					System.out.println("Please choose Option between 1-5");
			}
		}
	}

}
