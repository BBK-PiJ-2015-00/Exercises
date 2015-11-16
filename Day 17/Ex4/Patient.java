public class Patient {
	private int age;
	private String name;
	
	public Patient(String name, int age) {
		try {	
			if(age>130) {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException ex) {
			System.out.println("Exception, patient cannot be over 130 years old");
			return;
		}
		
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}