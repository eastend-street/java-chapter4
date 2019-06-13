import java.util.Scanner;

public class Sum {
	public static int sum(int i1, int i2) {
		int result = 0;
		for(int i = i1; i <= i2; i++) {
			result += i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter start number: ");
		int startNumber= input.nextInt();
		
		System.out.println("Enter end number: ");
		int endNumber= input.nextInt();
		System.out.println("Sum from " + startNumber + " to " 
				+ endNumber + " is " + sum(startNumber, endNumber));
	}
}
