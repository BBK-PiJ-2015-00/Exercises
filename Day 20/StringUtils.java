import java.util.function.Predicate;
import java.util.function.Function;
import java.util.*;

public class StringUtils {
	public static <T> List<T> allMatches (List<T> list, Predicate<T> pred) {
		List<T> result = new ArrayList<T>();
			
		for(int i = 0; i < list.size(); i++) {
			T str = list.get(i);
			if(pred.test(str)) {
				result.add(str);
			}
		}			
		return result;
	}
	
	public static <T> List<T> transformedList(List<T> list, Function<T,T> func) {
		List<T> result = new ArrayList<T>();
		
		for(int i = 0; i < list.size(); i++) {
			result.add(func.apply(list.get(i)));
		}		
		return result;
	}
}