import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrimeDivisorListShould {
	private PrimeDivisorList primeDivisorList;
	
	@Before
	public void create() {
		primeDivisorList = new PrimeDivisorList();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void throwIllegalArgumentExceptionWhenAddingNotPrime() {
		primeDivisorList.add(4);
	}
	
	@Test(expected = NullPointerException.class)
	public void throwNullPointerExceptionWhenAddingNull() {
		Integer dud = null;
		primeDivisorList.add(dud);
	}
	
	@Test
	public void addPrimes() {
		primeDivisorList.add(2);
		primeDivisorList.add(3);
		primeDivisorList.add(7);
		primeDivisorList.add(3);
	}
	
	@Test
	public void overideToString() {
		addPrimes();
		
		String expected = "[ 2 * 3^2 * 7 = 126 ]";
		String actual = primeDivisorList.toString();
		
		assertEquals(expected, actual);
	}
}