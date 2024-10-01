
public class DanielsAnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("|| Inheritance in action ||");
		System.out.println("***************************");
		DanielsAnimal wolf_A = new DanielsWolf();
		DanielsAnimal housecat_A = new DanielsHousecat();
		wolf_A.roam();
		wolf_A.make_noise();
		wolf_A.eat_food();
		wolf_A.sleep();
	}

}
