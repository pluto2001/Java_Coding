import java.util.Scanner;

public class Lab1_14_1 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int base = 0;
		int height = 0;
		System.out.print("Base length = ");
		base = Integer.parseInt(sc.nextLine());
		System.out.print("Height = ");
		height = Integer.parseInt(sc.nextLine());
		System.out.println("Parallelogrem Area = "+base*height);

	}

}
