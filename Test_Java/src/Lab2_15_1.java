import java.util.Scanner;

public class Lab2_15_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int age = 0;
		System.out.print("Age:");
		age = Integer.parseInt(sc.nextLine());
		if (age <= 10) {
			System.out.println("(Children)");
		} else if (age >= 11 && age <= 20) {
			System.out.println("(Teen)");
		} else if (age >= 21 && age <= 35) {
			System.out.println("(Adult)");
		} else if (age >= 36 && age <= 55) {
			System.out.println("(Middle)");
		} else if (age >= 56) {
			System.out.println("(Old)");
		}

	}

}
