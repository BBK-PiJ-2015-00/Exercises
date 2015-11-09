import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBook {
	private Book book;
	private User user;
	private Library library;
	
	@Before
	public void create() {
		book = new BookImpl("Bob", "How to touch your toes");
		user = new UserImpl("Joe");
		library = new LibraryImpl("Library name");
	}
	
	@Test
	public void testCreate() {
		assertNotNull(book);
		assertEquals(book.getClass(), BookImpl.class);
		
		assertNotNull(user);
		assertEquals(user.getClass(), UserImpl.class);
		
		assertNotNull(library);
		assertEquals(library.getClass(), LibraryImpl.class);
	}
	
	//test book
	@Test 
	public void testGetAuthor() {
		String author = book.getAuthor();
		assertEquals("Bob", author);
		assertNotEquals("Harry", author);
	}
	
	@Test
	public void testGetTitle() {
		String title = book.getTitle();
		assertEquals("How to touch your toes", title);
		assertNotEquals("When to not pick your nose", title);
	}
	
	//test user
	@Test
	public void testGetUserName() {
		String name = user.getName();
		assertEquals("Joe",name);
		assertNotEquals("*u*",name);		
	}
	
	//test library
	@Test
	public void testRegisterUser() {
		user.register(library);
		assertEquals(100, user.getId());
		
		//register new user
		User user2 = new UserImpl("Jeb");
		user2.register(library);		
		assertEquals(101, user2.getId());			
	}
	
	@Test
	public void testLibraryGetId() {
		testRegisterUser();
		
		assertEquals(100, library.getId("Joe"));
		assertEquals(101, library.getId("Jeb"));
		assertEquals(102, library.getId("Arthur"));	
	}
	
	@Test
	public void testLibraryGetName() {
		String name = library.getName();
		assertEquals("Library name", name);
	}
	
	@Test
	public void testAddBook() {
		library.addBook("Gerald", "When tables learn");
		library.addBook("Gresilwalth", "Dealing with weird names");
	}
	
	@Test
	public void testtakeBook() {
		testAddBook();
		
		Book book1 = new BookImpl("Gerald", "When tables learn");
		Book book2 = new BookImpl("Gresilwalth", "Dealing with weird names");		
		assertEquals(book1, library.takeBook("When tables learn"));
		assertEquals(book2, library.takeBook("Dealing with weird names"));
		assertNull(library.takeBook("dud book"));
	}
}






















