
public class DanielsOverloadingMethods {

	public static void main(String[] args) {
		// Using multiple methods with same names (must have different return type)
		int num = doubleNumber(4);
		System.out.println(num);
		double numD = doubleNumber(4.5);
		System.out.println(numD);
		String numS = doubleNumber("4.5");
		System.out.println(numS);
		double numA = doubleNumber(3,4);
		System.out.println(numA);
		
	}
	
	public static int doubleNumber (int n) {
		int total = n * n;
		return total;
	}
	
	public static double doubleNumber (double n) {
		double total = n * n;
		return total;
	}
	
	
	public static String doubleNumber (String n) {
		String error_message = "Cannot calculate strings.";
		return error_message;
	}
	
	public static double doubleNumber (double n, double m) {
		double total = n + m;
		return total;
	}
	
}
