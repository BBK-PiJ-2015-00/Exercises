import java.util.functions.IntFunction;
import java.util.stream.LongStream;

public class Factorials {
	private static final int LIMIT = 100;	
	
	public  static void main(String[] args) {
		System.out.println (timer (25, Factorials::factorialRecursive));
		System.out.println (timer (25, Factorials::factorialIterative));
		System.out.println (timer (25, Factorials::factorial));
	}
	
	public static long factorialRecursive(int n) {
		if(n > LIMIT) throw new IllegalArgumentException(n + " is out of bounds.");		
		return (n<=1)? 1 : (long) n * factorialRecursive(n-1);
	}
	
	public static long factorialIterative(int n) {
		if(n > LIMIT) throw new IllegalArgumentException(n + " is out of bounds.");		
		
		long result = 1;		
		for(int i = 2; i <= n; i++) {
			result *= i;
		}		
		return result;
	}
	
	public static long factorial(int n) {
		if(n > LIMIT) throw new IllegalArgumentException(n + " is out of bounds.");		
		if(n<=1) return 1;
		return LongStream.rangeClosed(2, n).reduce(1, (a, b) -> a*b);
	}
	
	//IntFunction<T> parameter is an int, returns object of type <T>.
	private static long timer(int i, IntFunction<Long> aMethod) {
		long startTime = System.currentTimeMillis();
		long res = aMethod.apply(i);
	}
}