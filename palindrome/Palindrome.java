package palindrome;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
//        int left = 0, right = str.length() - 1;
//
//        while (left < right) {
//            if (str.charAt(left) != str.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
		
		String reverseSb = new StringBuilder(str).reverse().toString();
		return str.equals(reverseSb);
    }
	
}
