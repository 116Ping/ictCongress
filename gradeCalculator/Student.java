package gradeCalculator;
import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Subject> subjects;
	
	public Student(String name) {
		this.name = name;
		this.subjects = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void addSubject(Subject subject) {
		subjects.add(subject);
	}
	
	public double calculateAverage() {
		if (subjects.isEmpty()) return 0.0;
		
		double total = 0.0;
		for (Subject subject : subjects) {
			total += subject.getGrade();	
		}
		return total / subjects.size();
	}
	
	public void printReport() {
		System.out.println("\n--- Grade Report for " + capitalize(name) + " ---");
		for (Subject subject : subjects) {
            System.out.printf("%s: %.2f\n", capitalize(subject.getSubjectName()), subject.getGrade());
        }

        double average = calculateAverage();
        System.out.printf("Average Grade: %.2f\n", average);
        System.out.println("Final Remark: " + getRemarks(average));
	}
	
	private String getRemarks(double average) {
        if (average >= 90) return "Excellent";
        else if (average >= 80) return "Very Good";
        else if (average >= 70) return "Good";
        else if (average >= 60) return "Satisfactory";
        else return "Needs Improvement";
    }
	
	private String capitalize(String str) {
	    if (str == null || str.isEmpty()) return str;
	    return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
	
	
}
