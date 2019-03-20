import java.util.Scanner;

public class Lab1_10_3 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
				float pound;
				System.out.println("Weight Conversion Porgram");
				System.out.print("Enter weight in pound :");
				pound = Math.round(Float.parseFloat(sc.nextLine()));
				System.out.println("Weight Conversion to kg. is"+pound/2.2);
				
			}
}
