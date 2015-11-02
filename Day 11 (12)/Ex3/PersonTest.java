import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
	@Test
	public void testsNormalName() {
		Person p = new Person();
		String input = "Dereck Robert  Yssirt";
		
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);
		//countSpaces(input);
	}
	
	public void countSpaces(String str) {
		boolean noExtraSpace = true;
		char last;
		char current = str.charAt(0);
		for(int i = 1; i < str.length(); i++) {
			last = current;
			current = str.charAt(i);
			
			if(last==' ') {
				if(current==' ') {
					noExtraSpace = false;
				}
			}
		}
		
		assertTrue("Double space or greater", noExtraSpace);
	}
}