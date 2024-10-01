
public abstract class DanielsAnimal {
	// Instance Variables
	private String food_type;
	private int hunger_level;
	private String animal_name = "Animal";
	
	// Common Methods
	public void sleep() {
		System.out.println("The " + animal_name + " sleeps.");
	}
	
	public void roam() {
		System.out.println("The " + animal_name + " is roaming");
	}
	
	public abstract void make_noise();
	
	public abstract void eat_food();
	
}
