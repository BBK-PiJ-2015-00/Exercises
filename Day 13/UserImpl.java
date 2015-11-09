public class UserImpl implements User {
	private int libraryId;
	private String name;
	private Library library;
	
	public UserImpl(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.libraryId;
	}
	
	public void register(Library library) {
		this.libraryId = library.getId(this.name);
		this.library = library;
	}
	
	public Library getLibrary() {
		return this.library;
	}
}