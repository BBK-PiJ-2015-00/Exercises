//--------------Power

print ">: ";
int num = Integer.parseInt(System.console().readLine());
print "^ ";
int exp = Integer.parseInt(System.console().readLine());

//-----------iterative
int answer = (num==0)? 1:num;
for(int i = 2; i <= exp; i++) {
	answer *= num;
}
println answer;

//-----------recursive
println power(num,exp);

int power (int n, int e) {
	if(e==1)
		return n;
	if(e==0)
		return 1;
		
	return n*power(n, e-1);
}