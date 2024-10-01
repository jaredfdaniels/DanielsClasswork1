
public class DanielsDog extends DanielsCanine{
	private String animal_name = "Dog";
	public void make_noise() {
		System.out.println("The " + animal_name + " is barking.");
	}
	
	public void eat_food() {
		System.out.println("The " + animal_name + " is eating a bone.");
	}
	
	public void play() {
		System.out.println("The " + animal_name + " is playing in the grass.");
	}
}
