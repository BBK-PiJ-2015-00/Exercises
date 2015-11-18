import java.lang.Exception;
import java.io.*;

public class Ex4_cp {
	public static void main(String[] args) {
		Ex4_cp test = new Ex4_cp();
		String finalMessage = test.launch();
		System.out.println(finalMessage);
	}
	
	private String launch() {	
	
		String firstFileName = retrieveInput("File you wish to copy: ");
		File firstFile = new File("./" + firstFileName);
		if(!firstFile.exists() || !firstFile.isFile()) {
			return firstFileName + " is not a file.";
		}
		
		String secondFileName = retrieveInput("File you wish to copy to: ");
		File secondFile = doSecondFileMethod(secondFileName);
		
		createFile(secondFile);
		
		try(BufferedReader in = new BufferedReader(new FileReader(firstFile));
		    PrintWriter   out = new PrintWriter(secondFile)) {
			
			String line;
			while((line = in.readLine()) != null) {
				out.write(line);
			}
		} catch (FileNotFoundException ex) {
			System.out.println("File does not exist.");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		return firstFileName + " was successfully copied to " + secondFileName + ".";
	} 
	
	private void createFile(File file) {
		try {
			file.createNewFile();
		} catch (IOException ex){
			//do something
		} finally {
			//close file
		}
	}
	
	private File doSecondFileMethod(String fileName) {
		
		File file = new File("./" + fileName);
		if(file.exists() && file.isFile()) {
			String answer = getAnswer();			
			if(answer=="N") {
				return firstFileName + " was not copied to " + fileName + ".";
			}
			
			file.delete();
		}
		return file;
	}
	
	
	private String retrieveInput(String message) {
		System.out.print(message);
		return System.console().readLine();
	}
	
	private String getAnswer() {
		String answer = "N";
		boolean waitingForAnswer = true;
		while(waitingForAnswer) {	
			answer = retrieveInput("File already exists, do you want to overwrite it? (Y/N) ");
			if(answer!="Y"&&answer!="N") {
				System.out.println("Please input either Y or N.");
			} else {
				waitingForAnswer = false;
			}
		}
		return answer;
	}
	

}







