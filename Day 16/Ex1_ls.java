import java.io.File;

public class Ex1_ls {
	public static void main(String[] ars) {
		Ex1_ls test = new Ex1_ls();
		test.launch();
	}
	
	private void launch() {
		File file = new File(".");
		//System.out.println(file.getAbsolutePath());
		//System.out.println(file.getPath());	
		
		File[] fileList = file.listFiles();
		
		for(File f : fileList) {
			System.out.println(f.getName());
		}
	}
}