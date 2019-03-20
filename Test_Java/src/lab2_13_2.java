import java.util.Scanner;

public class lab2_13_2 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int price = 150;
		int discount = 80;
		int a = sum(price,discount);
		System.out.println("Program POS calculation");
		System.out.println(a);
		if(a<50) {
			System.out.println("Your Discount is less than.50 percent");
		}else if(a>50) {
			System.out.println("Your Discount is more than.50 percent");
		}

	}
	public static int sum(int price, int discount) {
		int percent;
		percent = 100*discount/price;
		return percent;
	}

}
