package sentenceReverse;

public class SentenceReverse {
	public static String Reverse(String str) {
		String [] words = str.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		for(int i = words.length -1;i >= 0;i--) {
			result.append(words[i]).append(" ");
		}
		return result.toString();
	}
}
