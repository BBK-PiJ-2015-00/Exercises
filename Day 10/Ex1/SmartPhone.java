public class SmartPhone extends MobilePhone {
	public SmartPhone(String brand) {
		super(brand);
	}
	public SmartPhone() {
		super();
	}
	
	public void browseWeb(String website) {
		System.out.println ("Opening " + website + "...");
	}
	
	public void findPosition() {
		System.out.println ("You are here: **-**-**-**");
	}
	
	@Override
	public void call(String number) {
		if(number.length() < 2) {
			System.out.println("Invalid number.");
			return;
		}
		//if first two digits are "00" make internet call
		String begining = number.substring(0,2);
		
		if(begining.equals("00")) {
			System.out.println("Calling <" + number + "> through the internet...");
		} else {
			super.call(number);
		}
	}
}