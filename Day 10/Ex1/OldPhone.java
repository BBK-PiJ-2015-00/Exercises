public class OldPhone implements Phone{
	private String brand;
	
	public OldPhone(String brand) {
		this.brand = brand;
	}
	public OldPhone() {
		this.brand = null;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void call(String number) {
		System.out.println ("Calling <" + number + ">...");
	}
}