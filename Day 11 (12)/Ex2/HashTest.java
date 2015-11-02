import org.junit.*;
import static org.junit.Assert.*;

public class HashTest {
	@Test
	public void testSimpleHash() {
		SimpleHash hash = new SimpleHash();
		int length;
		int j;
		for (length = 0; length <= 11; length++) {
			String s = "";
			for (j = 0; j < length; j++) {
				s += "a";
			}
			int output = hash.gernerateKey(s);
			int expected = length%10;
			String str = "length: "+length+"j: "+j;
			assertEquals(str, expected, output);
		}
	}
}