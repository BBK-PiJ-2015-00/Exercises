public class Patient {
	private int pID;
	private String name;
	private int age;	
	private String illness;
	private Patient nextPatient;
	
	public Patient(int pID, String name, int age, String illness) {
		this.pID = pID;
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}
	
	public Patient(String s) {
		this.name = s;
		this.nextPatient = null;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getID() {
		return this.pID;
	}
	
	public void print() {
		if(this.name!="patientList") {
			System.out.println("ID:\t" + this.pID);
			System.out.println("Patient:" + this.name);
			System.out.println("Age:\t" + this.age);
			System.out.println("Illness:" + this.illness + "\n");
		}
		
		if(this.nextPatient != null) {
			this.nextPatient.print();
		}
	}
	
	public void addPatient(Patient newPatient) {
		if (this.nextPatient == null) {
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public boolean deletePatient(Patient patient) {
		if (this.nextPatient == null) {
			return false;
		} else if (this.nextPatient.pID == patient.pID) {
			this.nextPatient = nextPatient.nextPatient;
			return true;
		} else {
			return this.nextPatient.deletePatient(patient);
		}
	}
	
	public int countPatients() {
		if(this.nextPatient == null) {
			return 1;
		}
		else
			return 1 + this.nextPatient.countPatients();
	}
}
