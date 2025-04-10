package calculator;

public class Calculator {
	double n1;
	double n2;
	
	public Calculator(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public double add() {
		return n1 + n2;	
	}
	
	public double subtract() {
		return n1 - n2;
	}
	
	public double divide() {
		if (n2 == 0) {
			System.out.println("Error: Division by Zero");
		}
		return n1 / n2;
		
	}
	public double multiply() {
		return n1 * n2;
		
	}
	
	
}
