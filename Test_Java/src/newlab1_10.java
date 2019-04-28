import java.util.Scanner;

public class newlab1_10 {

	static Scanner sc = new Scanner(System.in);
	static int round = Integer.parseInt(sc.nextLine());
	static int _round = Integer.parseInt(sc.nextLine());

	public static void main(String[] args) {
		int[] numberArray = new int[_round];
		int tmp, max1, max2 = 0;
		for (int x = 0; x < round; x++) {
			for (int i = 0; i < _round; i++) {
				numberArray[i] = sc.nextInt();
			}
			for (int i = 0; i < _round; i++) {
				for (int j = 0; j < _round -1; j++) {
					if (numberArray[j] < numberArray[j + 1]) {
						tmp = numberArray[j];
						numberArray[j] = numberArray[j + 1];
						numberArray[j + 1] = tmp;
					}
				}
			}

			max1 = numberArray[0];

			for (int i = 0; i < _round; i++) {
				if (max1 > numberArray[i]) {
					max2 = numberArray[i];
					break;
				}
			}
			System.out.println("------------");
			System.out.println(max2);

		}

	}

}
