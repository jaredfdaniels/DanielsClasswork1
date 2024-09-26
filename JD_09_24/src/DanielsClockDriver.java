import java.util.Scanner;

public class DanielsClockDriver {

	public static void main(String[] args) {
		// Same project/package --> no need to import
		DanielsClock myClock = new DanielsClock();
		DanielsClock yourClock = new DanielsClock(33,59,59);
		Scanner reader = new Scanner(System.in);
		myClock.setTime(1, 2, 3);
		myClock.setHours(4);
		System.out.println(yourClock.getHours());
		System.out.println(myClock.toString());
		myClock.incrementHours();
		System.out.println(myClock.toString());
		yourClock.incrementMinutes();
		System.out.println(yourClock.toString());
		reader.close();
		
	}

}
