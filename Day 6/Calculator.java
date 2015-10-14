public class Calculator {
	void add(int a, int b) {
		System.out.println (a+b);
	}
	void subtract(int a, int b){
		System.out.println (a-b);
	}
	void multiply(int a, int b){
		System.out.println (a*b);
	}
	void divide(int a, int b){
		double x = (double) a;
		double y = (double) b;
		System.out.println (x/y);
	}
	void modulus(int a, int b) {
		System.out.println (a%b);
	}	
}