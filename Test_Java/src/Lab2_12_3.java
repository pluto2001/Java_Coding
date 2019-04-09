import java.util.Scanner;

public class Lab2_12_3 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		float number = 0;
		int sum = 0;
		for(int i=0;i<4;i++) {
			System.out.print("n = ");
			number = Math.round(Float.parseFloat(sc.nextLine()));
			sum+=number;
			
		}
		System.out.println(sum/4);

	}

}
