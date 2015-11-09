import java.util.*;

public class LibraryImpl implements Library {
	private String name;
	private int maxBooksPerUser;
	private List<String> registeredUsersList;
	private List<Integer> registeredUsersIdList;
	private List<Book> bookList;
	private List<Boolean> taken;
	
	public LibraryImpl(String name, int maxBooksPerUser) {
		this.name = name;
		this.maxBooksPerUser = maxBooksPerUser;
		this.registeredUsersList = new ArrayList<String>();
		this.registeredUsersIdList = new ArrayList<Integer>();
		this.bookList = new ArrayList<Book>();
		this.taken = new ArrayList<Boolean>();
	}
	
	public LibraryImpl(String name) {
		this.name = name;		
		this.registeredUsersList = new ArrayList<String>();
		this.registeredUsersIdList = new ArrayList<Integer>();
		this.bookList = new ArrayList<Book>();
		this.taken = new ArrayList<Boolean>();
	}
	
	public int getId(String name) {
		//check users and returns Id if there is a match	
		int size = registeredUsersList.size();
		if(size!=0) {			
			for(int i = 0; i < size; i++) {
				if(name==registeredUsersList.get(i)) {
					return registeredUsersIdList.get(i);
				}
			}
		}
		//if there is no match then register a new User
		//first user Id = 100, second is 101 etc.
		int uniqueId = 100+size;
		registeredUsersList.add(name);
		registeredUsersIdList.add(uniqueId);
		
		return uniqueId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getMaxBooksPerUser() {
		return this.maxBooksPerUser;
	}
	
	public void setMaxBooksPerUser(int newCap) {
		this.maxBooksPerUser = newCap;
	}
	
	public void addBook(String author, String title) {
		Book book = new BookImpl(author, title);
		bookList.add(book);
		taken.add(false);
	}
	
	public Book takeBook(String title) {
		for(int i = 0; i < bookList.size(); i++) {
			Book book = bookList.get(i);
			if(title.equals(book.getTitle()) && !taken.get(i)) {
				taken.set(i, true);
				return book;
			}
		}
		
		return null;
	}
	
	public void returnBook(Book book) {
		for(int i = 0; i < bookList.size(); i++) {
			if(book.equals(bookList.get(i)) && taken.get(i)) {
				taken.set(i, false);
				break;
			}
		}
	}
}

























