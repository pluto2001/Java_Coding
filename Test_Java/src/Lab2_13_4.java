import java.util.Scanner;

public class Lab2_13_4 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		float radius = 0;
		float a = 3.1428F;
		System.out.print("Enter Circle calculation C/A?");
		String select = (sc.nextLine());
		if (select.equals("C")) {
			System.out.print("Enter radius :");
			radius = Math.round(Float.parseFloat(sc.nextLine()));
			System.out.println("The circumference is " + (2 * a) * radius);
		} else if (select.equals("A")) {
			System.out.print("Enter radius :");
			radius = Math.round(Float.parseFloat(sc.nextLine()));
			System.out.println("The area is" + a * radius * radius);
		}
	}
}
