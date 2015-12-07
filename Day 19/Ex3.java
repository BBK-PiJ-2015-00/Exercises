public class Ex3 {
	
	public static void main(String args[]) {
		Ex3 start = new Ex3();
		start.launch();
	}
	
	private void launch() {
		String a = "100";
		String b = "00000";		
		boolean test = betterEntry(a, b, (s1, s2) -> (s1.length()-s2.length()) > 0);
		System.out.println((test)? "a is better":"b is better");
		
		int x = 10;
		int y = 200;
		test = betterEntry(x, y, (num1, num2) -> (num1-num2) > 0);		
		System.out.println((test)? "x is better":"y is better");
	}
	
	private <T> boolean betterEntry(T obj1, T obj2, TwoElementPredicate<T> compare) {
		return compare.isBetter(obj1, obj2);
	}
	
	public interface TwoElementPredicate<T>{
		public boolean isBetter(T obj1, T obj2);
	}
}