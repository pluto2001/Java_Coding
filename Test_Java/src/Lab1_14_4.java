import java.util.Scanner;

public class Lab1_14_4 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int year = 0;
		System.out.print("Year of birth(B.E.): ");
		year = Integer.parseInt(sc.nextLine());
		System.out.print("You are old: ");
		System.out.println(2562-year);
		System.out.print("Year of bith(A.D.):");
		System.out.println(year-543);

	}

}
