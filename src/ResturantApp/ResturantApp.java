package ResturantApp;

import java.util.Scanner;

public class ResturantApp {

	public static Scanner sc;

	void bill() {
		int totalBill;
		BiryaniDetails bd = new BiryaniDetails();
		DrinksDetails dd = new DrinksDetails();
		IceCreamDetails ic = new IceCreamDetails();
	}
	public static void main(String[] args) {
		
		 sc = new Scanner(System.in);
		 System.out.println("::Welcome to our Resturant!!");


		while(true) {
			sc = new Scanner(System.in);

			
			System.out.println("************************" );
			
			System.out.println("                1. Chicken Biryani       ");
			System.out.println("                2. Drinks                ");
			System.out.println("                3. Ice Cream             ");
			System.out.println("                4. Bill                  ");
			System.out.println("                5. Exit                  ");

			
			System.out.println("************************" );
			
		System.out.println("Enter the choice");
		int choice =sc.nextInt();
		switch(choice) {
		case 1:
			BiryaniDetails bd = new BiryaniDetails();
			bd.biryaniDetails();
			break;
		case 2:
			DrinksDetails dd = new DrinksDetails();
			dd.drinksDetails();
			
			break;
		case 3:
			IceCreamDetails ic = new IceCreamDetails();
			ic.iceCreamDetails();
			
			break;
		case 4:

			
			break;
		case 5:
			System.out.println("Thanks for using app");
			System.exit(0);
		default:
			System.out.println("Please choose Option between 1-5");
		}
	}
	}

}
