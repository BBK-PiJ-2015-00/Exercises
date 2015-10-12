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
int paperSize = Integer.parseInt(sizeString);
