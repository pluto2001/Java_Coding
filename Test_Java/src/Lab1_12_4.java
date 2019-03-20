import java.util.Scanner;

public class Lab1_12_4 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		float number1 = 0;
		float number2 = 0;
		float number3 = 0;
		float number4 = 0;
		System.out.print("Enter Number1 : ");
		number1 = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("Enter Number2 : ");
		number2 = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("Enter Number3 : ");
		number3 = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("Enter Number4 : ");
		number4 = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("Summary Number : ");
		System.out.println(number1+number2+number3+number4);
	}

}
