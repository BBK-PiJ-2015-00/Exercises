public class TestSortedSet {
	public static void main (String[] args) {
		TestSortedSet TestSortedSet = new TestSortedSet();
		TestSortedSet.launch();
		System.out.println ("END");
	}
	
	private void launch() {
		IntSortedSet tree = new TreeIntSortedSet(10);
		IntSortedSet list = new ListIntSortedSet(10);
		
		//test(tree);
		test(list);
	}
	
	private void test(IntSortedSet set) {
		set.add(5);
		set.add(2);
		set.add(9);
		set.add(3);
		set.add(1);
		set.add(6);
		set.add(8);
		
		System.out.println (set.toString());
		
		System.out.println ((set.contains(6))? "Yes" : "No");
		
		if(set.containsVerbose(-1))
			System.out.println ("Yep");
		else
			System.out.println ("Nope");
	}
}