//----------- paper size
String p;
boolean finished = false;
while (!finished) {
	print ">: ";
	p = System.console().readLine();
	
	char ch = p.charAt(0) 
	if(ch=='A' || ch=='a')
		finished = true;
	else
		println "Incorrect input, please begin with A";
}

String sizeString = p.substring(1, p.size()); //remove the 'A'

int paperSize;
if(sizeString.charAt(0) == '0')
	paperSize = 1 - sizeString.length(); //1 zero = 0, 2 zeros = -1
else
	paperSize = Integer.parseInt(sizeString);
	
/*	
int x = sizeOf(paperSize);


int sizeOf(int a) {
	
	
	return 
}
*/
