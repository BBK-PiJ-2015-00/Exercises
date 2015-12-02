import java.util.*;
import java.lang.*;

public class ex1 {
	public static void main (String args[]) {
		String[] array = new String[10];
		
		for (int i = 0; i < 10; i++) {
			double x = i+(Math.random()*10);
			array[i] = x + "";
		}
		
		System.out.println("Unsorted.");
		for(String s : array) {
			System.out.println(s);
		}
		
		Arrays.sort(array, (s1, s2) -> s1.length() - s2.length());
		
		System.out.println("Sorted.");
		System.out.println(Arrays.asList(array));
	}		
}