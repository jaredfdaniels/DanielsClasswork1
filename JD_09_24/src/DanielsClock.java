
public class DanielsClock {
	// Initialize Variables
	private int hrs;
	private int min;
	private int sec;
	
	// Constructor Method
	public DanielsClock(){
		setTime(0,0,0);}
	
	public DanielsClock(int hrs, int min, int sec){
		setTime(hrs,min,sec);}
	
	// Setter-Mutator Methods
	public void setHours(int hrs){
		if (hrs >= 0 && hrs <= 24)
			this.hrs = hrs;
		else this.hrs = 0;}
	
	public void setMinutes(int min){
		if (min >= 0 && min <= 60)
			this.min = min;
		else this.min = 0;}
	
	public void setSeconds(int sec){
		if (sec >= 0 && sec <= 60)
			this.sec = sec;
		else this.sec = 0;}
	
	public void incrementHours() {
		if (this.hrs<24) this.hrs++;
		else this.hrs=0;}
	
	public void incrementMinutes() {
		if (min<60) min++;
		else {min=0; hrs++;}}
	
	public void incrementSeconds() {
		if (sec<60) sec++;
		else {sec=0; min++;}}
	
	// toString Override
	public String toString() {
		String pClock="";
		if(hrs<10)
			pClock+="0";
		pClock+=hrs+":";
		if(min<10)
			pClock+="0";
		pClock+=min+":";
		if(sec<10)
			pClock+="0";
		pClock+=sec;
		return pClock;
	}
	
	// Getter-Accessor Methods
	public int getHours(){
		return hrs;}
	
	public int getMinutes(){
		return min;}
	
	public int getSeconds(){
		return sec;}
	
	// Regular Methods
	public void setTime(int hrs, int min, int sec){
		setHours(hrs);
		setMinutes(min);
		setSeconds(sec);
	}
	
}
