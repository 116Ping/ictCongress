package sentenceReverse;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-----Sentence Reverse-----\n");
		
		System.out.print("Enter a sentence to reverse: ");
		String input = scan.nextLine();
		
		System.out.println("\nThe reversed word:");
		System.out.println(SentenceReverse.Reverse(input));
		
		scan.close();
	}

}
