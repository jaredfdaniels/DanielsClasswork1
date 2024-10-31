import java.util.*;
import java.io.*;

public class DanielsReadFileA {

	public static void main(String[] args) throws FileNotFoundException {
		// Reads Firstname, Lastname, Hours worked, and Hourly wage from the file "payroll.txt"
		Scanner inFile = new Scanner(new FileReader("payroll.txt")); // use "\\" (not "\") to avoid escape sequences
		//System.out.println(inFile.nextLine());
		String firstName = inFile.next();
		String lastName = inFile.next();
		String fullName = firstName + " " + lastName;
		double hoursWorked = inFile.nextDouble();
		double hourlyWage = inFile.nextDouble();
		System.out.println(fullName + " worked " + hoursWorked + " hours at $" + hourlyWage + " per hour.");
		System.out.print(fullName + "'s total earnings: $" + hoursWorked * hourlyWage + ".");
		inFile.close();
	}

}
