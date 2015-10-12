print ("1: Decimal to binary  2: Binary to decimal >: ");
while (true) {
	String reply = System.Console().readLine();

	if(reply=="1") {
		decimalPrompt();
		break;
	} else if (reply=="2") {
		binaryPrompt();
		break;
	} else
		println("inrecognised input.");
}

void decimalPrompt() {
	print ("input decimal: ");
	String decimal = System.console().readLine();
	println (">: " + decimal2binary(decimal));
}

void binaryPrompt() {
	print ("input binary string: ");
	String binary = System.console().readLine();
	println (">: " + binary2decimal(binary));
}

int decimal2binary(String d) {
	
}

int binary2decimal(String b) {
	int answer = 0;
	
	int power = b.length()-1;
	for (int i=0;i<b.length();i++) {
		char ch = b.charAt(i);
		switch (ch) {
			case '1':
				answer += powerOf(2,power);
				break;
			case '0':
				//do nothing;
				break;
			default:
				println ("not binary");
				break;
		}
		power--;
	}
	
	return answer;
}

int powerOf(int x, int p) {
	if(p==0) return 1;
	if(p==1) return x;
	return x*powerOf(x,p-1);
}