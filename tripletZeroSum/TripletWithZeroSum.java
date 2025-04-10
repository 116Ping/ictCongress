package tripletZeroSum;
import java.util.*;

public class TripletWithZeroSum {

    public static void findTriplets(int[] arr) {
        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < arr.length - 2; i++) {
            int start = i + 1, end = arr.length - 1;
            while (start < end) {
                int sum = arr[i] + arr[start] + arr[end];
                if (sum == 0) {
                    result.add(Arrays.asList(arr[i], arr[start], arr[end]));
                    start++;
                    end--;
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        if (result.isEmpty()) {
            System.out.println("No triplets found.");
        } else {
            System.out.println("Unique triplets that sum to zero:");
            for (List<Integer> triplet : result) {
                Collections.sort(triplet);
                System.out.println(triplet);
            }
        }
    }
 
    
    
}
