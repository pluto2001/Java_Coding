import java.util.Scanner;

public class Lab1_14_2 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int size = 0;
		System.out.print("Room size : ");
		size = Integer.parseInt(sc.nextLine());
		System.out.println("Central expenses = "+size*5);

	}

}
