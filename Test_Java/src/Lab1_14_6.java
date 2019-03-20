import java.util.Scanner;

public class Lab1_14_6 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int time = 0;
		System.out.print("What time is the car park? : ");
		time = Integer.parseInt(sc.nextLine());
		System.out.println("Parking fee = "+time*10);

	}

}
