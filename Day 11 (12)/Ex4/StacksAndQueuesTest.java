import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StacksAndQueuesTest {
	
	StringStack stackArray;
	StringStack stackPointer;

	@Before
	public void setUp() throws Exception {
		stackArray=  new ArrayStringStack();
		stackPointer = new PointerStringStack();
	}


	
	@Test 
	public void testCreate(){
		assertNotNull(stackArray);
		assertNotNull(stackPointer);
		assertTrue(stackArray.getClass()==ArrayStringStack.class);
		assertTrue(stackPointer.getClass()==PointerStringStack.class);
		
	}
	
	@Test
	public void testIsEmpty() {
		assertTrue(stackArray.isEmpty());
		assertTrue(stackPointer.isEmpty());
	}
	
	@Test
	public void testPop() {
		testPush();

		assertEquals("testThree",stackArray.pop());
		assertEquals("testThree",stackPointer.pop());

		assertFalse(stackArray.isEmpty());
		assertFalse(stackPointer.isEmpty());
		
		assertEquals("testTwo",stackArray.pop());
		assertEquals("testTwo",stackPointer.pop());

		assertFalse(stackArray.isEmpty());
		assertFalse(stackPointer.isEmpty());
		assertEquals("testOne",stackArray.pop());
		assertEquals("testOne",stackPointer.pop());
		assertTrue(stackArray.isEmpty());
		assertTrue(stackPointer.isEmpty());
		assertNull("return null", stackArray.pop());
		assertNull("return null", stackPointer.pop());
	}
	
	@Test
	public void testPeek() {
		testPush();
		assertEquals("testThree",stackArray.peek());
		assertEquals("testThree",stackPointer.peek());
		assertFalse(stackArray.isEmpty());
		assertFalse(stackPointer.isEmpty());
		assertNotNull("return null", stackArray.peek());
		assertNotNull("return null", stackPointer.peek());
		
		assertEquals("testThree",stackArray.pop());
		assertEquals("testThree",stackPointer.pop());
		
		assertEquals("testTwo",stackArray.peek());
		assertEquals("testTwo",stackPointer.peek());
		assertFalse(stackArray.isEmpty());
		assertFalse(stackPointer.isEmpty());
	}
	
	@Test
	public void testPush() {
		testIsEmpty();
		stackArray.push("testOne");
		stackPointer.push("testOne");
		assertFalse(stackArray.isEmpty());
		assertFalse(stackPointer.isEmpty());
		stackArray.push("testTwo");
		stackPointer.push("testTwo");
		stackArray.push("testThree");
		stackPointer.push("testThree");
	}
}