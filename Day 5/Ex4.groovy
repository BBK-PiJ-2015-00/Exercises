//--------------Palindrome

print ">: ";
String word = System.console().readLine();


String reply = (palindrome(word))? "Yes":"No";

println reply;

boolean palindrome(String s) {	
	int size = s.length();
	if(size==0 || size==1)
		return true;
	
	String sub = s.substring(1,size-1);
	
	if(s.charAt(0)==s.charAt(size-1))
		return palindrome(sub);
	else
		return false;
}