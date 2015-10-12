//-------Fibonacci--
print ">: ";
int num = Integer.parseInt(System.console().readLine());

//--------Recursive
println fib(num);

int fib(int n) {
	if (n==1||n==2)
		return 1;
	
	return (fib(n-1) + fib(n-2));
}