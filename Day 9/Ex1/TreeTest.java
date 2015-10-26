public class TreeTest {
	public static void main (String[] args) {
		TreeTest test = new TreeTest();
		test.launch();
		System.out.println("End of test");
	}
	
	private void launch() {
		IntegerTreeNode tree = new IntegerTreeNode(10);
		
		testTree(tree, 5);		
		testTree(tree, 9);
		testTree(tree, 2);
		testTree(tree, 6);
		testTree(tree, 3);
		testTree(tree, 7);
		testTree(tree, 8);
		testTree(tree, 1);
		
		String s = "";
		s += (tree.contains(3))? "Yes " : "No ";
		
		s += tree.getMax() + " ";
		s += tree.getMin();
		
		System.out.println (s);
	}
	private void testTree(IntegerTreeNode tree, int value) {
		tree.add(value);
		System.out.println(tree.toString());
	}
	
}