public class TreeTest {
	public static void main (String[] args) {
		TreeTest test = new TreeTest();
		test.launch();
		System.out.println("End of test");
	}
	
	private void launch() {
		IntegerTreeNode tree = new IntegerTreeNode(10);
		
		tree.add(5);
		tree.add(9);
		tree.add(2);
		tree.add(6);
		tree.add(3);
		tree.add(7);
		tree.add(8);
		tree.add(1);
		
		String s = "";
		s += (tree.contains(3))? "Yes " : "No ";
		
		s += tree.getMax() + " ";
		s += tree.getMin();
		
		System.out.println (s);
	}
}