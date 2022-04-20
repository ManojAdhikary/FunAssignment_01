package ResturantApp;

import java.util.Scanner;

public class BiryaniDetails {
	
	private static Scanner sc; 
	
	private static int chikenBiryani=100,vegBiryani=50,fishBiryani=150,quanity,totalPriceChikenBiryani,totalPriceVegBiryani, totalPriceFishBiryani;

void biryaniTotalBill() {
	int biryaniBill=totalPriceChikenBiryani+totalPriceVegBiryani+totalPriceFishBiryani;
	System.out.println("Your total bill for soft drinks is: "+biryaniBill);
}
 void chikenBiryani() {

		sc = new Scanner(System.in);

		System.out.println("Enter the number of Chiken Biryani: ");
		quanity = sc.nextInt();
		totalPriceChikenBiryani = chikenBiryani * quanity;
		System.out.println(quanity + " Chiken Biryani price is  : " + totalPriceChikenBiryani);
 }
 
 void vegBiryani() {
		sc = new Scanner(System.in);

		System.out.println("Enter the number of Vegitable Biryani: ");
		quanity = sc.nextInt();
		totalPriceVegBiryani = vegBiryani * quanity;
		System.out.println(quanity + " Chiken Vegitable Biryani price is  : " + totalPriceVegBiryani);
 }
 
 void fishBiryani() {
		sc = new Scanner(System.in);

		System.out.println("Enter the number of Fish Biryani: ");
		quanity = sc.nextInt();
		totalPriceFishBiryani = fishBiryani * quanity;
		System.out.println(quanity + " Fish Biryani price is  : " + totalPriceFishBiryani);
 }
 
 
	public void biryaniDetails() {
		sc = new Scanner(System.in);

		System.out.println("************************" );
		
		System.out.println("                1. Chicken Biryani       ");
		System.out.println("                2. Vegetable Biryani     ");
		System.out.println("                3. Fish Biryani          ");
		System.out.println("                4. Back                  ");
	

		
		System.out.println("************************" );
		
		System.out.println("Enter the choice");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			chikenBiryani(); 
			
			break;
			
		case 2:
			vegBiryani(); 
			
			break;
		case 3:
			fishBiryani(); 
			
			break;
		case 4:
			ResturantApp.main(null);
		default:
			System.out.println("Please choose Option between 1-4");
			
		}
		
	}

}
