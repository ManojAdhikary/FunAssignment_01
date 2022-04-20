package ResturantApp;
//TODO
import java.util.Scanner;

public class HotDrinksDetails {
	private static Scanner sc; 
	private static int tea=10,coffee=5,quanity,totalForHotDrinks,totalTea,totalCoffee;
	
	void hotDrinksTotalBill() {
		int hotDrinksBill=totalTea+totalCoffee;
		System.out.println("Your total bill for soft drinks is: "+hotDrinksBill);

	}	
	
	//TODO
 void tea() {
	 System.out.println("Thanks for eating tea");
 }
 
 void coffee() {
	 System.out.println("Thanks for eating coffee");
 }
 
 
 
	public void iceCreamDetails() {
		sc = new Scanner(System.in);

		System.out.println("************************" );
		
		System.out.println("                1. Tea               ");
		System.out.println("                2. Coffee             ");
		System.out.println("                3. Back               ");

	

		
		System.out.println("************************" );
		
		System.out.println("Enter the choice");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			tea(); 
		
			break;
			
		case 2:
			
			coffee();
			break;
			
		case 3:
			ResturantApp.main(null);
		default:
			System.out.println("Please choose Option between 1-3");
			
		}
		
	}

}
