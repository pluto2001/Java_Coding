import java.util.Scanner;

public class Lab2_14_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String input;
		input = sc.nextLine();
	
		for (char i = 'A'; i <= 'Z'; i++) {
			String c = i+"";
			if (!input.substring(0,1).equals(c)&&!input.substring(1,2).equals(c)) {
				System.out.print(i);
			}

		}

	}

}
