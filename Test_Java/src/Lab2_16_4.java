
import java.util.Scanner;

public class Lab2_16_4 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int score = 0;
		while (true) {
			score = Integer.parseInt(sc.nextLine());
			if (score >= 80 && score <= 100) {
				System.out.println("Grade A");
			} else if (score >= 70 && score <= 79) {
				System.out.println("Grade B");
			} else if (score >= 60 && score <= 69) {
				System.out.println("Grade C");
			} else if (score >= 50 && score <= 59) {
				System.out.println("Grade D");
			} else if (score <= 50) {
				System.out.println("Grade F");
			}
			System.out.println("Do you want continue:");
			String data = sc.nextLine();
			if(data.equals("Y")) {
				continue;
			}else if(data.equals("N")) {
				System.out.println("Exit");
				break;
			}

		}

	}
}
