import java.util.Scanner;

public class Lab2_10_4 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int score = 0;
		
		while (true) {
			System.out.print("Enter score =");
			score = Integer.parseInt(sc.nextLine());
			if (score >= 80 && score <= 100) {
				System.out.println("Your Grade = A");
			} else if (score >= 70 && score <= 79) {
				System.out.println("Your Grade = B");
			} else if (score >= 60 && score <= 69) {
				System.out.println("Your Grade = C");
			} else if (score >= 50 && score <= 59) {
				System.out.println("Your Grade = D");
			} else if (score < 50) {
				System.out.println("Your Grade = F");
			}
		}

	}

}
