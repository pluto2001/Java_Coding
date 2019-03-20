import java.util.Scanner;

public class Lab2_15_3 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		float number = 0;
		System.out.print("Multiplication Table =");
		number = Math.round(Float.parseFloat(sc.nextLine()));
		for(float i=1;i<13;i+=1) {
			System.out.print(number+"X"+i);
			System.out.println(number*i);
		}

	}

}
