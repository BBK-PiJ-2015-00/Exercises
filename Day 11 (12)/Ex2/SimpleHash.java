public class SimpleHash {
	public int gernerateKey(String s) {
		return s.length() % 10;
	}
}