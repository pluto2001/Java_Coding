import java.util.Scanner;

public class Lab2_10_3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String _number = "";

		while (true) {
			try {
				_number = sc.nextLine();
				for (int i = 1; i < 13; i += 1) {
					System.out.println(_number + " x " + i + " = " + Integer.parseInt(_number) * i);
				}
			} catch (Exception e) {
				if (_number.equals("N")) {
					break;
				}
				System.out.println("Enter Number Or N WTF!");
			}
		}
		
		System.out.println("End Program");
	}

}
