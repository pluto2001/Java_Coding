import java.util.Scanner;

public class Lab2_16_5 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		float base = 0;
		float heihgt = 0;
		float data = 0.5F;
		while (true) {
			System.out.print("Enter Figure <R:Rectangle ,T:Triangle> :");
			String a = sc.nextLine();
			if (a.equals("R")) {
				base = Math.round(Float.parseFloat(sc.nextLine()));
				heihgt = Math.round(Float.parseFloat(sc.nextLine()));
				System.out.println("Area of Rectangle = " + base * heihgt);
			} else if (a.equals("T")) {
				base = Math.round(Float.parseFloat(sc.nextLine()));
				heihgt = Math.round(Float.parseFloat(sc.nextLine()));
				System.out.println("Area of Triangle = " + data * base * heihgt);
			}
		}
	}

}
