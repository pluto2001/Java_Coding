import java.util.Scanner;

public class Lab2_10_2 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int first = 0;
		int second = 0;
		System.out.print("First Number = ");
		first = Integer.parseInt(sc.nextLine());
		System.out.print("Second Number = ");
		second = Integer.parseInt(sc.nextLine());
		if(first>second) {
			System.out.println(first+"is bigger than"+second);
			
		}else if(first<second) {
			System.out.println(first+"is small than"+second);
			
		}else if(first==second) {
			System.out.println(first+"is equal to"+second);
			
		}

	}

}
