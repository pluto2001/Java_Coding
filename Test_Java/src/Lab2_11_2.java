import java.util.Scanner;

public class Lab2_11_2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int price = 0;
		System.out.print("Enter Total Price (Baht):");
		price = Integer.parseInt(sc.nextLine());
		if (price >= 10000) {
			System.out.print("You have Discount 15% and You Pay");
			System.out.println(price - ((price / 100) * 15));
		} else if (price >= 5000) {
			System.out.print("You have Discount 10% and You Pay");
			System.out.println(price - ((price / 100) * 10));
		} else if (price >= 1000) {
			System.out.print("You have Discount 5% and You Pay");
			System.out.println(price - ((price / 100) * 5));
		}
	}
}
