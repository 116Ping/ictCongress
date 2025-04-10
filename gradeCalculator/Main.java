package gradeCalculator;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("-----Grade Calculator-----\n");
		
		System.out.print("Enter name: ");
		String name = scan.nextLine();
		Student student = new Student(name);
		
		while(true) {
			System.out.print("Enter Subject Name (Enter done if Finished): ");
			String subjectName = scan.nextLine();
			
			if (subjectName.equalsIgnoreCase("done")) {
				break;
			}
			
			System.out.print("\nEnter "+subjectName+" Grade: " );
			while (!scan.hasNextDouble()) {
                System.out.print("Invalid input. Enter a numeric grade: ");
                scan.next();
            }
            double score = scan.nextDouble();
            scan.nextLine();
            
			
			Subject subject = new Subject(subjectName, score);
			student.addSubject(subject);
		}
		
		student.printReport();
		scan.close();
		
		

	}

}
