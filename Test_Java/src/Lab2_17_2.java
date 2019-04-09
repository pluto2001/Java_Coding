import java.util.Scanner;

public class Lab2_17_2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int salary = 0;
		int overtime = 0;
		
		System.out.print("Salary :");
		salary = Integer.parseInt(sc.nextLine());
		System.out.print("Overtime :");
		overtime = Integer.parseInt(sc.nextLine());
		System.out.print("lncome =");
		System.out.println(salary + overtime);
		
		
	}


}
