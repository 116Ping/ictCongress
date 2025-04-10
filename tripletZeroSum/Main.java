package tripletZeroSum;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the array:");
        String input = scanner.nextLine();
        int[] arr = Arrays.stream(input.split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();

        TripletWithZeroSum.findTriplets(arr);
        scanner.close();
    }

}


