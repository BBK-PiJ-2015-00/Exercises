import java.util.*;

public class Ex7 {
	public static void main(String[] args) {
		Ex7 instance = new Ex7();
		instance.launch();
	}
	
	public void launch() {
		List<String> words = createList();
		
		List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
		List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
		List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
		
		printList(excitingWords);
		printList(eyeWords);
		printList(upperCaseWords);
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