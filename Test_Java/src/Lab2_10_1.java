import java.util.Scanner;

public class Lab2_10_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int number = 0;
		System.out.print("Enter number = ");
		number = Integer.parseInt(sc.nextLine());
		if(number%2 == 0) {
			System.out.println("Output_number = "+number*number);
		}else {
			System.out.println("Output_number = "+number*number*number);
		}

	}

}
