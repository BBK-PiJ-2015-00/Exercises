public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		Phone old = new OldPhone();
		MobilePhone mobile = new MobilePhone();
		SmartPhone smart = new SmartPhone();
		
		old.call("000 *****");
		mobTest(mobile);
		mobTest(smart);
		
		smart.browseWeb("Google");
		smart.findPosition();
	}
	
	public void mobTest(MobilePhone phone) {
		phone.call("111 *****");
		phone.call("222 *****");
		
		phone.getMemory();
		
		phone.ringAlarm("Ring");
		phone.playGame("Fallout Shelter");
	}
	
}