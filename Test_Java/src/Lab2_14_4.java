import java.util.Scanner;

public class Lab2_14_4 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String input;
		input = sc.nextLine();
	
		for (char i = 'Z'; i >= 'A'; i--) {
			
			if((char)input.charAt(0)>=i) {
				System.out.println(i);
			}
		}
			

	}

}
