public class TestSet {
	public static void main (String[] args) {
		TestSet testSet = new TestSet();
		testSet.launch();
		System.out.println ("END");
	}
	
	private void launch() {
		IntSet tree = new TreeIntSet(10);
		
		test(tree);
	}
	
	private void test(IntSet set) {
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