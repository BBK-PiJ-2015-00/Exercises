public class Ex1 {
	public static void main(String[] args) {
		System.out.println ("Hello");
		
		Calculator.add(2,4);
		Calculator.divide(5,3);
	}	
}
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