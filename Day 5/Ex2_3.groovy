//----------Hanoi Towers
print ">: ";
int num = Integer.parseInt(System.console().readLine());

println tower(num);

int tower(int n) {
	if(n==1)
		return 1;
	
	return 2*tower(n-1) + 1;
}