package calculator;
import java.util.*;
import java.text.*;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Expression e.g(3 + 5): ");
		String characters = scan.nextLine();
		String[] input = characters.split(" ");
		
		double num1 = Double.parseDouble(input[0]);
		String op = input[1];
		double num2 = Double.parseDouble(input[2]);
		
		Calculator calc = new Calculator(num1, num2);
		double result = 0;
		
		switch (op) {
		case "+":
			result = calc.add();
			break;
		case "-":
			result = calc.subtract();
			break;
		case "/":
			result =calc.divide();
			break;
		case "*":
			result = calc.multiply();
			break;
		default:
			System.out.println("Invalid Expression. Try again!");
			scan.close();
			return;
		}
		
		DecimalFormat df = new DecimalFormat();
		System.out.println("The result of: " + df.format(num1) +
		 op + df.format(num2) + " is " + df.format(result));
		
		scan.close();
	}

}
