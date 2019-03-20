import java.util.Scanner;

public class Try {
	// boolean --> true, false
	// char
	// byte --> int
	// shot --> int
	// int
	// long --> int
	// float
	// double --> float
	// String --> Text

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Integer _number1 = null;
		Integer _number2 = null;
		int _sum = 0;

		while (true) {
			try {
				if (_number1 == null) {
					System.out.print("Enter Number 1 : ");
					_number1 = Math.round(Float.parseFloat(sc.nextLine()));
				} else if (_number2 == null) {
					System.out.print("Enter Number 2 : ");
					_number2 = Math.round(Float.parseFloat(sc.nextLine()));
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("Enter Integer");
			}
		}

		_sum = _number1 + _number2;
		System.out.println(_sum);
	}
}
