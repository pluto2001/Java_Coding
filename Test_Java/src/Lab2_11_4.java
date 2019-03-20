import java.util.Scanner;

public class Lab2_11_4 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int number = 0;
		int sum = 0;
		System.out.print("Enter Solution Number :");
		number = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= number; i += 1) {
			sum += i * i;
			if (i == 1) {
				System.out.print("Result Solution :" + i + "^2");
			} else if (i < number) {
				System.out.print("+" + i + "^2+ ");
			} else if (i == number) {
				System.out.print(i + "^2 +=" + sum);
			}
		}

	}

}
