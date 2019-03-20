import java.util.Scanner;

public class Lab1_12_2 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int _midterm = 0;
		int _final = 0;
		int _accum = 0;
		System.out.print("Enter Midterm Score = ");
		_midterm = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Final Score = ");
		_final = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Accumulate Score = ");
		_accum = Integer.parseInt(sc.nextLine());
		System.out.print("The Total Score is = ");
		System.out.println(_midterm+_final+_accum);

	}

}
