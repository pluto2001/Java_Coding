import java.util.Scanner;

public class newlab1_7 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int number1 = 0;
		int sum = 0;
		int number2 = 0;
		char operator;
		
		

		System.out.print("Number :");
		number1 = Integer.parseInt(sc.nextLine());
		System.out.print("Operator :");
		operator = sc.nextLine().charAt(0);
		while (true) {
			sum = number1 + number2;
			if (operator == '+') {
				System.out.print("Number :");
				number2 = Integer.parseInt(sc.nextLine());
				System.out.print("Operator :");
				operator = sc.nextLine().charAt(0);
				sum = sum + number2;
			}
			if (operator == '-') {
				System.out.print("Number :");
				number2 = Integer.parseInt(sc.nextLine());
				System.out.print("Operator :");
				operator = sc.nextLine().charAt(0);
				sum = number2 - number2;
			}
			if (operator == '*') {
				System.out.print("Number :");
				number2 = Integer.parseInt(sc.nextLine());
				System.out.print("Operator :");
				operator = sc.nextLine().charAt(0);
				sum = sum * number2;
			}
			if (operator == '/') {
				System.out.print("Number :");
				number2 = Integer.parseInt(sc.nextLine());
				System.out.print("Operator :");
				operator = sc.nextLine().charAt(0);
				sum = sum / number2;
			}

			if (operator == '=') {
				System.out.print("Number :");
				System.out.println(sum);
				System.out.print("Operator :");
				operator = sc.nextLine().charAt(0);
			}
			if(operator=='N') {
				System.out.println("End Calculate");
				break;
			}

		}

	}

}
