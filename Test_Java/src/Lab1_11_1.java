import java.util.Scanner;

public class Lab1_11_1 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		float sale = 0;
		float discount = 0;
		System.out.print("Sale Price =");
		sale = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.print("Discount =");
		discount = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.println("Discount = "+(discount/sale)*100+"%");
		

	}

}
