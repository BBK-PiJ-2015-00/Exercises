public class TreeIntSortedSet implements IntSortedSet {
	int value;
	TreeIntSortedSet left;
	TreeIntSortedSet right;
	
	TreeIntSortedSet(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public void add(int newNumber) {
		if(newNumber > this.value) {
			if(right==null)
				right = new TreeIntSortedSet(newNumber);
			else
				right.add(newNumber);
		} else if (newNumber < this.value) {
			if(left==null)
				left = new TreeIntSortedSet(newNumber);
			else
				left.add(newNumber);
		}
	}
	
	public boolean contains(int n) {
		if (n == this.value)
			return true;
		
		if (n > this.value) {
			if (right == null)
				return false;
			else
				return right.contains(n);
		} else {
			if (left == null)
				return false;
			else
				return left.contains(n);
		}
	}
	
	public boolean containsVerbose(int n) {
		System.out.println (this.value);
		
		if (n == this.value)
			return true;
		
		if (n > this.value) {
			if (right == null)
				return false;
			else
				return right.containsVerbose(n);
		} else {
			if (left == null)
				return false;
			else
				return left.containsVerbose(n);
		}
	}
	
	public String toString() {
		String s = "" + this.value;
		
		if(left!=null) {
			s += ", " + left.toString();
		}
		if(right!=null) {
			s += ", " + right.toString();
		}
		
		return s;
	}
}














