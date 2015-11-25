import java.util.*;

public class Tasks implements Runnable{
	
	private int taskNum;
	private int time;
	private static String buffer = "";
	
	public Tasks(int taskNum, int time) {
		this.taskNum = taskNum;
		this.time = time;
	}
	
	public Tasks() {
		this.taskNum = -1;
		this.time = -1;
	}
	
	public static void main(String args[]) {
		Tasks test = new Tasks();
		test.launch();
	}
	
	public void launch() {		
		
		for(int taskNum = 0; taskNum <= 5; taskNum++) {			
			System.out.print("Enter the duration (in ms) of task " + taskNum + ": ");
			int time = getTime();
			
			Tasks t1 = new Tasks(taskNum, time);
			
			Thread thread = new Thread(t1);
			thread.start();
			if(!buffer.equals("")) {
				System.out.println("Finished tasks: " + buffer);
				buffer = "";
			}
		}
	}

	public int getTime() {
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		return result;
	}
	
	public void run() {
		try {
			Thread.sleep(time);	
		} catch (InterruptedException ex){
			ex.printStackTrace();
		}
		//System.out.println("Task " + taskNum + " has finished.");
		
		if(!buffer.equals("")) {
			buffer += ", " + taskNum;
		} else {
			buffer += "" + taskNum;
		}
	}
}