public class Ex3 {
	
	public static void main(String args[]) {
		Ex3 start = new Ex3();
		start.launch();
	}
	
	private void launch() {
		String a = "100";
		String b = "00000";
		
		boolean test = betterString(a, b, (s1, s2) -> (s1.length()-s2.length()) > 0);
		
		String message = (test)? "a is better":"b is better";
		System.out.println(message);
	}
	
	private boolean betterString(String s1, String s2, TwoStringPredicate compare) {
		return compare.isBetter(s1, s2);
	}
	
	public interface TwoStringPredicate{
		public boolean isBetter(String s1, String s2);
	}
}