import java.util.Scanner;

public class Lab1_10_5 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		float fist = 0;
		float second = 0;
		float third = 0;
		System.out.print("Enter fist height :");
		fist = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("Enter second height :");
		second = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("Enter third height :");
		third = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.println("The Average of three height is"+(fist+second+third)/3);
		

	}

}
