import java.util.Scanner;

public class Lab2_13_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int width = 0;
		int length = 0;
		int high = 0;
		System.out.println("Enter width:");
		width = Integer.parseInt(sc.nextLine());
		System.out.println("Enter length:");
		length = Integer.parseInt(sc.nextLine());
		System.out.println("Enter high:");
		high = Integer.parseInt(sc.nextLine());
		System.out.println("The volume of object is" + width * high * length);

	}

}
