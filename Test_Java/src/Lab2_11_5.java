import java.util.Scanner;

public class Lab2_11_5 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int data1 = 0;
		int data2 = 0;
		System.out.print("Enter Length and Width of Square:");
		data1 = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Length and Width of Square:");
		data2 = Integer.parseInt(sc.nextLine());
		if (data1 == data2) {
			System.out.println("This is: Square");
		} else if (data1 != data2) {
			System.out.println("This is:Rectangular");
		}

	}

}
