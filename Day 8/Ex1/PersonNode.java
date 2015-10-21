public class PersonNode {
	private Person person;
	private PersonNode nextPersonNode;
	
	PersonNode(Person p) {
		this.person = p;
		this.nextPersonNode = null;
	}
	
	public PersonNode getNextNode() {
		return this.nextPersonNode;
	}
	
	public void insert(Person person) {
		if(this.nextPersonNode == null) {
			this.nextPersonNode = new PersonNode(person);
			return;
		} else {
			this.nextPersonNode.insert(person);
		}		
	}
	
	public void print() {
		System.out.println (this.person.getName() + " " + this.person.getAge());
		System.out.println ("");
		
		if(this.nextPersonNode != null) {
			this.nextPersonNode.print();
		}
	}
	
	public Person getPerson() {
		return this.person;
	}
}