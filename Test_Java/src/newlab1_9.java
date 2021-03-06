import java.util.Scanner;

public class newlab1_9 {

	static Scanner sc = new Scanner(System.in);

	static int round = 0;

	public static void main(String[] args) {

		while (true) {
			try {
				round = Integer.parseInt(sc.nextLine());
				if (round == 0) {
					round = round / round;
				}
				break;
			} catch (Exception e) {
				System.out.println("Enter Number Again OR Number > 0");
			}
		}

		int[] numberArray = new int[round];
		int tmp, max1, max2 = 0, roundMax2 = 0;
		boolean checkInput = false;

		while (true) {
			// รับค่าตามจำนวน Round
			int countArray = 0;
			
			if (checkInput) {
				break;
			} else {
				try {
					for (String i : sc.nextLine().split(" ")) {
						numberArray[countArray] = Integer.parseInt(i);
						countArray++;
					}
					checkInput = true;
				} catch (Exception e) {
					checkInput = false;
					countArray = 0;
					System.out.println("Enter Number Again");

				}
			}
		}

		// เรียงเลขมากไปน้อย
		for (int i = 0; i < round; i++) {
			for (int j = 0; j < round - 1; j++) {
				if (numberArray[j] < numberArray[j + 1]) {
					tmp = numberArray[j];
					numberArray[j] = numberArray[j + 1];
					numberArray[j + 1] = tmp;
				}
			}
		}

		// ค่ามากที่สุดอันดับ 1
		max1 = numberArray[0];

		// หาค่ามากที่สุดอันดับ 2
		for (int i = 0; i < round; i++) {
			if (max1 > numberArray[i]) {
				max2 = numberArray[i];
				break;
				}
			}

		// หาค่าซ้ำของอันดับ 2
		for (int i = 0; i < round; i++) {
			if (max2 == numberArray[i]) {
				roundMax2 += 1; // roundMax2 = roundMax2 + 1;
			}
		}

		System.out.println("----------------------------");
		System.out.println(max2);
		System.out.println(max1 - max2);
		System.out.println(roundMax2);

	}
}
