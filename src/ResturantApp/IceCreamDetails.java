package ResturantApp;
//TODO
import java.util.Scanner;

public class IceCreamDetails {
	private static Scanner sc; 
	private static int butterShake=30,quanity,totalForButterShake;
	
	
 void butterShake() {
		sc = new Scanner(System.in);

		System.out.println("Enter the number of Butter: ");
		quanity = sc.nextInt();
		totalForButterShake = butterShake * quanity;
		System.out.println(quanity + " Butter price is  : " + totalForButterShake); }
 
 
 
	public void iceCreamDetails() {
		sc = new Scanner(System.in);

		System.out.println("************************" );
		
		System.out.println("                1. Butter sack       ");
		System.out.println("                2. Back              ");
	

		
		System.out.println("************************" );
		
		System.out.println("Enter the choice");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			butterShake(); 
		
			break;
			
		case 2:
			ResturantApp.main(null);
		default:
			System.out.println("Please choose Option between 1-2");
			
		}
		
	}

}
