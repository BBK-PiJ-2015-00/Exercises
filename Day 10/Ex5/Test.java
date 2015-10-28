public class Test {
	public static void main (String[] args) {
		Guitar g1 = new Guitar();
		
		g1.play();
		g1.changeStrings();
		g1.burn();
		g1 = null;
	}
}