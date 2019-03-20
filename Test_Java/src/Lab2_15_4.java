import java.util.Scanner;

public class Lab2_15_4 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int data = 0;
		System.out.print("Enter 2D =");
		data = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < data; i += 1) {
			for (int j = 0; j <= i; j += 1) {
				System.out.println("*");
			}
		}

	}

}
