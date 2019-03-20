import java.util.Scanner;

public class Lab2_17_3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine()), sum = 0;
		String choice = sc.nextLine();
		String calulate = "";

		sum = choice.equals("A") ? a + b
				: choice.equals("B") ? a - b : choice.equals("C") ? a * b : choice.equals("D") ? a / b : 0;

		calulate = choice.equals("A") ? " + "
				: choice.equals("B") ? " - " : choice.equals("C") ? " x " : choice.equals("D") ? " / " : " Error ";

		System.out.println("A" + calulate + "B = " + sum);
	}

}
