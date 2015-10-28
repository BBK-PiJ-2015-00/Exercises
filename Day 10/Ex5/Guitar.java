public class Guitar implements MusicalInstrument, WoodenObject {
	public void play() {
		System.out.println("makes some sounds");
	}
	
	public void burn() {
		System.out.println ("Burning...");
	}
	
	public void changeStrings() {
		System.out.println("Changing strings");
	}
}