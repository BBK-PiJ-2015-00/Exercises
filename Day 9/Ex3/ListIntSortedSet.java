public class ListIntSortedSet implements IntSortedSet {
	private int value;
	private ListIntSortedSet next;
	
	public ListIntSortedSet(int value) {
		this.value = value;
		this.next = null;
	}
	
	public void add(int newNumber) {
		//if newNumber already exists, do nothing
		if(newNumber == this.value) return;
		
		int temp = this.value;
		if(this.value > newNumber) {
			this.value = newNumber;
			if(next==null) {
				next = new ListIntSortedSet(temp);
			} else {
				next.add(temp);
			}
		} else {
			next.add(temp);
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








