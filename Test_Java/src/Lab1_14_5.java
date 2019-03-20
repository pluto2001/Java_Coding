import java.util.Scanner;

public class Lab1_14_5 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int unit = 0;
		System.out.print("Amount used per unit : ");
		unit = Integer.parseInt(sc.nextLine());
		System.out.println("Water bill = "+unit*5);

	}

}
