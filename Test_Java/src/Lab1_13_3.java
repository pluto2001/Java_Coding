import java.util.Scanner;

public class Lab1_13_3 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int m = 0;
		int x = 0;
		int b = 0;
		m = Integer.parseInt(sc.nextLine());
		x = Integer.parseInt(sc.nextLine());
		b = Integer.parseInt(sc.nextLine());
		System.out.print("y = ");
		System.out.println(m*x+b);
	}

}
