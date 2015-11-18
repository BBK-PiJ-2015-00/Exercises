import java.lang.Exception;

import java.io.*;

public class Ex3_cat {
	public static void main(String[] args) {
		Ex3_cat test = new Ex3_cat();
		test.launch();
	}
	
	private void launch() {
		System.out.print("Input name of file you wish to view: ");
		String fileName = System.console().readLine();
		
		File file = new File("./" + fileName);
			
		try (BufferedReader in = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException ex) {
			System.out.println("File " + fileName + " does not exist.");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}

