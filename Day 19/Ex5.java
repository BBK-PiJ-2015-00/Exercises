import java.util.*;

public class Ex5 {
	public static void main(String[] args) {
		Ex5 instance = new Ex5();
		instance.launch();
	}
	
	public void launch() {
		List<String> words = createList();
		
		List<String> shortWords = StringUtils.allMatches(words,s -> s.length() < 4);
		List<String> wordsWithB = StringUtils.allMatches(words,s -> s.contains("b"));
		List<String> evenLengthWords = StringUtils.allMatches(words,s -> (s.length() % 2) == 0);
		
		printList(shortWords);
		printList(wordsWithB);
		printList(evenLengthWords);
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
	
	private void printList(List<String> list) {
		System.out.println("new list");
		
		for(String str : list) {
			System.out.println(str);
		}
	}
}