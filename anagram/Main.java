package anagram;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-----Anagram Checker-----\n");
		System.out.print("Enter 1st word: ");
		String input1 = scan.nextLine().toLowerCase();
		
		System.out.print("\nEnter 2nd word: ");
		String input2 = scan.nextLine().toLowerCase();
		
		if(Anagram.IsAnagram(input1, input2)) {
			System.out.println(input1 + " and " + input2 + " is Anagram");
		}else {
			System.out.println(input1 + " and " + input2 + " is not a valid Anagram");
		}
		
		scan.close();
	}

}
