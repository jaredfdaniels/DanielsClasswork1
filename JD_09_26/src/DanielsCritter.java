
public class DanielsCritter {
	// Initialize Variables
	String critterName = "";
	String critterMood = "";
	
	// Constructor Methods
	public DanielsCritter(){
		setName("Critter One");
		setMood("Critterly");
	}
	
	public DanielsCritter(String critterName, String critterMood) {
		setName(critterName);
		setMood(critterMood);
	}
	
	// Setter-Mutator Methods
	public void setName(String critterName) {
		this.critterName = critterName;}
	
	public void setMood(String critterMood) {
		this.critterMood = critterMood;}
	
	// Getter-Accessor Methods
	public String getName() {
		return(critterName);}
	
	public String getMood() {
		return(critterMood);}
	
}
