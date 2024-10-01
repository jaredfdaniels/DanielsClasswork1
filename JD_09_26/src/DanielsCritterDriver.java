
public class DanielsCritterDriver {

	public static void main(String[] args) {
		DanielsCritter myCritter = new DanielsCritter();
		DanielsCritter yourCritter = new DanielsCritter("Critter Two", "Unique");
		System.out.println("My critter, "+ myCritter.getName() + ", is feeling " + myCritter.getMood().toLowerCase() +".");
		System.out.println("Your critter, "+ yourCritter.getName() + ", is feeling " + yourCritter.getMood().toLowerCase() +".");
	}

}
