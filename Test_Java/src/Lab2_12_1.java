import java.util.Scanner;

public class Lab2_12_1 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int weight = 0;
		int high = 0;
		
		System.out.print("Weight =");
		weight = Integer.parseInt(sc.nextLine());
		System.out.print("High =");
		high = Integer.parseInt(sc.nextLine());
		System.out.println("BMI ="+weight/(high/100*high/100));
		

	}

}
