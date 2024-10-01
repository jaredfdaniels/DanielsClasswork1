
public class DanielsAnimalMain {

	public static void main(String[] args) {
		// Inheritance Demo
		System.out.println("|| Inheritance in action ||");
		System.out.println("***************************");
		DanielsAnimal wolf_A = new DanielsWolf();
		wolf_A.roam();
		wolf_A.make_noise();
		wolf_A.eat_food();
		wolf_A.sleep();
		
		// Polymorphism Demo
		System.out.println("");
		System.out.println("|| Polymorphism in action ||");
		System.out.println("***************************");
		DanielsAnimal[] animals = new DanielsAnimal[4];
		animals[0] = new DanielsDog();
		animals[1] = new DanielsHousecat();
		animals[2] = new DanielsHippo();
		animals[3] = new DanielsTiger();
		for (int i=0;i<animals.length;i++) {
			animals[i].eat_food();
			animals[i].roam();
		}
		
		//Polymorphic Args Demo
		System.out.println("");
		System.out.println("|| Polymorphic Arguments ||");
		System.out.println("***************************");
		DanielsVet myVet = new DanielsVet();
		myVet.giveShot(wolf_A);
		
	}

}
