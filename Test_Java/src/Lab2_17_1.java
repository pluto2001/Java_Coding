import java.util.Scanner;

public class Lab2_17_1 {

	// Ternary

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int parking = 0, sum = 0;
		System.out.print("Parking Hourse = ");
		parking = Integer.parseInt(sc.nextLine());

		sum = parking == 1 ? 0 : parking > 1 && parking < 4 ? 10 : (parking - 3) * 20 + 10;

		System.out.println("Parking Fee : " + sum);
	}

}
