import java.util.Scanner;

public class Lab1_11_3 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		float weight = 0;
		float high = 0;
		System.out.print("Weight =");
		weight = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("High =");
		high = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.println("BMI ="+weight/(high/100*high/100));

	}

}
