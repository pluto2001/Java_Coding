import java.util.Scanner;

public class lab2_13_3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		float pound = 0;
		float kg = 0;
		float a = 2.2046F;
		System.out.print("Weight Conversion select P/K?");
		String select = sc.nextLine();
		if (select.equals("P")) {
			System.out.print("Enter weight in pound :");
			pound = Math.round(Float.parseFloat(sc.nextLine()));
			System.out.println("Weight Conversion to kg. is" + pound / a + "kg.");
		} else if (select.equals("K")) {
			System.out.print("Enter weight in kg :");
			kg = Math.round(Float.parseFloat(sc.nextLine()));
			System.out.println("Weight Conversion to pound is" + kg * a + "pound");
		}

	}

}
