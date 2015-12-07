import java.util.function.Predicate;
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
}