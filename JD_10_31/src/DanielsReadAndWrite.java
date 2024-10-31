import java.util.*;
import java.io.*;

public class DanielsReadAndWrite {

	public static void main(String[] args) throws FileNotFoundException{
		// Reads Firstname, Lastname, and Test scores from the file "studentData.txt"
		Scanner inFile = new Scanner(new FileReader("studentData.txt"));
		PrintWriter outFile = new PrintWriter("studentDataResults.txt");
		String firstName;
		String lastName;
		double testScore;
		double classAverage;
		double sum = 0;
		int count = 0;
		while (inFile.hasNext()) {
			firstName = inFile.next();
			lastName = inFile.next();
			testScore = inFile.nextDouble();
			sum += testScore;
			count ++;
			outFile.printf("%-12s %-12s %.2f  %c %n", firstName, lastName, testScore, getLetterGrade(testScore));
		}
		classAverage = sum/count;
		outFile.print("Class Average: " + classAverage + " " + getLetterGrade(classAverage));
		inFile.close();
		outFile.close();
	}
	
	public static char getLetterGrade (double testScore) {
		char letterGrade = 'N';
		switch((int)testScore/10) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			letterGrade = 'F';
			break;
		case 6:
			letterGrade = 'D';
			break;
		case 7:
			letterGrade = 'C';
			break;
		case 8:
			letterGrade = 'B';
			break;
		case 9:
		case 10:
			letterGrade = 'A';
			break;
		default:
			System.out.print("Invalid Score");
		}
		return letterGrade;
	}

}
