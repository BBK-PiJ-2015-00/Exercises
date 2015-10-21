public class SupermarketScript{
	PersonQueue queue;
	
	public static void main (String[] args) {		
		SupermarketScript pqs = new SupermarketScript();
		pqs.launch();		
	}
	
	public void launch() {
		this.queue = new PointerPersonQueue();
		testQueue();
	}
	
	public void testQueue() {
		addPerson(new Person("abe",4));
		addPerson(new Person("bob",6));
		addPerson(new Person("cat",5));
		addPerson(new Person("des",2));
		addPerson(new Person("erl",8));
		addPerson(new Person("fig",6));
		
		servePerson();
		
		this.queue.print();
	}
	public void addPerson(Person p) {
		this.queue.insert(p);
	}
	private void servePerson() {
		this.queue.retrieve();
	}
}