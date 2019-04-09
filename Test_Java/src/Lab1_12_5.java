import java.util.Scanner;

public class Lab1_12_5 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int number = 1823;
		
		System.out.println(((number/1000))*1000);
		System.out.println(((number/100)%10)*100);
		System.out.println(((number/10)%10)*10);
		System.out.println(number%10);
		

	}

}
