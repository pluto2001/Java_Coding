import java.util.Scanner;

public class Lab1_13_2 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 0;
		number1 = Integer.parseInt(sc.nextLine());
		System.out.println((Integer.toHexString(number1)));
		System.out.println((Integer.toOctalString(number1)));
		number2 = Integer.parseInt(sc.nextLine());
		System.out.println((Integer.toHexString(number2)));
		System.out.println((Integer.toOctalString(number2)));
		System.out.print("Summation of "+number1+" and "+number2+" = " );
		System.out.println(number1+number2);

	}

}
