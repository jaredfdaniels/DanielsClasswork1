
public class DanielsOverloadingMethods {

	public static void main(String[] args) {
		// Using multiple methods with same names (must have different returns)
		int num = doubleNumber(4);
		System.out.println(num);
		
	}
	
	public static int doubleNumber (int n) {
		int total = n*n;
		return total;
	}
}
