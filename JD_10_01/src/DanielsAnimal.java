
public abstract class DanielsAnimal {
	// Instance Variables
	private String food_type;
	private int hunger_level;
	
	// Common Methods
	public void sleep() {
		System.out.println("The animal sleeps.");
	}
	
	public void roam() {
		System.out.println("The animal is roaming");
	}
	
	public abstract void make_noise();
	
	public abstract void eat_food();
	
}
