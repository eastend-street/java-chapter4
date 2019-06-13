
public class ShowRandomCharacter {
	public static void main(String[] args) {
		int ascii = (int)((int)'a' + Math.random() * (int)'z' - (int)'a' + 1);
		
		char char1 = (char)('a' + Math.random() * ('z' - 'a' + 1));
		
		System.out.println(ascii);
		System.out.println(char1);
	}
}
