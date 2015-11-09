/**
 * this class user of the library
 */
public interface User {
	
	public String getName();
	
	public int getId();
	
	/**
	 * registers the user to a library, and sets the libraryId
	 */
	public void register(Library library);
	
	public Library getLibrary();
}