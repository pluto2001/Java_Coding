import java.util.Scanner;

public class Lab1_12_1 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		System.out.print("Enter Number A: ");
		a = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Number B: ");
		b = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Number C: ");
		c = Integer.parseInt(sc.nextLine());
		System.out.print("ln Term X = ");
		System.out.println(2*a*b+c);
	}

}
