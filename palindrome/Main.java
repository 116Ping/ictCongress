package palindrome;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-----Palindrome Checker-----\n");
		
		System.out.print("Enter a word: ");
		String input = scan.nextLine();
		
		if(Palindrome.isPalindrome(input)) {
			System.out.println(input + " is a Palindrome");
		}else {
			System.out.println(input + " is NOT Palindrome");
		}
		scan.close();
	}

}
