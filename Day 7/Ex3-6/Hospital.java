public class Hospital{
	private Patient patientList;
	
	public void launch() {
		this.patientList = new Patient("patientList");
	}
	
	public void add(Patient p) {
		if(p.getName()=="patientList") {
			System.out.println("Error: reserved name");
			return;
		}
		this.patientList.addPatient(p);
	}
	
	public void delete(Patient p) {
		if(this.patientList.deletePatient(p))
			System.out.println ("Patient " + p.getID() + " deleted.\n");
		else
			System.out.println ("Patient " + p.getID() + " does not exist.\n");
	}
	
	public void print() {
		this.patientList.print();
	}
	
	public int getCount() {
		//object patientList is counted so -1 is needed.
		return this.patientList.countPatients() - 1;
	}
}