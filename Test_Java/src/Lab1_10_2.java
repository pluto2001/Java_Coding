import java.util.Scanner;

public class Lab1_10_2 {

	static Scanner  sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int discount = 0;
		int price = 0;
		System.out.println("Porgram POS calculation");
		System.out.print("Enter Price :");
		price = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Discount :");
		discount = Integer.parseInt(sc.nextLine());
		System.out.println("Your Discount is"+price*discount/100);
		System.out.print("Your Net Price is");
		System.out.println(price-price*discount/100);
		
	}
	
	

}
