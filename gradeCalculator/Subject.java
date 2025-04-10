package gradeCalculator;

public class Subject {
	private String subjectName;
	private double grade;
	
	public Subject(String subjectName, double grade) {
		this.subjectName = subjectName;
		this.grade = grade;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
}
