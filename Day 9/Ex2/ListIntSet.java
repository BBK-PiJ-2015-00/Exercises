public class ListIntSet implements IntSet {
	private int value;
	private ListIntSet next;
	
	public ListIntSet(int value) {
		this.value = value;
		this.next = null;
	}
	
	public void add(int newNumber) {
		//if newNumber already exists, do nothing
		if(newNumber == this.value) return;
		
		if(next==null) {
			next = new ListIntSet(newNumber);
		} else {
			next.add(newNumber);
		}
	}
	
	public boolean contains(int n) {
		if(this.value == n)
			return true;
		
		if(next==null)
			return false;
		else
			return next.contains(n);
	}
	
	public boolean containsVerbose(int n) {
		System.out.println (this.value);
		
		if(this.value == n)
			return true;
		
		if(next==null)
			return false;
		else
			return next.containsVerbose(n);
	}
	
	public String toString() {
		String s = "" + this.value;
		
		if(next!=null) {
			s += ", " + next.toString();
		}
		
		return s;		
	}
}








