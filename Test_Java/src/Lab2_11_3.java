import java.util.Scanner;

public class Lab2_11_3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int number = 0;
		System.out.print("Please Enter number:");
		number = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= number; i += 1) {
			if (i % 5 == 0) {
				System.out.println("The divisible by 5 is:" + i);
			}
		}

	}

}
