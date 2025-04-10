package numberToWords;
import java.util.*;
import java.util.Arrays;



public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number (0 - 9999): ");
        int number = scan.nextInt();

        if (number < 0 || number > 9999) {
            System.out.println("Number out of range!");
        } else {
            NumberToWordsConverter converter = new NumberToWordsConverter();
            String words = converter.convert(number);
            System.out.println("In words: " + words);
        }
       scan.close(); 
	}
}
