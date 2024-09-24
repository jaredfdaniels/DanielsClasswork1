
public class DanielsOverloadMethodClasswork {

	public static void main(String[] args) {
		// Adds up to 4 numbers using an overloaded method
		int total = addNumbers(4,5);
		System.out.println(total);
		total = addNumbers(4,5,6);
		System.out.println(total);
		total = addNumbers(4,5,6,7);
		System.out.println(total);
	}
	
	public static int addNumbers (int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static int addNumbers (int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
	}
	
	public static int addNumbers (int num1, int num2, int num3, int num4) {
		int sum = num1 + num2 + num3 + num4;
		return sum;
	}
	
}
