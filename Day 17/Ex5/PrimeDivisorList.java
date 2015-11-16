import java.util.*;
import java.util.Collections;

public class PrimeDivisorList {
	private List<Integer> primeDivs;
	
	public PrimeDivisorList() {
		this.primeDivs = new ArrayList<Integer>();
	}
	
	public void add(Integer n) {
		if(n==null) {
			throw new NullPointerException();
		} else if (notPrime(n)) {
			throw new IllegalArgumentException();
		}
		
		primeDivs.add(n);
	}
	
	public boolean notPrime(int num) {
		for (int i = 2; i < num; i++) {
			if(num%i==0)
				return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		Collections.sort(primeDivs);
		String stringResult = "[ ";
		int intResult = 1;
		int count = 0;
		
		int size = primeDivs.size();
		for(int i = 0; i < size; i++) {
			int n = primeDivs.get(i);
			count++;
			if(i < size-1) {
				int next = primeDivs.get(i+1);
				if(n==next) {
					continue;
				} else if (count > 1) {
					stringResult += n + "^" + count + " * ";
					intResult *= power(n, count);
					count = 0;
				} else {
					stringResult += n + " * ";
					intResult *= n;
					count = 0;
				}
			} else {
				if(count==1) {
					stringResult += n + " = ";
					intResult *= n;
				} else {
					stringResult += n + "^" + count + " = ";
					intResult *= power(n, count);
				}
			}			
		}
		
		stringResult += intResult + " ]";
		return stringResult;
	}
	
	public int power(int num, int x) {
		if(x==0) {
			return 1;
		}
		if(x==1) {
			return num;
		}
		
		return num*power(num, x-1);
	}	
}
















