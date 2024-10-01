
public class DanielsWolf extends DanielsCanine{
	private String animal_name = "Wolf";
	public void make_noise() {
		System.out.println("The " + animal_name + " is howling.");
	}
	
	public void eat_food() {
		System.out.println("The " + animal_name + " is eating a bone.");
	}
	
	public void roam() {
		super.roam();
		System.out.println("This makes the " + animal_name + " dangerous for prey.");
	}
}
