public class Ex3a {
	public static void main(String[] args) {
		Ex3a test = new Ex3a();
		test.launch();
	}
	
	private void launch() {
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum+=readInt();
		}
		double mean = sum/10.0;
		System.out.println(mean);
	}
	
	private int readInt() {
		int result = 0;
		while(true) {
			try {
				System.out.print("Input number: ");
				result = Integer.parseInt(System.console().readLine());
				return result;
			} catch (NumberFormatException ex){
				System.out.println("Incorrect input, please input an int.");
			}
		}		
	}
}