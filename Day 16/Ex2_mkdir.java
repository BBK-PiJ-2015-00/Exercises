import java.io.File;

public class Ex2_mkdir { 
	public static void main(String[] args) {
		Ex2_mkdir test = new Ex2_mkdir();
		test.launch();
	}
	
	private void launch() {
		System.out.print("Input name of new dir: ");
		String dirName = System.console().readLine();
		
		File file = new File("./" + dirName);
		
		if(file.mkdir()) {
			System.out.println("SUCCESS: " + dirName + " was created.");
		} else {
			System.out.println("FAILED: " + dirName + " was not created.");
		}
	}	
}