import java.util.Scanner;

public class Lab2_16_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 0;
		number1 = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < number1; i += 1) {
			number2 = Integer.parseInt(sc.nextLine());
			if (number2 % 2 == 0) {
				System.out.println("even number");
			} else {
				System.out.println("Odd number");
			}
		}

	}

}
