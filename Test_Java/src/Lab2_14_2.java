import java.util.Scanner;

public class Lab2_14_2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String input;
		input = sc.nextLine();
	
		for (char i = 'A'; i <= 'Z'; i++) {
			
			if ((char)input.charAt(0)>=i||(char)input.charAt(1)<=i) {
				System.out.print(i);
			}

		}
	}

}
