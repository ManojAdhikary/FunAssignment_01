package ResturantApp;
//TODO
import java.util.Scanner;

public class SoftDrinksDetails {
	private static Scanner sc; 
	private static int sprite=10,thumsUp=150,quanity,totalPriceSprite,totalPriceThumsUp;
	
	void softDrinksTotalBill() {
		int totalSoftDrinksTotalBill=totalPriceSprite+totalPriceThumsUp;
		System.out.println("Your total bill for soft drinks is: "+totalSoftDrinksTotalBill);
	}	
	
 void sprite() {
		sc = new Scanner(System.in);

		System.out.println("Enter the number of Sprite: ");
		quanity = sc.nextInt();
		totalPriceSprite = sprite * quanity;
		System.out.println(quanity + " Sprite price is  : " + totalPriceSprite); }
 
 void thumsUp() {
		sc = new Scanner(System.in);

		System.out.println("Enter the number of Thumps up: ");
		quanity = sc.nextInt();
		totalPriceThumsUp = thumsUp * quanity;
		System.out.println(quanity + " Thumps up: price is  : " + totalPriceThumsUp); }
 
 
 
	public void drinksDetails() {
		sc = new Scanner(System.in);

		System.out.println("************************" );
		
		System.out.println("                1. Sprite               ");
		System.out.println("                2. Thumsup              ");
		System.out.println("                3. Back                 ");
	
		
		System.out.println("************************" );
		
		System.out.println("Enter the choice");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			sprite(); 
			
			break;
			
		case 2:
			thumsUp(); 
			
			break;
		case 3:
			ResturantApp.main(null);
		default:
			System.out.println("Please choose Option between 1-3");
			
		}
		
	}

}
