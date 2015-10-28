public class MobilePhone extends OldPhone{
	protected static final int mobMemory = 10;
	protected int memoryPointer = 0;
	private String[] lastNumbers = new String[mobMemory];
	
	public void ringAlarm(String alarm) {
		System.out.println (alarm + "! " + alarm + "!"); 
	}
	
	public void playGame(String game) {
		System.out.println ("Running " + game + "...");
	}
	
	@Override
	public void call(String number) {
		super.call(number);
		remember(number);
	}
	
	protected void remember(String number) {
		//if at memory limit, overwrite first element
		if(memoryPointer == mobMemory) {
			memoryPointer = 0;
		}
		
		lastNumbers[memoryPointer] = number;
		memoryPointer++;
		
		System.out.println (number + " has been remembered.");
	}
	
	public void getMemory() {
		System.out.print("Accessing memory... ");
	
		if(lastNumbers[0] == null) {
			System.out.print("No numbers stored.\n");
			return;
		}		
		for (int i = 0; i < mobMemory; i++) {
			if(lastNumbers[i] == null) {
				System.out.print("\n");
				return;
			}
			
			System.out.print("\n" + lastNumbers[i]);
		}
		System.out.print("\n");
	}
}