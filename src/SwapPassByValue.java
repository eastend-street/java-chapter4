
public class SwapPassByValue {
	private static void swap(int num1, int num2) {
		int temp = num2;
		num2 = num1;
		num1 = temp;

		System.out.println("num1 is " + num1 + " num2 is " + num2);
	}

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;

		System.out.println("Before the call swap, num1 is " + num1 + ", num2 is " + num2);

		swap(num1, num2);

		System.out.println("After the call swap, num1 is " + num1 + ", num2 is " + num2);
	}
}
