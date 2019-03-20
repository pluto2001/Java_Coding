import java.util.Scanner;

public class Lab1_11_4 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		float cost = 0;
		float profit = 0;
		System.out.print("Cost =");
		cost = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("% Profit =");
		profit = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("Sale Price =");
		System.out.println(((cost*profit)/100)+cost);

	}

}
