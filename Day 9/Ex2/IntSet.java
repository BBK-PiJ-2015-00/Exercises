public interface IntSet {
	// adds a new int to the set;
	// if it is there already then nothing happens
	void add(int x);
	
	// returns true if the number is in the set	
	boolean contains(int x);
	
	// returns the same value as contains(),
	// but prints each value on the screen as it is checked.
	boolean containsVerbose(int x);
	
	//returns a String value with elements seperated by commas.
	String toString();
}