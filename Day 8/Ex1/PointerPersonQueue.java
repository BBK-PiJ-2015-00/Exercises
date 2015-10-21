public class PointerPersonQueue implements PersonQueue{
	private PersonNode firstPersonNode;
	
	PointerPersonQueue() {
		this.firstPersonNode = null;
	}
		
	public void insert(Person person) {
		if(this.firstPersonNode == null) {
			this.firstPersonNode = new PersonNode(person);
		} else {
			this.firstPersonNode.insert(person);
		}		
	}
	
	public Person retrieve() {
		PersonNode result = this.firstPersonNode;
		
		if (this.firstPersonNode.getNextNode() != null) {
			this.firstPersonNode = this.firstPersonNode.getNextNode();
		} else {
			this.firstPersonNode = null;
		}
		
		return result.getPerson();
	}
	
	public void print() {
		if(this.firstPersonNode == null) {
			System.out.println ("Queue is empty");
		} else {
			this.firstPersonNode.print();
		}
	}
}