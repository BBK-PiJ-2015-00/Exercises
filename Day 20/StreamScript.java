import java.util.*;
import java.util.stream.*;

public class StreamScript {
	public static void main(String[] args) {
		StreamScript instance = new StreamScript();
		instance.launch();
	}
	
	private void launch() {
		List<String> words = createList();
		Stream<String> myStream = words.stream();
		myStream.forEach((str) -> System.out.println(str));
		
		Stream<String> myStream = words.stream();
	}
	
	private List<String> createList() {		
		List<String> result = new ArrayList<String>();
		
		result.add("hello");
		result.add("bonjour");
		result.add("conbanwa");
		result.add("good night");
		result.add("bon soire");
		result.add("oyasumi");
		result.add("thank you");
		result.add("merci");
		result.add("arigato");
		
		return result;
	}
	
	
	
}