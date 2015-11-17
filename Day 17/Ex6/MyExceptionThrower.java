public class MyExceptionThrower {
	
	public static void main(String[] args) {
		MyExceptionThrower met = new MyExceptionThrower();
		met.launch();
	}
	
	public void launch() {
		try {
			RuntimeException newException = new MyRuntimeException("hi");
			throw newException;
		} catch (MyRuntimeException ex) {
			ex.printStackTrace();
			System.out.println("ERROR: Exception was thrown: " + ex.getMessage());
		}
	}
}