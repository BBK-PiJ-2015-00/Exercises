public class TestPatient {
	public static void main(String[] args) {
		TestPatient tp = new TestPatient();
		tp.launch();
	}
	
	private void launch() {
		Patient p1 = new Patient("bob",30);
		Patient p2 = new Patient("jeb",130);
		Patient p3 = new Patient("jfjksl",300);
		
		String name = p1.getName();
		int age = p1.getAge();
		System.out.println(name + " " + age);
		
		name = p2.getName();
		age = p2.getAge();
		System.out.println(name + " " + age);
		
		name = p3.getName();
		age = p3.getAge();
		System.out.println(name + " " + age);
	}
}