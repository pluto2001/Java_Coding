import java.util.Scanner;

public class Lab1_13_5 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		float score = 0;
		float fullscore = 0;
		score = Math.round(Float.parseFloat(sc.nextLine()));
		fullscore = Math.round(Float.parseFloat(sc.nextLine()));
		System.out.println(score/fullscore*100+"%");

	}

}
