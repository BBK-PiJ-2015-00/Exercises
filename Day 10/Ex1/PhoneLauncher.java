public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		Phone old = new OldPhone();
		MobilePhone mobile = new MobilePhone("Nokia");
		SmartPhone smart = new SmartPhone("Samsung");
		
		old.call("555 *****");
		mobTest(mobile);
		mobTest(smart);
		
		smart.call("001");
		smart.browseWeb("Google");
		smart.findPosition();
	}
	
	public void mobTest(MobilePhone phone) {
		System.out.println(phone.getBrand());
		phone.call("111 *****");
		phone.call("002 *****");
		
		phone.getMemory();
		
		phone.ringAlarm("Ring");
		phone.playGame("Fallout Shelter");
	}
	
}