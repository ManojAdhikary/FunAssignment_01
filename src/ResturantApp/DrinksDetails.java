package ResturantApp;
//TODO
import java.util.Scanner;

public class DrinksDetails {
	private static Scanner sc; 
	private static int softDrinks=10,hotDrinks=5,quanity,totalForDrinks,totalSoftDrinks,totalHotDrinks;
	 	
	
 void softDrinks() {
	 System.out.println("Thanks for eating softDrinks");
 }
 
 void hotDrinks() {
	 System.out.println("Thanks for eating hotDrinks");
 }

 
 
	public void drinksDetails() {
		sc = new Scanner(System.in);

		System.out.println("************************" );
		
		System.out.println("                1. Soft Drinks          ");
		System.out.println("                2. Hot Drinks           ");
		System.out.println("                3. Back                 ");
	
		
		System.out.println("************************" );
		
		System.out.println("Enter the choice");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			softDrinks(); 
			
			break;
			
		case 2:
			hotDrinks(); 
			
			break;
		case 3:
			ResturantApp.main(null);
		default:
			System.out.println("Please choose Option between 1-3");
			
		}
		
	}

}
