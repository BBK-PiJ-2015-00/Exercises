class Spy {
	private static int spyCount;
	private int spyID;
	
	public Spy(int spyID) {
		this.spyID = spyID;
		this.spyCount++;
		printID();
		printCount();
	}
	
	void printID() {
		System.out.println("Spy ID: " + this.spyID);
	}
	
	void printCount() {
		System.out.println("There are " + this.spyCount + " spies.");
	}
	
	void die() {
		System.out.println("Spy " + this.spyID + " has been detected and eliminated.");
		this.spyCount--;
		printCount();
	}
}