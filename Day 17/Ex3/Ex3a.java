public class Ex3a {
	public static void main(String[] args) {
		Ex3a test = new Ex3a();
		test.launch();
	}
	
	private void launch() {
		System.out.println("Input how many numbers you wish to find the mean of.");
		int size = readInt();
		
		System.out.println("Now the numbers you wish to add together.");
		int sum = 0;
		for(int i = 0; i < size; i++) {
			sum+=readInt();
		}
		double mean = sum/(0.0 + size);
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