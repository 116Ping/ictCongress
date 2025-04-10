package primeNumber;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-----Prime Number Checker-----\n");
		
		System.out.print("Enter a number: ");
		int input = scan.nextInt();
		
		if(PrimeNumber.IsPrimeNumber(input)) {
			System.out.println(input + " is a Prime Number");
		}else {
			System.out.println(input + " is a NOT Prime Number");
		}
		scan.close();
	}

}
