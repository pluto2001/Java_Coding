import java.util.Scanner;

public class Lab2_12_5 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int input[] = new int[5];
		int count = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("n =");
			input[i] = Integer.parseInt(sc.nextLine());
			if (input[i] < 50){
				count += 1;

			}
			
		}
		System.out.println("Number<50 :" + count);

	}

}
