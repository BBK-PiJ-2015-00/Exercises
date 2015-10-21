public class SupermarketScript{
	PersonQueue queue;
	
	public static void main (String[] args) {
		
		
		SupermarketScript pqs = new PersonQueueScript();
		pqs.launch();		
	}
	
	public void launch() {
		this.queue = new PointerPersonQueue();
	}
	
	public void testQueue() {
		addPerson(new Person("abe",4));
		servePerson();
		
		queue.print();
	}
	public void addPerson(Person p) {
		
	}
	private void servePerson() {
		
	}
}