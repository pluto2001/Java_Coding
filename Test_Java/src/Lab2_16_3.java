import java.util.Scanner;

public class Lab2_16_3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int round = 0;
		int input[] = new int[10];
		int min = 0;

		round = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < round; i += 1) {
			for (int j = 0; j < 3; j += 1) {
				input[j] = sc.nextInt();
				min = input[0];
				min = min > input[j] ? input[j] : min;
			}
		}
		System.out.println(min);
	}

}
