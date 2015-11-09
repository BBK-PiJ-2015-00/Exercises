public interface Library {
	public int getId(String name);
	
	public String getName();
	
	public int getMaxBooksPerUser();
	
	public void setMaxBooksPerUser(int newCap);
	
	/*
	 * Adds a book to the list of books
	 */	
	public void addBook(String author, String title);
	
	/*
	 * marks book taken. If book does not exist then returns null.
	 */	
	public Book takeBook(String title);
	
	/*
	 * marks book as not taken.
	 */	
	public void returnBook(Book book);
}