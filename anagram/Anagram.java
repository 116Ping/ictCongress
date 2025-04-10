package anagram;

import java.util.Arrays;

public class Anagram {
	public static boolean IsAnagram(String str1, String str2){
		char[] arry1 = str1.toCharArray();
		char[] arry2 = str2.toCharArray();
		
		Arrays.sort(arry1);
		Arrays.sort(arry2);
		
		
		return Arrays.equals(arry1, arry2);
	}
}
