public class Test {
	public static void main (String[] args) {
		Test t = new Test();
		Guitar g1 = new Guitar();
		
		g1.changeStrings();
		t.testPlay(g1);
		t.testBurn(g1);
		g1 = null;
	}
	private void testBurn(WoodenObject wood) {
		wood.burn();
	}
	private void testPlay(MusicalInstrument music) {
		music.play();
	}
}