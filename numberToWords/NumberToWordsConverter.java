package numberToWords;

public class NumberToWordsConverter {
	
	String[] units = {
	        "zero", "one", "two", "three", "four", "five", "six",
	        "seven", "eight", "nine", "ten", "eleven", "twelve",
	        "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
	        "eighteen", "nineteen"
	    };

	    String[] tens = {
	        "", "", "twenty", "thirty", "forty", "fifty",
	        "sixty", "seventy", "eighty", "ninety"
	    };

	    public String convert(int num) {
	        if (num < 20)
	            return units[num];
	        else if (num < 100)
	            return tens[num / 10] + (num % 10 != 0 ? " " + units[num % 10] : "");
	        else if (num < 1000)
	            return units[num / 100] + " hundred" + (num % 100 != 0 ? " " + convert(num % 100) : "");
	        else if (num <= 9999)
	            return units[num / 1000] + " thousand" + (num % 1000 != 0 ? " " + convert(num % 1000) : "");
	        else
	            return "Out of range";
	    }
}
