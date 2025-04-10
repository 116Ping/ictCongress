package ictcPractice;

class Person{
	private String name;
	private int age;
	
	Person(){
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName() {
		this.name = name;

	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void display() {
		System.out.println("Name: " + this.getName() + "\nAge: " + this.getAge());
	}
	
}
