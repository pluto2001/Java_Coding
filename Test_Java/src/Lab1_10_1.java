import java.util.Scanner;

public class Lab1_10_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int _width = 0;
		int _high = 0;
		int _length = 0;
		
		System.out.print("Enter Width : ");
		_width = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Length : ");
		_length = Integer.parseInt(sc.nextLine());
		System.out.print("Enter High : ");
		_high = Integer.parseInt(sc.nextLine());
		System.out.println("The value of object is : "+_width*_length*_high);
		
	}

}
