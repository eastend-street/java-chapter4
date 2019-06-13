import java.util.Scanner;

public class OverLoading {
	public static int max(int num1, int num2) {
		int result = 0;

		if (num1 > num2) {
			result = num1;
		} else {
			result = num2;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number 1: ");
		int number1 = input.nextInt();

		System.out.println("Enter number 2: ");
		int number2 = input.nextInt();
		System.out.println("Max number is " + max(number1, number2));
	}
}
