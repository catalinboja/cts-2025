package ro.ase.csie.cts.models;
import java.util.ArrayList;

public class Student {
	
	public static final int MIN_AGE = 14;
	public static final int MAX_AGE = 90;
	public static final int MIN_GRADE = 1;
	public static final int MAX_GRADE = 10;
	public static final int MIN_NAME_SIZE = 3;
	public static final int MAX_NAME_SIZE = 255;
	
	protected String name;
	protected int age;
	private ArrayList<Integer> grades;
	
	
	public Student(String name, int age, ArrayList<Integer> grades) {
		super();
		this.name = name;
		this.age = age;
		this.grades = grades;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if(age < Student.MIN_AGE) {
			throw new ro.ase.csie.cts.exceptions.InvalidAgeException();
		}
		this.age = age;
	}


	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}
	
	
	
	public ArrayList<Integer>  getGrades() {
		return this.grades;
	}
	
	public int getGrade(int index) {
		return this.grades.get(index);
	}
	
	public int getNoGrades() {
		return this.grades.size();
	}
	
	
	public float getGradesAverage() {
		int sum = 0;
		for(int grade : this.grades) {
			sum += grade;
		}
		return (float)sum/this.grades.size();
	}
	
}
