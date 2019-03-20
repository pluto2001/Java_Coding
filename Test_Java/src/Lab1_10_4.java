import java.util.Scanner;

public class Lab1_10_4 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		float radius = 0;
		
		System.out.print("Enter radius:");
		radius = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.println("The answer is"+2*(3.14*radius));
				

	}

}
