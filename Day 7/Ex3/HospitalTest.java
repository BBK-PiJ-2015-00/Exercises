public class HospitalTest{
	
	public static void main(String args[]) {
		Hospital Kings = new Hospital();
		Kings.launch();		
		
		Patient p100 = new Patient(100, "John", 32, "Piles");
		Patient p101 = new Patient(101, "Gertrud", 63, "The bends");
		Patient p102 = new Patient(102, "Harry", 18, "Potter accident");
		Patient p103 = new Patient(103, "Butch", 29, "Broken cocyx");
		Patient p104 = new Patient(104, "Glenda", 12, "Small cut");
		Patient dud = new Patient(403, "patientList", 304, "bad breath");
		
		Kings.add(p100);
		Kings.add(p101);
		Kings.add(p102);
		Kings.add(p103);
		Kings.add(p104);
		Kings.add(dud);
		
		System.out.println ("There are " + Kings.getCount() + " patients.\n");
		
		Kings.delete(p100);
		Kings.delete(dud);
		
		Kings.print();
		
		System.out.println ("There are " + Kings.getCount() + " patients.");
	}	
}

/*-------Notes-------------
This structure is performance-wise unnecessary.
This design though is arguably superior because it 
separates code and restricts any change from
affecting the previous code. This means that people
can call functions without needing to know how it
works. They just know that it works, and there is no
way of accidentally breaking it.
*/

