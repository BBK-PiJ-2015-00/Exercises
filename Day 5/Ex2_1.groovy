print (">: ");
int n = Integer.parseInt(System.console().readLine());

//-------------iterative approach
int answer = n;
for(int i = n-1; i > 0; i--) {
	answer *= i;
}
if(answer==0)
	answer=1;
println "loop " + answer;

//-------------recursive approach
println "recursive " + factorial(n);

int factorial(int n) {
	if(n==0)
		return 1;
	if(n==1)
		return n;
	
	return n*factorial(n-1);
}