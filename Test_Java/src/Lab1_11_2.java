import java.util.Scanner;

public class Lab1_11_2 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		float value1 = 0;
		float value2 = 0;
		float value3 = 0;
		float value4 = 0;
		float value5 = 0;
		System.out.print("Value1 =");
		value1 = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("Value2 =");
		value2 = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("Value3 =");
		value3 = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("Value4 =");
		value4 = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("Value5 =");
		value5 = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("Average =");
		System.out.println((value1+value2+value3+value4+value5)/5);
	}

}
