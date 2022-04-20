package tiffinApp;

import java.util.Scanner;

public class TiffinApp {

	void calculation() {

		totalBill = totalPriceBonda + totalPriceDosa + totalPriceIdly;
		System.out.println("Your Total bill is : " + totalBill);
	}

	void dosa() {
		System.out.println("Enter the number of Dosa: ");
		quanity = sc.nextInt();
		totalPriceDosa = dosa_price * quanity;
		System.out.println(quanity + " Dosa price is  : " + totalPriceDosa);

	}

	void idly() {
		System.out.println("Enter the number of Idly: ");
		quanity = sc.nextInt();
		totalPriceIdly = idly_Price * quanity;
		System.out.println(quanity + " Idly price is  : " + totalPriceIdly);

	}

	void bonda() {
		System.out.println("Enter the number of Bonda: ");
		quanity = sc.nextInt();
		totalPriceBonda = bonda_price * quanity;
		System.out.println(quanity + " Bonda price is  : " + totalPriceBonda);

	}

	private static Scanner sc;
	private static int bonda_price = 10, dosa_price = 100, idly_Price = 50, totalBill, quanity, totalPriceBonda,
			totalPriceDosa, totalPriceIdly;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		TiffinApp tf = new TiffinApp();
		while (true) {

			System.out.println("********************************");

			System.out.println("             1. Dosa          ");
			System.out.println("             2. Idly          ");
			System.out.println("             3. Bonda         ");
			System.out.println("             4. Exit          ");
			System.out.println("********************************");

			System.out.println(" Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				tf.dosa();
				break;
			case 2:
				tf.idly();
			case 3:
				tf.bonda();
				break;
			case 4:
				tf.calculation();
				System.out.println("Thanks for Using App!");
				System.exit(0);
			default:
				System.out.println("Please choose Option between 1-5");
			}

		}

	}
}
