import java.util.Scanner;

public class Lab1_12_3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int ppp = 0;
		int xxx = 0;
		System.out.println("Enter Product in a day (kg.) = ");
		ppp = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Weight per Box (g.) = ");
		xxx = Integer.parseInt(sc.nextLine());
		System.out.println("The Total Box in The Week = " + ppp * 10 * 10 * 10 / xxx + "Boxes");
	}

}
