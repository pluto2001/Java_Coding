
public class CharAt {

	public static void main(String[] args) {

		String _text = "Hello Wolrd!";

		for (int i = 0; i < _text.length(); i += 1) {
			if (_text.charAt(i) == 'W') {
				System.out.println("Found 'W' index at " + (i));
				break;
			}
		}
	}

}
