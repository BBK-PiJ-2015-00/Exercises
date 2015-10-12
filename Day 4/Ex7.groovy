Integer2 i2 = new Integer2();
print "Enter a number: ";
String str = System.console().readLine();
int i = Integer.parseInt(str);
i2.setValue(i);
print "The number you entered is "
if (i2.isEven()) {
println "even.";
} else if (i2.isOdd()) {
println "odd.";
} else {
println "undefined!! Your code is buggy!";
}
int parsedInt = Integer.parseInt(i2.toString());
if (parsedInt == i2.getValue()) {
println("Your toString() method seems to work fine.");
}

class Integer2 {
	int x;
	
	int getValue() {
		return this.x;
	}
	void setValue(int x) {
		this.x = x;
	}
	boolean isEven() {
		if(this.x==0) return true;
		return this.x%2==0;
	}
	boolean isOdd() {
		if(this.x==0) return false;
		return this.x%2!=0;
	}
	String toString() {
		String s = this.x;
		return s;
	}
}