
public class DanielsWolf extends DanielsCanine{
	public void make_noise() {
		System.out.println("The wolf is howling.");
	}
	
	public void eat_food() {
		System.out.println("The wolf is eating a bone.");
	}
	
	public void roam() {
		super.roam();
		System.out.println("This makes wolves dangerous for prey.");
	}
}
