import java.util.Scanner;

public class Lab2_17_5 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int number = 0;

		while (true) {

			System.out.print("Number:");
			number = Integer.parseInt(sc.nextLine());
			if (number % 2 == 0) {
				System.out.println(number + " is Even number");
			} else {
				System.out.println(number + " is Odd number");
			}
			System.out.print("Do you want to continue Y/N?");
			String data = sc.nextLine();
			if (data.equals("Y")) {
				continue;
			} else if (data.contentEquals("N")) {
				System.out.println("The End");
				break;
				
			}
			
		}
	}

}
