import java.util.Scanner;

public class Lab2_11_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int numberstart = 0;
		int numberend = 0;
		int sum = 0;
		System.out.print("Enter Start Number =");
		numberstart = Integer.parseInt(sc.nextLine());
		System.out.print("Enter End Number =");
		numberend = Integer.parseInt(sc.nextLine());

		for (int i = numberstart; i <= numberend; i += 1) {
			sum += i;
			System.out.println("Range Number:" + i);

		}
		System.out.println("Total Number:" + sum);
	}

}
