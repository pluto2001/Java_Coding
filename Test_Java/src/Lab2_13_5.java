import java.util.Scanner;

public class Lab2_13_5 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		float number1 = 0;
		float number2 = 0;
		float number3 = 0;
		float number4 = 0;
		float number5 = 0;
		System.out.println("Program Average calculation");
		System.out.print("Enter 1 height :");
		number1 = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("Enter 2 height :");
		number2 = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("Enter 3 height :");
		number3 = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("Enter 4 height :");
		number4 = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("Enter 5 height :");
		number5 = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("The Average of five height is:");
		System.out.println((number1+number2+number3+number4+number5)/5);
	}

}
